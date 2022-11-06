import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1) 
 */
public class Mario extends Actor
{
    GifImage marioAnimation = new GifImage("mariorun.gif"); //Erzeugen eines Objektes für die Animation
    
    //Definierung der Variablen mit Datentypen
    private int gravitySpeed;
    public static int coinCounter;
    public static String ratingCalc;
    public static String enemyCounter;
    
    public void act()
    {
        // Abruf der Methoden
        controlSystem();
        checkGravity();
        coinAction();
        newWorld();
        ratingSystem();
        enemyAction();
        
    }
    
    private void controlSystem(){
        if (Greenfoot.isKeyDown("D")){ //Abfrage wenn die Taste "D" gedrückt wird
            walkAction(); //Abruf der Methode
            
        
        }
        
        if (Greenfoot.isKeyDown("W")){ //Abfrage wenn die Taste "W" gedrückt wird
            if(this.onGround() == true || this.getY() > 622){ //Abfrage wenn er auf den Boden ist oder bei der Koordinate Y = 662
                this.jumpAction(); //Abruf der Methode
            
            }
                
        
        }
        
        if (Greenfoot.isKeyDown("S")){ //Abfrage wenn die Taste "D" gedrückt wird
            sinkIn(); //Abruf der Methode
            
        
        }
        
    
    }
    
    private void walkAction(){
        setImage(marioAnimation.getCurrentImage()); //Setze das Gif
        move(2); //Das Objekt geht mit der Geschwindigkeit 2 nach vorne
        
    
    }
    
    private void jumpAction(){
        gravitySpeed = -23; 
        this.gravitySystem();
    
    }
    
    private void gravitySystem(){
        this.setLocation(this.getX() + 2, this.getY() + gravitySpeed); //Speichere die Koordinaten X und Y und zähle bei der Koordinate Y + die Variable gravitySpeed dazu
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
                this.setLocation(this.getX(), plat.getY()-75); //Bekomme die X Achse und Y Achse und subtrahiere von der Y Achse 75
                
            
            }
    
        }else{
        this.gravitySystem(); //Sollte die Kondition nicht erfüllt sein, dann rufe die gravitySystem Methode ab
        
    
        }
    }
    
    public void coinAction(){
        if(isTouching(Coin.class)){ //Wenn Mario einen Coin berührt
            Actor coin = getOneIntersectingObject(Coin.class); 
            getWorld().removeObject(coin); //Lösche das Objekt Coin
            Mario.coinCounter++; //Füge 1 zu der Variable coinCounter hinzu
        
        }
        
    
    }
    
    public void enemyAction(){
        if(isTouching(Kroopa.class)){ //Abfrage wenn es Kroopa berührt
            Greenfoot.setWorld(new Over()); //Öffne die neue Welt    
        }
    }
    
    public boolean sinkInCheck(){
        Actor tube;
        tube = this.getOneObjectAtOffset(0, 90, Tube.class);
        
        if(tube != null){
            return true;    
        
        
        }else{
            return false;
        
        
        }
        
    
    }
    
    public void sinkIn(){
        if(sinkInCheck() == true){
            this.setLocation(this.getX(), this.getY()-95);    
            Greenfoot.setWorld(new Level3());        
        
        }
    
    
    }
    
    public void newWorld(){
        if(isAtEdge()){ //Abfrage wenn er am Ende der Welt steht
            String worlds = getWorld().getClass().getName(); //Bekomme den Namen der aktuellen Welt
            
            if (worlds == "Level1"){ //Abfrage wenn er in dieser Welt ist
                Greenfoot.setWorld(new Level2()); //Öffne die neue Welt
            
            
            }
            
            if (worlds == "Level2"){ //Abfrage wenn er in dieser Welt ist
                Greenfoot.setWorld(new Level3()); //Öffne die neue Weltc
            
            
            }
            
            if (worlds == "Level3"){ //Abfrage wenn er in dieser Welt ist
                Greenfoot.setWorld(new Won()); //Öffne die neue Welt
            
            
            }
            
        
        }
    
    
    }
    
    public void ratingSystem(){
        if(coinCounter == 5){
            ratingCalc = "3";
            
        
        }
        
        if(coinCounter == 4 || coinCounter == 3){
            ratingCalc = "2";
            
        
        }
        
        if(coinCounter == 2 || coinCounter == 1){
            ratingCalc = "1";
            
        
        }
        
        if(coinCounter == 0){
            ratingCalc = "0";
            
        
        }
        
    
    }
    
}
