import greenfoot.*;  

public class KriegserklaerungBarbar extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    
    public KriegserklaerungBarbar(Emrael em) {
        drawText("Emrael", "Ya...Ya...Yadrin? Du \nbist es wirklich!!");
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
                    drawText("Yadrin", "Yapp, wie er leibt und lebt. \nDu hast deine Kräfte wieder, \nnehme ich mal an?");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Emrael", "Jaa,mein Gedächtnis habe ich auch zurück \ninzwischen.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Jetzt muss ich ihn aber \naufhalten.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Yadrin", "Wen meinst du?");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Emrael", "Den Dämonenkönig Barbar. ");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Yadrin", "Aber du weißt doch \ngar nicht, wo er ist Emrael.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Emrael", "Oh doch, und zwar besser als du denkst.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Emrael", "Als ich meine Erinnerungen \nverloren habe, hat er mich benutzt wie \neine Marionette dieser Teufel.");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Emrael", "Er hat mich dazu gebracht, \nLebewesen zu töten und wollte jetzt, \ndass ich ihm noch die Kugel stehle.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Yadrin", "Seine Kraft steigt durch \nSünden der Menschen. Gewieft");
                    gespraechsteil++;
                    break;
                case 11:
                    drawText("Yadrin", "Ich werde mit dir kommen. Er \nhat dich schon einmal besiegt und \nich will dich kein weiteres Mal verlieren.");
                    gespraechsteil++;
                    break;
                case 12:
                    drawText("Emrael", "Nein Yadrin, durch die vielen \nSünden von den Menschen und \nmir ist er viel stärker \ngeworden als zuvor.");
                    gespraechsteil++;
                    break;
                case 13:
                    drawText("Emrael", "Du wirst gegen ihn \nkeine Chance haben.");
                    gespraechsteil++;
                    break;
                case 14:
                    drawText("Emrael", "Ich habe schon einmal gegen ihn \nverloren, aber das passiert nicht \nnochmal. Ich bin jetzt auch stärker.");
                    gespraechsteil++;
                    break;
                case 15:
                    drawText("Yadrin", "Ob die Entfesslung deiner Kräfte \nreicht? Ich weiß ja \nnicht Emrael.");
                    gespraechsteil++;
                    break;
                case 16:
                    drawText("Emrael", "Vertraue mir Yadrin, bitte.");
                    gespraechsteil++;
                    break;
                case 17:
                    drawText("Yadrin", "Nagut Emrael, viel Glück. \nUnd wehe, du kommst nicht heil \nzurück.");
                    gespraechsteil++;
                    break;
                case 18:
                    drawText("Emrael", "Keine Sorge. Dieses mal kann \nich mich ja auch selber mit der \nTaste -2- heilen");
                    gespraechsteil++;
                    break;
                case 19:
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
        emrael.phase = Emrael.Phase.BarbarKonflikt;
        gespraechsteil = 20;
    }
}