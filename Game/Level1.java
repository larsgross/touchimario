import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Level1 extends World
{
    //Definierung der Variablen mit Datentypen
    private int num;
    private int cordY;
    private int cordX;
    private int checkObjects;
    private int calc;
    private int add;
    public Level1()
    {    
        super(1200, 800, 1); // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel.
        setBackground("images/background.PNG"); //Platzieren des Hintergrundes
        
        //Abruf der Methoden
        spawnClouds();
        spawnGround();
        spawnbrightConstruction();
        spawnTube();
        spawnPlayer();
        spawnEnemy();
        displayText();
    }
    
    public void act(){
        displayText(); //Das der counter immer wieder aktualisiert wird0a
    }
    
    private void spawnClouds(){
        //Die Wolken werden erzeugt und an die Koordinaten gesetzt
        addObject(new Cloud(), 235, 194);
        addObject(new Cloud(), 512, 89);
        addObject(new Cloud(), 741, 242);
        addObject(new Cloud(), 1037, 152);    
    
    }
    
    private void spawnGround(){
        num = 7; //Wieviel mal soll das Objekt gesetzt werden
        //Bei welchen Koordinaten fängt es an
        cordY = 704;
        cordX = 96;
        checkObjects = getObjects(Ground.class).size(); //Wieviele von der Klasse Ground sind in der Welt
        
        while(checkObjects < num){ //Abfrage wenn es weniger sind als in num
            add = 168; //Koordinaten dazu gezählt werden
            Ground ground = new Ground(); //Neues Objekt wird erzeugt
            addObject(ground, cordX, cordY); //Objekt wird platziert
            
            calc = cordX + add; //Die Variable wird geupdated für den nächsten durchlauf, dass das Objekt nicht nochmals an dem gleichen Ort platziert wird
            cordX = calc; //CordX wird den Wert von calc erlangen
            checkObjects++; //Nummerierung für den Durchlauf
        
        }
        
    }
    
    private void spawnbrightConstruction(){
        num = 3; //Wieviel mal soll das Objekt gesetzt werden
        //Bei welchen Koordinaten fängt es an
        cordY = 535;
        cordX = 451;
        checkObjects = getObjects(BrightConstruction.class).size(); //Wieviele von der Klasse Ground sind in der Welt
        
        while(checkObjects < num){ //Abfrage wenn es weniger sind als in num
            add = 65; //Koordinaten dazu gezählt werden
            BrightConstruction brightConstruction = new BrightConstruction(); //Neues Objekt wird erzeugt
            addObject(brightConstruction, cordX, cordY); //Objekt wird platziert
            calc = cordX + add; //Die Variable wird geupdated für den nächsten durchlauf, dass das Objekt nicht nochmals an dem gleichen Ort platziert wird
            cordX = calc; //CordX wird den Wert von calc erlangen
            checkObjects++; //Nummerierung für den Durchlauf
            
        
        }
    
    }
    
    private void spawnTube(){
        Tube tube = new Tube(); //Neues Objekt wird erzeugt
        addObject(tube, 930, 650); //Objekt wird platziert
    
    
    }
    
    private void spawnPlayer(){
        Mario mario = new Mario(); //Neues Objekt wird erzeugt
        addObject(mario, 69, 630); //Objekt wird platziert
        
    
    }
    
    private void spawnEnemy(){
        Kroopa kroopa = new Kroopa();
        addObject(kroopa, 789, 666);
    
    
    }
    
    private void displayText(){
        showText("Coins: " + Mario.coinCounter, 70, 40); //Der Text wird im Spiel angezeigt   
        
    
    }
}
