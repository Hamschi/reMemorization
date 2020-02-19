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
        drawText("Emrael", "Was ist das denn? Die sind \nja innerhalb weniger Sekunden wieder \nnachgewachsen.");
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
                drawText("Pizaron", "Das sind sogenannte \n-Wiederbeeren-. Sobald welche gepflückt \nwerden, kommen nach wenigen Sekunden \nneue.");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Dann nehme ich am besten \nnoch eine, damit ich wieder \nvollständig geheilt bin.");
                gespraechsteil++;
                break;
            case 3:
                drawText("Pizaron", "Ich gehe wieder in die \nHütte. Sammele am besten noch \nein wenig Erfahrung, bis du \nmir dann folgst.");
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
        emrael.phase = Emrael.Phase.ZweiterHuettenbesuch;
        // pizaron.setImage(left);
        gespraechsteil = 5;
        wald2.setTextVorhanden();
    }

}
