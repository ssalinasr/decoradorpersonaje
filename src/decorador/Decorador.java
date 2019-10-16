/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import java.awt.Color;
import javax.swing.JLabel;


/**
 *
 * @author sebas
 */
public abstract class Decorador {
    
    public JLabel decoradoPersonaje;

    
    public Decorador(JLabel jlabel){
        this.decoradoPersonaje = jlabel; 
    }
    
    public abstract void añadeLabel();
    
}
