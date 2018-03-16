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
public class TextIsBlue implements IMessage{
    private int distance;

    public TextIsBlue(int distance) {
        this.distance = distance;
    }
        
    @Override
    public void changeColor(String color) {
 //       System.out.println("it is in Blue state and distance is : "+ distance);
        switch (color){
            case "Blue":
                System.out.println("Distance is " + distance + " ==> No change in color");
                break;
            case "Black":
                System.out.println("Distance is " + distance + " ==> Text is Blue now!");
                break;
            default:
                System.out.println("Distance is " + distance + " ==> Text is Blue now!");
                break;   
        }
    }
}
