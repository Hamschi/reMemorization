import greenfoot.*;  

public class DritterHuettenbesuch extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    public DritterHuettenbesuch(Emrael em) {
        drawText("Pizaron", "Ah, da bist du ja Emrael. Und die \nKräuter hast du auch dabei.");
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
                    drawText("Emrael", "Du hast mir gar nicht gesagt \n,dass das Kraut bewacht wird.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Pizaron", "Achso, ja. Botan spielt sich imer bisschen \nauf.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Und jetzt ist er....");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Pizaron", "Mach dir keinen Kopf.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Pizaron", "Der ging mir sowieso auf den \nKeks mit seiner ständigen Liebe zur Natur.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Emrael", "Hmmm...");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Pizaron", "Um auf andere Gedanken zu kommen, \nkönntest du mir bisschen Wasser \nvom See holen.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Pizaron", "Hydreix bewacht diesen Ort, jedoch \nist er eigentlich ganz nett.");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Pizaron", "Frag ihn aber sicherheitshalber. Er \nbefindet sich in einer Höhle unter Wasser.");
                    gespraechsteil++;
                    break;
                case 10:
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
        emrael.phase = Emrael.Phase.HydreixTreffen;
        gespraechsteil = 11;
    }
}