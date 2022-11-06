import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Coin extends Actor
{
    GifImage coinAnimation = new GifImage("coin.gif"); //Erzeugen eines Objektes für die Animation

    public void act()
    {
        //Abruf der Methode
        coinAnimation();
    }
    
    private void coinAnimation(){
        setImage(coinAnimation.getCurrentImage()); //Setze das Gif   
        
    
    }
}
