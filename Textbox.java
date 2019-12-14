import greenfoot.*;  

public class Textbox extends Actor
{
    private String bildDatei = "Textbox.png";
    private static int schriftgroesse = 15;
    private static int startX = 8;
    private static int startY = 5;
    private static greenfoot.Color farbe = greenfoot.Color.WHITE;
    
    private boolean fertig;
    
    public Textbox() {
        setImage(new GreenfootImage(bildDatei));
    }
    
    void setFertig(boolean f) {
        fertig = f;
    }
    public boolean gespraechfertig() {
        return fertig;
    }
    
    public void act() 
    {
    }    
    
    public void drawText(String sprecher, String satz) {
        String s = sprecher + ": " + satz;
        getImage().clear();
        setImage(new GreenfootImage(bildDatei));
        GreenfootImage neuerText = new GreenfootImage(s, schriftgroesse, farbe, null);
        getImage().drawImage(neuerText, startX, startY);
        Greenfoot.delay(20); // damit 1 Tastendruck nicht als mehrere interpretiert werden kann
    }
    
    public void loescheTextbox() {
        getImage().clear();
    }
    
}
