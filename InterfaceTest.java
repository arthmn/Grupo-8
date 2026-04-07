
import com.mycompany.labengsw.Interface;
import java.awt.Color;
import java.io.File;
import org.assertj.swing.finder.JFileChooserFinder;
import org.assertj.swing.fixture.JFileChooserFixture;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.edt.GuiActionRunner;
import org.junit.*;

/**
 *
 * @author Arthur
 */
public class InterfaceTest {
    private FrameFixture window;
 
    @Before
    public void setUp() {
        Interface frame = GuiActionRunner.execute(() -> {
            Interface i = new Interface();
            i.setVisible(true); // importante!
            return i;
        });

        window = new FrameFixture(frame);
        window.robot();
        window.show(); 
    }
    
    @Test
    public void configuracaoInicial() {
        window.button("Processar").requireDisabled();
        window.label("lblMsgImg").requireText("Carregue uma imagem");
        window.button("Carregar").click();
    }
    
    @Test
    public void cancelarCarregar() {
        window.label("lblMsgImg").requireText("Carregue uma imagem");
        window.button("Carregar").click();
        JFileChooserFixture fileChooser = JFileChooserFinder.findFileChooser().withTimeout(5000).using(window.robot());
        fileChooser.cancel();
        window.label("lblMsgImg").requireText("Operação cancelada pelo usuário");
        window.label("lblMsgImg").foreground().equals(Color.RED);
        window.button("Processar").requireDisabled();
    }
    
    @Test
    public void carregarArquivoCerto() {
        File file = new File("C:\\Users\\Arthur\\Documents\\Mackenzie\\6º Semestre\\Lab de Engenharia de Software\\Projeto\\LabEngSw\\src\\test\\java\\imagem.jpg");
        window.button("Carregar").click();
        JFileChooserFixture fileChooser = JFileChooserFinder.findFileChooser().using(window.robot());
        fileChooser.selectFile(file);
        fileChooser.approve();
        window.label("lblMsgImg").requireText("Imagem " + file.getName() + " carregada com êxito");
        window.label("lblMsgImg").foreground().equals(Color.GREEN);
        window.button("Processar").requireEnabled();
        window.button("Processar").click();
    }
    
    @Test
    public void carregarArquivoErrado() {
        File file = new File("C:\\Users\\Arthur\\Documents\\Mackenzie\\6º Semestre\\Lab de Engenharia de Software\\Projeto\\LabEngSw\\src\\test\\java\\documento.pdf");
        window.button("Carregar").click();
        JFileChooserFixture fileChooser = JFileChooserFinder.findFileChooser().withTimeout(5000).using(window.robot());
        fileChooser.selectFile(file);
        fileChooser.approve();
        window.label("lblMsgImg").requireText("Arquivo de formato inválido! Selecione uma imagem");
        window.label("lblMsgImg").foreground().equals(Color.RED); 
        window.button("Processar").requireDisabled();
    }
    @Test
    public void focarBotao() {
        window.button("Carregar").requireFocused();
        File file = new File("C:\\Users\\Arthur\\Documents\\Mackenzie\\6º Semestre\\Lab de Engenharia de Software\\Projeto\\LabEngSw\\src\\test\\java\\imagem.jpg");
        window.button("Carregar").click();
        JFileChooserFixture fileChooser = JFileChooserFinder.findFileChooser().using(window.robot());
        fileChooser.selectFile(file);
        fileChooser.approve();
        window.button("Processar").requireFocused();
    }
    
    @After
    public void tearDown() {
        window.cleanUp();
    }
    
    
    
}
