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
public class Consumidor extends Thread {
    private JLabel _lbl;
    private int _id;
    private final ImageIcon _icon01 = new ImageIcon(getClass().getResource("/procon/resources/cs01.png"));
    private final ImageIcon _icon02 = new ImageIcon(getClass().getResource("/procon/resources/cs02.png"));

    public JLabel getLbl() {
        return _lbl;
    }

    public void setLbl(JLabel _lbl) {
        this._lbl = _lbl;
    }

    public Consumidor(int _id) {              
        this._lbl = new JLabel(_icon01);
        this._lbl.setName("cs"+String.valueOf(_id));        
        this._id = _id;
    }  
    
    @Override
    public void run() {
        
    }       
    
    protected void finalize() {
        System.out.println("Object is garbage collected.");
    }
}
