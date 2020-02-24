import greenfoot.*;  

public class BradleyKonflikt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    Banditenteil banditenteil;
    
    public BradleyKonflikt(Emrael em, Banditenteil bt) {
        banditenteil = bt;
        drawText("Emrael", "Perfekt. Da ist sie.");
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
                    banditenteil.bradleyHinzufuegen();
                    drawText("Bradley", "Hey, was soll das? Da ist \nwohl jemand lebensmüde, wenn er sich mit \ndem Banditenköng Bradley anlegt.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Das ist also der Banditenkönig. Er war \nalso die ganze Zeit unter uns.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("???", "BRAAAADLEYYY!! Lass deine dreckigen Pfoten von \nihm.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Bradley", "Wer ist da?");
                    gespraechsteil++;
                    break;
                case 5:
                    banditenteil.yadrinHinzufuegen();
                    drawText("Yadrin", "Mein Name ist Yadrin.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Emrael", "Interessant. Er trägt eine ähnliche \nKleidung wie ich.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Yadrin", "Emrael. Wo bist du die ganze \nZeit geblieben? Wir haben uns \nSorgen um dich gemacht!!");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Emrael", "Ich bin im Wald aufgewacht und habe \nmein Gedächtnis sowie meine Fähigkeiten \nverloren.");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Yadrin", "Was? Das heißt, du erinnerst \ndich nicht an deinen besten Freund Yadrin?.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Emrael", "Nein, es tut mir Leid.");
                    gespraechsteil++;
                    break;
                case 11:
                    drawText("Yadrin", "Kein Problem. Vielleicht hilft dir \nein Kampf gegen diese Banditen \nauf die Sprünge. haha");
                    gespraechsteil++;
                    break;
                case 12:
                    drawText("Bradley", "Gerne doch, wenn ihr unbedingt sterben wollt, nur zu.");
                    gespraechsteil++;
                    break;
                case 13:
                    drawText("Yadrin", "Mach du sie fertig, ich \nwerde dich im Hintergrund heilen.");
                    gespraechsteil++;
                    break;
                case 14:
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
        emrael.phase = Emrael.Phase.BradleyBesiegt;
        gespraechsteil = 15;
    }
}