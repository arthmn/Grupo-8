/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labengsw;
/**
 *
 * @author Arthur
 */
public class Controlador {
    Interface mainwindow;
    InterfaceImage imagewindow;
    Processador processer;
    
    // InterfaceResult resultwindow;
    
    String path;
    Integer[] matriz;
    
    public Controlador(Interface mainwindow) {
        this.mainwindow = mainwindow;
        
        this.mainwindow.addListenerBttnProcessar(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                imagewindow = new InterfaceImage();
                acionar();
            }
        });
    }
    
    private void acionar() {
        this.path = mainwindow.path;
        mainwindow.dispose();
        
        imagewindow.setImageIcon(path);
        imagewindow.setVisible(true);
        
        acionarProcessador();
        acionarAutomato();
        acionarGramatica();
        
        // imagewindow.dispose();
        // resultwindow.setVisible();
    }
    
    private void acionarProcessador() {
        matriz = processer.calcularMatriz(path); 
    }
    
    private void acionarAutomato() {
        
    }
    
    private void acionarGramatica() {
        
    }
}
