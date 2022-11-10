import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Display at End of the Game.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Won extends World
{

    /**
     * Constructor for objects of class Won.
     * 
     */
    public Won()
    {    
        super(1200, 800, 1); // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel.
        setBackground("images/background.PNG"); //Platzieren des Hintergrundes
        
        //Abruf der Methoden
        WonText();
        ratingStar();
    }
    
    private void WonText(){
        showText("You Won", 600, 150); //Der Text wird im Spiel angezeigt 
    
    
    }
    
    private void ratingStar(){
        showText("Stars: " + Mario.ratingCalc, 600, 200); //Der Text wird im Spiel angezeigt 
        
    
    }
}
