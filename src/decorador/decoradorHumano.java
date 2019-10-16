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
public class decoradorHumano extends Decorador{

    public decoradorHumano(JLabel jlabel){
        super(jlabel);
    }
    
    @Override
    public void añadeLabel() {
        int x = super.decoradoPersonaje.getX();
        int y = super.decoradoPersonaje.getY();
        super.decoradoPersonaje.setLocation(x+5, y-4);
    }
    
}
