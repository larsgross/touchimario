import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * displaying when you lose.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Over extends World
{

    /**
     * Constructor for objects of class Over.
     * 
     */
    public Over()
    {    
        super(1200, 800, 1); // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel.
        setBackground("images/gameover.png"); //Platzieren des Hintergrundes
        
        Greenfoot.playSound("lost.wav");  //Sound abspielen 
    }
}
