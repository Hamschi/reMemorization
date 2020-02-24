import greenfoot.*;  

public class VierterHuettenbesuch extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    
    public VierterHuettenbesuch(Emrael em) {
        drawText("Pizaron", "Du hast ja schon wieder ein \npaar Wunden?!");
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
                    drawText("Emrael", "...");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Ich werde keine Aufgaben \nmehr aufnehmen, in denen ich ein \nLebewesen kampfunfähig schlagen muss \nPizaron.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Pizaron", "Gut, wenn das dein Wunsch \nist, dann habe ich dem nichts \nentgegenzusetzen.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Pizaron", "Du kannst dir ja eine Auszeit \ngönnen und die Stadt erkunden.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Pizaron", "Morgen habe ich dort einen Auftrag \nfür dich.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Emrael", "Und ich werde keine Gewalt anwenden \nmüssen?");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Pizaron", "Wenn du die Sache gut tust, \ndann nicht. Mehr Informationen gebe \nich dir morgen früh.");
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
        emrael.phase = Emrael.Phase.AnkunftElshin;
        gespraechsteil = 9;
    }
}