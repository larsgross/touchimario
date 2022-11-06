import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kroopa here.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Kroopa extends Actor
{
    GifImage kroopaAnimation = new GifImage("kroopa.gif"); //Erzeugen eines Objektes für die Animation
    
    //Definierung der Variablen mit Datentypen
    private int gravitySpeed;
    public void act()
    {
        //Abruf der Methode
        kroopaAnimation();
        checkGravity();
        walk();
    }
    
    private void kroopaAnimation(){
        setImage(kroopaAnimation.getCurrentImage()); //Setze das Gif

    
    }
    
    public void walk(){
        String worlds = getWorld().getClass().getName(); //Bekomme den Namen der aktuellen Welt
        if (worlds == "Level1" || worlds == "Level2"){
            move(-1);
        
        }
        
        if(worlds == "Level3"){
            if(isTouching(Ground.class)){
                move(-1);
            
            
            }
            
            if(isTouching(Ground.class)){
                move(-1);
                
            
            }
        
        
        }
    
    
    }
    
    private void gravitySystem(){
        this.setLocation(this.getX(), this.getY() + gravitySpeed); //Speichere die Koordinaten X und Y und zähle bei der Koordinate Y + die Variable gravitySpeed dazu
        gravitySpeed++; //Zähle zu der Variable 1 dazu.
    
    
    }
    
    public boolean onGround(){
        Actor brightConstruction;
        brightConstruction = this.getOneObjectAtOffset(0, 77, BrightConstruction.class);
        
        Actor darkConstruction;
        darkConstruction = this.getOneObjectAtOffset(0, 77, DarkConstruction.class);
        
        Actor tube;
        tube = this.getOneObjectAtOffset(0, 90, Tube.class);
        
        if(brightConstruction != null || darkConstruction != null || tube != null){
            return true;
        
        
        }else{
            return false;
            
        
        }
    
    }
    
    public void checkGravity(){
        if(this.onGround() == true || this.getY() > 622){ //Abfrage wenn die Methode onGround() stimmt oder die Koordinaten von Mario grösser als 622 sind
            gravitySpeed = 0; 
            
            Actor plat;
            plat = this.getOneIntersectingObject(Ground.class);
            
            if(plat != null){
                this.setLocation(this.getX(), plat.getY()-35); //Bekomme die X Achse und Y Achse und subtrahiere von der Y Achse 75
                
            
            }
    
        }else{
        this.gravitySystem(); //Sollte die Kondition nicht erfüllt sein, dann rufe die gravitySystem Methode ab
        
    
        }
    }
}
