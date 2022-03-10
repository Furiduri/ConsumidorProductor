/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jorge Perez
 */
public class Producto {
    private long _Time;
    private JLabel _lbl;    

    public JLabel getLbl() {
        return _lbl;
    }
    private final ImageIcon _icon01 = new ImageIcon(getClass().getResource("/procon/resources/producto.png"));
    
    public Producto(int index, long _Time) {
        this._Time = _Time;        
        this._lbl = new JLabel(_icon01); 
        this._lbl.setName("pr"+String.valueOf(index));        
    }

    public long getTime() {
        return _Time;
    }
    
    protected void finalize() {
        System.out.println("Object is garbage collected.");
    } 
}
