import greenfoot.*;  

public class HinweisBanditen extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;

    public HinweisBanditen(Emrael em) {
        drawText("Hinweis", "Die Banditen sind zu stark. \nSie dürfen dich nicht sehen. \nBesorge dir die Kugel mit -space-.");
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
        emrael.phase = Emrael.Phase.BradleyKonflikt;
        gespraechsteil = 2;
    }
}