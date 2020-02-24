import greenfoot.*;  

public class FuenfterHuettenbesuch extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;

    public FuenfterHuettenbesuch(Emrael em) {
        drawText("Emrael", "Hier bin ich.");
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
                    drawText("Pizaron", "Du bist spät dran. Kommen wir \ndirekt zur Sache.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Pizaron", "Banditen. Dieser Banditenkönig Bradley \nund seine Bande haben es \ngeschafft, mir etwas wichtiges zu stehlen.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Pizaron", "Die Kugel des magischen Scheins. \nWenn sie in die falschen Hände gerät, \nkann es schlimme Folgen mit sich bringen.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Pizaron", "Denn einmal alle 10 Jahre entfesselt \ndie Kugel ihre Kraft und das passiert schon \ngleich.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Pizaron", "Du hast nicht mehr viel \nZeit. Mach dich auf den Weg.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Emrael", "Erkläre mir erst, warum du \nsie nicht holst. Du \nbist doch viel stärker als ich.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Pizaron", "Das geht halt aktuell \nnicht. Egal, Beeilung Schlafmütze.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Emrael", "Nagut, aber du bist mir \neine Erklärung schuldig, sobald \nich zurück bin.");
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
        emrael.phase = Emrael.Phase.HinweisBanditen;
        gespraechsteil = 10;
    }
}