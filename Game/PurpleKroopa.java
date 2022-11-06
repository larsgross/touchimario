import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object PurpleKroopa
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class PurpleKroopa extends Actor
{

    public void act()
    {
        // Abruf der Methoden
        walk();
        atEnd();
    }
    
    private void walk(){
            move(-3); //Objekt läuft nach Links
    
            
    }
    
    private void atEnd(){
        if(isAtEdge()){ //Wenn das Objekt den rand von der Welt berührt.
            getWorld().removeObject(this); //Dieses Objekt entfernen
        
        
        }
    
    
    }
    
}
