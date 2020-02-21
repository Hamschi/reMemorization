import greenfoot.*;  

public class BotanBesiegt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public BotanBesiegt(Emrael em) {
        drawText("Botan", "Bewohner des Waldes...");
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
                    drawText("Botan", "Es tut mir Leid.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Dann nehme ich mir mal das Kraut \nmit -space- und gebe es dann \nPizaron.");
                    gespraechsteil++;
                    break;
                case 3: 
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
        emrael.phase = Emrael.Phase.HatKraut;
        gespraechsteil = 4;
    }
}