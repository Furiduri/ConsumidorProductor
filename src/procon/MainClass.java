/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procon;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import procon.vista.MainFrame;

/**
 *
 * @author Jorge Perez
 */
public class MainClass {

    public MainFrame _Frame = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        MainClass cMain = new MainClass();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                cMain._Frame = new MainFrame();
                cMain._Frame.setVisible(true);                
            }
        });
    }
}
