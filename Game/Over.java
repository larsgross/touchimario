import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
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
        setBackground("images/background.PNG"); //Platzieren des Hintergrundes 
        
        //Abruf der Methode
        OverText();
        
    }
    
    private void OverText(){
        showText("Game Over", 600, 150); //Der Text wird im Spiel angezeigt     
        showText("You lost :(", 600, 200); //Der Text wird im Spiel angezeigt  
    
    }
}
