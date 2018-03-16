/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystatepattern;

/**
 *
 * @author arash
 */
public class MyStatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int distance;
        TextColor txtColor= null;
        for (int i=0; i<10; i++){
            distance = (int) (Math.random()*10);
            txtColor= new TextColor(distance);
            txtColor.changeColor();
        }
    }
    
}
