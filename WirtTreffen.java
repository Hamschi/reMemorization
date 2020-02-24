import greenfoot.*;  

public class WirtTreffen extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;

    public WirtTreffen(Emrael em) {
        drawText("Emrael", "Guten Abend. Ein Zimmer \nfür eine Nacht bitte, werter \nHerr.");
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
                    drawText("Wirt", "Oh, was führt denn Emrael, den \nBarmherzigen zu so einem einfachen \nWirtshaus wie dem meines?");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Um es kurz zu fassen: \nIch habe mein Gedächtnis \nverloren.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Nun ist mir aufgefallen, dass es \ndieser Stadt nicht sehr gut geht und dem \nGrund gehe ich auf die Spur.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Wirt", "Nun, alles begann nach Ihrem \nplötzlichen Verschwinden. Unseren \nZustand haben Sie ja gesehen.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Emrael", "Aber wie kommt denn sowas \nzustande? Solche Katastrophen brauchen \ndoch mehrere Jahre.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Wirt", "Das muss ein mächtiger Zauber sein, \naber dies würde viel zu viel magische \nEnergie kosten.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Wirt", "Viele glauben auch, es sei \ndas Werk des Teufels.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Wirt", "Das halte ich aber für sehr hirnspinstig. \nWer glaubt schon an den Teufel?");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Emrael", "Sehr hilfreiche Informationen, ich \ndanke Ihnen.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Wirt", "Bleiben Sie doch eine Nacht. \nEs ist ziemlich spät geworden.");
                    gespraechsteil++;
                    break;
                case 11:
                    drawText("Emrael", "Oh, das wäre sehr lieb. \nIch weiß ihr Angebot sehr \nzu schätzen.");
                    gespraechsteil++;
                    break;
                case 12:
                    drawText("Wirt", "Das ist mir eine Ehre. Ruhen \nSie sich im Bett mit -space- aus.");
                    gespraechsteil++;
                    break;
                case 13:
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
        emrael.phase = Emrael.Phase.EmraelAusgeruht;
        gespraechsteil = 14;
    }
}