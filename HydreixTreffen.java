import greenfoot.*;  

public class HydreixTreffen extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public HydreixTreffen(Emrael em) {
        drawText("Emrael", "Hallo Hydr...");
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
                    drawText("Hydreix", "Duuu Mörder!! Hast du es jetzt \nauch noch auf den Beschützer \ndes Ozeans abgesehen?");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrrael", "Was?! Aber ich...");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Hydreix", "Kein Wort, ich werde keine Gnade \nwalten lassen.");
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
        emrael.phase = Emrael.Phase.HydreixBesiegt;
        gespraechsteil = 5;
    }
}