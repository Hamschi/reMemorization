import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Wald1Einleitung extends Textbox
{
    int gespraechsteil;
    Emrael emrael;
    
    public Wald1Einleitung(Emrael e) {
        drawText("Emrael", "Aua... wo bin ich hier? ...\nUnd... was mache ich hier?");
        gespraechsteil = 1;
        setFertig(false);
        emrael = e;
    }

    public void act() 
    { 
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
            case 1:
                drawText("Emrael", "...");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Oh, da ist eine Hütte. Vielleicht ist \ndort jemand, der mehr über mich weiß.");
                gespraechsteil++;
                break;
            case 3:
                ende();
            }
        }
           
        if(Greenfoot.isKeyDown("enter")) {
            ende();
        }
    }
    
    private void ende() {
        loescheTextbox();
        setFertig(true);
        emrael.phase = Emrael.Phase.ErsterHuettenbesuch;
        emrael.setBewegungBlockiert(false);
        gespraechsteil = 4;
    }
}
