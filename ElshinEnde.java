import greenfoot.*;  

public class ElshinEnde extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public ElshinEnde(Emrael em) {
        drawText("Yadrin", "Hey Emrael, Barbar ist \neben hier entlang gelaufen.");
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
                    drawText("Emrael", "Nenne ihn ab jetzt \nnur noch Pizaron.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Yadrin", "Du hast es also geschafft?");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Yadrin", "Ich habe immer fest an \ndich geglaubt!! *freu*");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Emrael", "Gut, dann machen wir \nuns auf den Weg zum Orden, \nalles klar?");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Yadrin", "Besser wir waren damit, \nbis Re:Memorization 2 erscheint.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Emrael", "Stimmt, da hast du recht Yadrin.");
                    gespraechsteil++;
                    break;
                case 7: 
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
        emrael.phase = Emrael.Phase.Zwischenphase;
        gespraechsteil = 8;
    }
}