import greenfoot.*;  

public class BotanTreffen extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    public BotanTreffen(Emrael em) {
        drawText("Emrael", "Ah, da ist es ja");
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
                    drawText("Emrael", "Häh? Es bewegt sich?!");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Ahhh!! Ein Monster?!");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Botan", "Ich bin Botan, der Hüter der Flora \nund lasse nicht zu, dass du Mörder dem \nWald seine Pflanzen beraubst.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Emrael","Mörder? Mein Name ist Emrael. Ich benötige diese \ndiese Kräuter, um einen Heiltrank zu erstellen.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Botan","Das ist ausgeschlossen. Ich kann \njemanden mit solch bösartigen Hindergedanken nicht \n frei rumlaufen lassen.");
                    gespraechsteil++;
                    break;
               case 6:
                    drawText("Emrael","Aber...");
                    gespraechsteil++;
                    break;
               case 7:
                    drawText("Botan","Du wirst keine Chance haben!!");
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
    private void ende() 
    {
        loescheTextbox();
        setFertig(true);
        emrael.setBewegungBlockiert(false);
        emrael.phase = Emrael.Phase.BotanBesiegt;
        gespraechsteil = 9;
    }
}