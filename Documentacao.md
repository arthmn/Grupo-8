Laboratório de Engenharia de Software
“Poesia Computacional de Memórias”

Integrante: Arthur Meneses Neves

## TG1

# Capítulo 1
### Introdução. Descrição breve do projeto.

O tema do projeto é "Poesia Computacional de Memórias". A meta principal do software desktop processual seria receber uma imagem (fotografia), transformá-la em autômatos celulares e retornar uma saída de proposições lógicas no formato de um texto simbólico. A longo prazo, o software seria como uma coleção de momentos importantes, permitindo que o usuário gerencie esses momentos e suas respectivas poesias de formas diversas.
O viés extensionista está na entropia entre a arte (poesia) e a computação clássica (linguística estrutural e matemática). Dessa forma, o programa promoveria questões como inovação (ODS 9) e saúde mental (ODS 3), ao convidar pessoas comuns a terem uma experiência reflexiva sobre a memória e o tempo, utilizando como base conceitos abstratos de computação.

# Capítulo 2
### Definição da demanda. 

## O problema ou oportunidade percebida e a razão ou justificativa para esta demanda
O problema percebido para a temática conceitual do projeto foi no sentimento generalizado de discordância entre as tecnologias modernas e o desaparecer de práticas outrora contemplativas num espectro mais difundido, sendo este o principal responsável pela causalidade dessa. Há de se reconhecer que a demanda e justificativa para essa demanda são tímidos, e é justamente nesse fator que encontra-se o viés do projeto em questão.

## A descrição sucinta do produto de software que será produzido
Sucintamente o produto é um software desktop puramente processual, com a capacidade coexistente de guardar os estados gerados. A principal operação está no ato de carregar um arquivo em formato de imagem e processá-lo. De extrema importância ao conceito da proposta do projeto está na forma em que o processamento ocorrerá; sendo esse por meio de autômatos celulares que promoverão a transformação visual decorrente, e por fim, resultando numa saída de texto simbólica, com base na análise dos dados da imagem para produção de proposições lógicas das regras impostas pela Gramática Livre de Contexto.
Utilizando jargões técnicos, o programa pode ser descrito como um pipeline de processamento de matrizes utilizando teoria dos autômatos, máquinas de estado finito e linguagens formais operando em arquitetura de baixo nível. A primeira etapa é a leitura de uma matriz binária, seguido do processamento de iterações de um autômato celular para simular degradação de dados e, com base na matriz, o uso uma Gramática Livre de Contexto predefinida para concatenar e imprimir uma string no terminal

## Identificar os clientes, usuários e demais envolvidos/impactados com o produto

## Descrever, em linhas gerais, quais as principais etapas necessárias para construir este produto
## Identificar os principais critérios de qualidade para o produto

# Capítulo 3
### Requisitos do produto. 

|Requisito|Descrição|
|---------|---------|
|RNF|O sistema deve ser composto de uma interface gráfica minimalista, que remete a sistema “antigos”|
|RF |O sistema deve permitir que o usuário carregue um arquivo em formato de imagem|
|RF |O sistema deve processar a imagem e gerar um texto simbólico|
|RNF|O sistema deve estabelecer um nível visualmente agradável e “mágico” e tecnicamente coeso durante o processo de transformação da imagem|
|RNF|O sistema deve estabelecer um período de tempo razoável e aleatório, mas não ultrapassando mais de 5 minutos, durante o processo|
|RNF|O sistema deve disponibilizar a saída textual na tela na forma de uma animação tênue e compassada, possibilitando uma absorção dinâmica do texto pelo usuário|
|RNF|O sistema deve retornar um texto aleatório, com base na análise dos tons da imagem e suas respectivas inferências com a GLC|
|RF |O sistema deve permitir as opções de salvar a saída gerada, e então nomeá-la, ou simplesmente descartá-la.|
|RF |O sistema deve permitir a navegação pela “biblioteca” de textos salvos, assim como a capacidade de repetidas vezes revisitar o processo de geração da imagem até a saída textual|

# Capítulo 4 
### Wireframes

# Capítulo 5
### Modelagem “leve do sistema”.

Casos de Uso
|Numero |Caso de Uso|
|----|----|
|UC01|Carregar uma imagem|
|UC02|Acionar etapa de processamento|
|UC03|Salvar processo gerado|
|UC04|Descartar processo gerado|
|UC05|Nomear processo salvo|
|UC06|Navegar pela biblioteca de processos salvos|
|UC07|Agrupar processos salvos|
|UC08|Mover processo salvo para dentro de uma pasta|
|UC09|Remover processo salvo de dentro de uma pasta|
|UC10|Excluir um processo salvo da biblioteca|

# Capítulo 6: 
### Descrição da arquitetura do sistema (modelo) e das ferramentas que serão utilizadas (linguagem de programação, frameworks, etc).

 A linguagem de programação usada para implementar lógica do programa será a linguagem Java, e a interface gráfica será feita por meio do framework Java Swing.
