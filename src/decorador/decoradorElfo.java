/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class decoradorElfo extends Decorador implements KeyListener {
    
    private int x;
    private int y;

    public decoradorElfo(JLabel jlabel){
        super(jlabel);
        this.x = jlabel.getX();
        this.y = jlabel.getY();
        jlabel.addKeyListener(this);
    }

    
    
    @Override
    public void añadeLabel() {
        super.decoradoPersonaje.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
                switch (key){
                    case KeyEvent.VK_LEFT:
                        x = x - 2;
                        System.out.println("funciona :v");
                        break;
                    case KeyEvent.VK_RIGHT:
                        x = x + 2;
                        System.out.println("funciona :v");        
                        break;
                    case KeyEvent.VK_UP:
                        y = y + 2;
                        System.out.println("funciona :v");
                        break;
                    case KeyEvent.VK_DOWN:
                        y = y - 2;
                        System.out.println("funciona :v");
                        break;    
    }
    super.decoradoPersonaje.setLocation(x, y);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
