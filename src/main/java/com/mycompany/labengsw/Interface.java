/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.labengsw;

import java.awt.Color;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Arthur
 */

public class Interface extends javax.swing.JFrame {
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnCarregar = new javax.swing.JButton();
        panelImg = new javax.swing.JPanel();
        lblMsgImg = new javax.swing.JLabel();
        bttnProcessar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        bttnCarregar.setText("Carregar");
        bttnCarregar.setToolTipText("");
        bttnCarregar.setName("Carregar"); // NOI18N
        bttnCarregar.addActionListener(this::bttnCarregarActionPerformed);

        panelImg.setBackground(new java.awt.Color(204, 204, 204));
        panelImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelImg.setToolTipText("");
        panelImg.setAutoscrolls(true);
        panelImg.setEnabled(false);
        panelImg.setName(""); // NOI18N

        lblMsgImg.setText("Carregue uma imagem");
        lblMsgImg.setName("lblMsgImg"); // NOI18N

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblMsgImg)
                .addGap(28, 28, 28))
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(lblMsgImg)
                .addGap(59, 59, 59))
        );

        bttnProcessar.setText("Processar");
        bttnProcessar.setEnabled(false);
        bttnProcessar.setName("Processar"); // NOI18N

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(bttnCarregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnProcessar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCarregar)
                    .addComponent(bttnProcessar))
                .addGap(53, 53, 53))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    File file;
    String path;
    
    private void bttnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarregarActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new ImageFilter());
        fc.setAcceptAllFileFilterUsed(false);
        if (evt.getSource().equals(bttnCarregar)) { 
            int returnVal = fc.showOpenDialog(Interface.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                path = fc.getSelectedFile().getAbsolutePath();
                if (file == null) {
                    lblMsgImg.setText("Erro ao carregar imagem");
                    lblMsgImg.setForeground(Color.RED);
                    return;
                } 
                String extension = Utils.getExtension(file);
                if (!Utils.extensaoPermitida(extension)) {
                    lblMsgImg.setText("Arquivo de formato inválido! Selecione uma imagem");
                    lblMsgImg.setForeground(Color.RED);
                } else {
                    lblMsgImg.setText("Imagem " + file.getName() + " carregada com êxito");
                    lblMsgImg.setForeground(Color.GREEN);
                    bttnProcessar.setEnabled(true);
                    bttnCarregar.setFocusable(false);
                    bttnProcessar.setFocusable(true);
                }
            }  else {
                lblMsgImg.setText("Operação cancelada pelo usuário");
                lblMsgImg.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_bttnCarregarActionPerformed

    
    public void addListenerBttnProcessar(java.awt.event.ActionListener listener) {
        bttnProcessar.addActionListener(listener);
    }
    /*    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCarregar;
    private javax.swing.JButton bttnProcessar;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblMsgImg;
    private javax.swing.JPanel panelImg;
    // End of variables declaration//GEN-END:variables
}
