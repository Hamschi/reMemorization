import greenfoot.*;  

public class HydreixBesiegt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;

    public HydreixBesiegt(Emrael em) {
        drawText("Hydreix", "Schämst du dich denn nicht?");
        gespraechsteil = 1;
        setFertig(false);
        emrael = em;
        emrael.setBewegungBlockiert(true);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
                case 1:
                    drawText("Emrael", "Ich wollte dich bloß um \netwas Wasser bitten...");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Hydreix", "Beweise mir das, indem du mir \nversprichst, nicht mehr zu morden.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Wenn du mir damit verzeihst, \ndann tue ich das für dich.");
                    gespraechsteil++;
                    break;
                case 4:
                    ende();
                }
            }
        if(Greenfoot.isKeyDown("enter")) {
            ende();
        }
    }      
    private void ende() 
    {
        loescheTextbox();
        setFertig(true);
        emrael.setBewegungBlockiert(false);
        emrael.phase = Emrael.Phase.VierterHuettenbesuch;
        gespraechsteil = 5;
    }
}