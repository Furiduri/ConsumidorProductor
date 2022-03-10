/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procon;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author Jorge Perez
 */
public class Productor extends Thread{
    private JLabel _lbl;
    private int _id;
    private final ImageIcon _icon01 = new ImageIcon(getClass().getResource("/procon/resources/pr01.png"));
    private final ImageIcon _icon02 = new ImageIcon(getClass().getResource("/procon/resources/pr02.png"));
    private Inventario _Inventario;
    
    public JLabel getLbl() {
        return _lbl;
    }

    public void setLbl(JLabel _lbl) {
        this._lbl = _lbl;
    }

    public Productor(int _id, Inventario inventario) {              
        this._lbl = new JLabel(_icon01);
        this._lbl.setName("pr"+String.valueOf(_id));        
        this._id = _id;
        this._Inventario = inventario;
    }  
    
    @Override
    public void run() {  
        try {
            Producto item = _Inventario.AddItem();
            sleep(item.getTime());
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
    
    protected void finalize() {
        System.out.println("Object is garbage collected.");
    }
}
