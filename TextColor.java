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
public class TextColor {
    private static String color="";
    private int distance;

    public TextColor(int distance) {
        this.distance = distance;
    }

    public void changeColor() {
        if ( distance>5){
            IMessage blackColor= new TextIsBlack(distance);
            blackColor.changeColor(color);
            color="Black";
        }
        else{
            IMessage blueColor= new TextIsBlue(distance);
            blueColor.changeColor(color);
            color="Blue";
        }
    }
   
}
