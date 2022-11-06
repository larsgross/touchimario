import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * After success in Level1, starting in Level2
 * 
 * @author (Lars Gross, Vithun Kandeepan) 
 * @version (1.0.1)
 */
public class Level2 extends World
{
    //Definierung der Variablen mit Datentypen
    private int num;
    private int cordY;
    private int cordX;
    private int checkObjects;
    private int calc;
    private int add;
 
    public Level2()
    {    
        super(1200, 800, 1); // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel.
        setBackground("images/background.PNG"); //Platzieren des Hintergrundes
        
        //Abruf der Methode
        spawnGround();
        spawndarkConstruction();
        spawndarkConstruction2();
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
    num = 2; //Wieviel mal soll das Objekt gesetzt werden
    
    //Bei welchen Koordinaten fängt es an
    cordY = 547;
    cordX = 385;
    
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
    
    private void spawndarkConstruction2(){
    num = 8; //Wieviel mal soll das Objekt gesetzt werden
    
    //Bei welchen Koordinaten fängt es an
    cordY = 467;
    cordX = 634;
    
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
        Coin coin = new Coin(); //Neues Objekt wird erzeugt
        addObject(coin, 439, 488); //Objekt wird platziert
        Coin coin2 = new Coin(); //Neues Objekt wird erzeugt
        addObject(coin2, 714, 403); //Objekt wird platziert
    
    
    }
    
    private void spawnPlayer(){
        Mario mario = new Mario(); //Neues Objekt wird erzeugt
        addObject(mario, 69, 630); //Objekt wird platziert
        
    
    }
    
    private void spawnEnemy(){
        Kroopa kroopa = new Kroopa(); //Neues Objekt wird erzeugt
        addObject(kroopa, 918, 397); //Objekt wird platziert
        
        Kroopa kroopa2 = new Kroopa(); //Neues Objekt wird erzeugt
        addObject(kroopa2, 1017, 666); //Objekt wird platziert
        
    
    }
    
    private void displayText(){
        showText("Coins: " + Mario.coinCounter, 70, 40); //Der Text wird im Spiel angezeigt  
        
    
    }
}
