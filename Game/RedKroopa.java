import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object RedKroopa
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class RedKroopa extends Actor
{
    GifImage leftKroopaAnimation = new GifImage("left_kroopa.gif"); //Speichern des Gifs in einer Variabel
    GifImage rightKroopaAnimation = new GifImage("right_kroopa.gif"); //Speichern des Gifs in einer Variabel
    
    //Definierung der Variablen mit Datentypen
    private int decideAnimation = 0;
    private int gravitySpeed;

    public void act()
    {
        // Abruf der Methoden
        walk();
    }
    
    private void walk(){
      if(this.getX() == 965){ //Wenn der Aktor RedKroopa bei der Koordinate 965 bei der X Achse ist
          decideAnimation++;  //Variabel aufzählen
          jumpAction();  
        
      }
      
      if(this.getX() == 1114){ //Wenn der Aktor RedKroopa bei der Koordinate 1114 bei der X Achse ist
          decideAnimation--; //Variabel nach unten zählen
          
        
      }
      
      if(decideAnimation == 1){
        setImage(rightKroopaAnimation.getCurrentImage()); //Setze das Gif
        move(1);
        
      }else{
        setImage(leftKroopaAnimation.getCurrentImage()); //Setze das Gif
        move(-1);  
        
      }
        
    
    }
    
    private void jumpAction(){
        gravitySpeed = -10; //Setzen der Sprunghöhe
        this.gravitySystem(); //Auf Aktor Mario die Methode gravitySpeed nutzen
    
    }
    
    private void gravitySystem(){
        this.setLocation(this.getX() + 2, this.getY() + gravitySpeed); //Speichere die Koordinaten X und Y und zähle bei der Koordinate Y + die Variable gravitySpeed dazu
        gravitySpeed++; //Zähle zu der Variable 1 dazu.
    
    
    }
    

}
