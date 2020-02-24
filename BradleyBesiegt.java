import greenfoot.*;  

public class BradleyBesiegt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public BradleyBesiegt(Emrael em) {
        drawText("Bradley", "Heute hattet ihr Glück, aber \nnächstes Mal werdet ihr \ngnadenlos verlieren.");
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
                
                case 2:
                    drawText("Yadrin", "Was? Die Kugel sollte sich \ndoch erst in wenigen Minuten entfalten?");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Bradley", "Schwachköpfe. Die Konzentration der Kraft \nzweier Mitglieder eures Ordens hat \nden Prozess beschleunigt .");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Bradley", "Nicht umsonst hat die Kugel \nden Orden des Lichts als \nihren Besitzer auserwählt.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Emrael", "Der Orden des Lichts? Ist das \nder Ort, wo ich herkomme?");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Yadrin", "Nun, ich denke, alles \nwird klar, sobald du mit der \nKugel Celestia redest.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Emrael", "Aber ich sollte sie Pizaron \nübergeben. Immerhin gehört sie \nihm.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Yadrin", "Die Kugel Celestia gehört niemandem, \nbloß unserem Orden. Einen \nPizaron kenne ich nicht.");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Yadrin", "Du kannst sowieso nichts mehr \ndaran ändern. Nutze diese Chance Emrael.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Yadrin", "Spreche die Kugel Celestia doch \neinfach mal mit -space- an.");
                    gespraechsteil++;
                    break;
                case 11:
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
        emrael.phase = Emrael.Phase.Gedankending;
        gespraechsteil = 12;
    }
}