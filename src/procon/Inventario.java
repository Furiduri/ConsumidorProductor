/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procon;


import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Furiduri
 */
public class Inventario{
    private int _Max;
    private List<Producto> _Bodega; 
    private JPanel _Panel;

    public Inventario(int _Max, JPanel panel) {
        this._Max = _Max;
        this._Bodega = new ArrayList<Producto>();
        this._Panel = panel;
    }
    
    public Producto AddItem(){
        if(_Bodega.size() >= _Max){
            return null;
        }else{
           return this.AddProducto();  
        }
    }    
    
    public long GetItem(){
        if(!_Bodega.isEmpty()){
            Producto item = _Bodega.remove(_Bodega.size()-1);            
            _Panel.remove(item.getLbl());
            _Panel.revalidate();
            _Panel.repaint();
            long time = item.getTime();
            item = null;
            Log.send("Remove Producto");
            return time;
        }else{
            return -1;
        }
    }
    
    public void RestarMax(int val){
        _Max= val;
        int cantP = _Bodega.size();
        for (int i = 0; i < cantP; i++) {
            this.GetItem();
        }
    }
    
    public int AddMax(){
        if(_Max <= 100)
            _Max++;
        return _Max;
    }    
    
    public int ResMax(){
        if(_Max > 0)
            _Max--;
        
        return _Max;
    }
    private Producto AddProducto(){                
        long time = ((long)(Math.random()*(3000-1000+1)+1000));
        Producto pr = new Producto(_Bodega.size(),time);        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);         
        constraints.gridx = _Bodega.size()%4;
        constraints.gridy = (int)(_Bodega.size()/4);          
        this._Panel.add(pr.getLbl(), constraints);         
        this._Panel.revalidate();
        this._Panel.repaint();
        _Bodega.add(pr);   
        Log.send("Add Producto");
        return pr;
    }
}
