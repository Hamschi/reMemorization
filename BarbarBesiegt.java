import greenfoot.*;  

public class BarbarBesiegt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    Wald1 wald1;
    public BarbarBesiegt(Emrael em, Wald1 w1) {
        wald1 = w1;
        drawText("Barbar", "Ihr widerwertigen Menschen.");
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
                    drawText("Emrael", "Ich werde dir nun auch \ndein Gedächtnis rauben \ndamit das Böse von der Welt \ngeschaffen ist.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Barbar", "Aber...HALT...");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Pizaron, wie geht es dir?");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Pizaron", "Pizaron, heiße ich? \nIch kann mich an nichts \nmehr erinnern.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Emrael", "Du bist ein Mensch \nder den Leuten in \nder Stadt hilft, ihr \nLand in Ordnung zu bringen. ");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Pizaron", "So ist das also. \nDann mache ich mich mal \nauf den Weg.");
                    gespraechsteil++;
                    break;
                case 7:
                    wald1.pizaronGehtFort();
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Emrael", "Ich sollte mich \nauch mal wieder zur Stadt \nbegehen. Ich werde erwartet.");
                    gespraechsteil++;
                    break;  
                case 9: 
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
        emrael.phase = Emrael.Phase.ElshinEnde;
        gespraechsteil = 10;
    }
}