import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ErsterHuettenbesuch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ErsterHuettenbesuch extends Textbox
{
    private int gespraechsteil;
    public ErsterHuettenbesuch() {
        drawText("Emrael", "Hallo, ist hier jemand?");
        gespraechsteil = 1;
    }
    /**
     * Act - do whatever the ErsterHuettenbesuch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
            case 1:
                drawText("Pizaron", "Was machst du in meiner Hütte?");
                gespraechsteil++;
                Greenfoot.delay(10);
                break;
            case 2:
                drawText("Emrael", "Argh?! O.O");
                gespraechsteil++;
                Greenfoot.delay(10);
                break;
            case 3:
                drawText("Emrael", "Entschuldigung, dass ich so plötzlich herein-\ngetreten bin. Ich heiße Emrael.");
                gespraechsteil++;
                Greenfoot.delay(10);
            }
        }
    }    
}
