import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * After success in Level2, starting in Level3
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Level3 extends World
{
    //Definierung der Variablen mit Datentypen
    private int num;
    private int cordY;
    private int cordX;
    private int checkObjects;
    private int calc;
    private int add;
    
    public Level3()
    {    
        super(1200, 800, 1); // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel.
        setBackground("images/background.PNG"); //Platzieren des Hintergrundes
        
        //Abruf der Methode
        spawnGround();
        spawndarkConstruction();
        spawnCoins();
        spawnPlayer();
        spawnEnemy();
        displayText();
    }
    
    public void act(){
        displayText(); //Das der counter immer wieder aktualisiert wird
        
    
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
    
    private void spawndarkConstruction(){
        
    DarkConstruction darkConstruction1 = new DarkConstruction(); //Neues Objekt erzeugen
    addObject(darkConstruction1, 440, 565); //Objekt platzieren
    
    DarkConstruction darkConstruction2 = new DarkConstruction(); //Neues Objekt erzeugen
    addObject(darkConstruction2, 625, 579); //Objekt platzieren
    
    DarkConstruction darkConstruction3 = new DarkConstruction(); //Neues Objekt erzeugen
    addObject(darkConstruction3, 798, 463); //Objekt platzieren
        
    num = 6; //Wieviel mal soll das Objekt gesetzt werden
    
    //Bei welchen Koordinaten fängt es an
    cordY = 359;
    cordX = 981;
    
    checkObjects = getObjects(DarkConstruction.class).size(); //Wieviele von der Klasse Ground sind in der Welt
        
    while(checkObjects < num){ //Abfrage wenn es weniger sind als in num
        add = 65; //Koordinaten dazu gezählt werden
        DarkConstruction darkConstruction = new DarkConstruction(); //Neues Objekt wird erzeugt
        addObject(darkConstruction, cordX, cordY); //Objekt wird platziert
        calc = cordX + add; //Die Variable wird geupdated für den nächsten durchlauf, dass das Objekt nicht nochmals an dem gleichen Ort platziert wird
        cordX = calc; //CordX wird den Wert von calc erlangen
        checkObjects++; //Nummerierung für den Durchlauf
            
        
        }
    
    }
    
    private void spawnCoins(){
        Coin coin = new Coin(); //Neues Objekt erzeugen
        addObject(coin, 617, 522); //Objekt platzieren 
        
        Coin coin2 = new Coin(); //Neues Objekt erzeugen
        addObject(coin2, 786, 404); //Objekt platzieren
        
        Coin coin3 = new Coin(); //Neues Objekt erzeugen
        addObject(coin3, 874, 673); //Objekt platzieren
        
    
    }
    
    private void spawnPlayer(){
        Mario mario = new Mario(); //Neues Objekt erzeugen
        addObject(mario, 69, 630); //Objekt platzieren
    
    
    }
    
    private void spawnEnemy(){
        RedKroopa redkroopa = new RedKroopa(); //Neues Objekt erzeugen
        addObject(redkroopa, 965, 292); //Objekt platzieren
        Kroopa kroopa = new Kroopa(); //Neues Objekt erzeugen
        addObject(kroopa, 268, 669); //Objekt platzieren
        PurpleKroopa purplekroopa = new PurpleKroopa(); //Neues Objekt erzeugen
        addObject(purplekroopa, 1104, 654); //Objekt platzieren
        
    
    }
    
    private void displayText(){
        showText("Coins: " + Mario.coinCounter, 70, 40); //Der Text wird im Spiel angezeigt 
    
    
    }
}
