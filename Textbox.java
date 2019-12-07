import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    private String bildDatei = "Textbox.png";
    private static int schriftgroesse = 15;
    private static int startX = 8;
    private static int startY = 5;
    private static greenfoot.Color farbe = greenfoot.Color.WHITE;

    
    public Textbox() {
        setImage(new GreenfootImage(bildDatei));
    }
    
    /**
     * Act - do whatever the Textbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    
    public void drawText(String sprecher, String satz) {
        String s = sprecher + ": " + satz;
        getImage().clear();
        setImage(new GreenfootImage(bildDatei));
        GreenfootImage neuerText = new GreenfootImage(s, schriftgroesse, farbe, null);
        getImage().drawImage(neuerText, startX, startY);
    }
    
}
