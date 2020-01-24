import greenfoot.*;  

public class Wald2Beeren extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public Wald2Beeren(Emrael em) {
        drawText("Pizaron", "Gut, du hast dein erstes Vieh erlegt.");
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
                drawText("Pizaron", "Du müsstest dich jetzt bisschen sicherer \nmit dem Umgang mit deiner Waffe fühlen.");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Ja, ein wenig besser fühle ich mich schon, \naber wirklich sicher bin ich immer noch \nnicht. ");
                gespraechsteil++;
                break;
            case 3:
                drawText("Pizaron", "Ja, das kommt noch nach der Zeit.");
                gespraechsteil++;
                break;
            case 4:
                drawText("Emrael", "Nagut");
                gespraechsteil++;
                break;
            case 5:
                drawText("Pizaron", "Siehst du die Beeren da?");
                gespraechsteil++;
                break;
            case 6:
                drawText("Emrael", "Ja, sind die essbar?");
                gespraechsteil++;
                break;
            case 7:
                drawText("Pizaron", "Yopp, greif dir mal eine mit -Space- und esse sie.");
                gespraechsteil++;
                break;
            case 8:
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
        emrael.setBewegungBlockiert(false);
        emrael.phase = Emrael.Phase.Wald2BeerenGegessen;
        gespraechsteil = 9;
        }
}
