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
public class TextIsBlack implements IMessage{
    private final int distance;

    public TextIsBlack(int distance) {
        this.distance = distance;
    }
        
    @Override
    public void changeColor(String color) {
        switch (color){
            case "Black":
                System.out.println("Distance is " + distance + " ==> No change in color");
                break;
            case "Blue":
                System.out.println("Distance is " + distance + " ==> Text is Black now!");
                break;
            default:
                System.out.println("Distance is " + distance + " ==> Text is Black now!");
                break;   
        }                
    }
}
