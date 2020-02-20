import greenfoot.*;  

public class Wald2BeerenErklaert extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    Pizaron pizaron;
    Wald2 wald2;
    Huette huette;
    private GreenfootImage left = new GreenfootImage("Pizaron_lige.png");
    public Wald2BeerenErklaert(Emrael em, Pizaron piz) {
        drawText("Emrael", "Was ist das denn? Die wachsen \nja direkt nach, sobald ich mir \neine greife.");
        gespraechsteil = 1;
        setFertig(false);
        emrael = em;
        pizaron = piz;
        emrael.setBewegungBlockiert(true);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
            case 1:
                drawText("Pizaron", "Das sind sogenannte \n-Wiederbeeren-. Sobald welche gepflückt \nwerden, kommen nach kurzer Zeit \nneue.");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Dann nehme ich am besten \nnoch ein paar, damit ich wieder \nvollständig geheilt bin.");
                gespraechsteil++;
                break;
            case 3:
                drawText("Pizaron", "Indem du -space- gedrückt hälst, \nkannst du dich schneller heilen.");
                gespraechsteil++;
                break;
            case 4:
                drawText("Pizaron", "Ich gehe wieder in die Hütte. \nSammele am besten noch ein wenig \nErfahrung, bis du mir dann folgst.");
                gespraechsteil++;
                break;
            case 5:
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
        emrael.phase = Emrael.Phase.PizaronSollWeg;
        gespraechsteil = 6;
    }

}
