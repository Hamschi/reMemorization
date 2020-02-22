import greenfoot.*;  

public class AnkunftElshin extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    
    public AnkunftElshin(Emrael em) {
        drawText("Emrael", "Das ist also Elshin. Nicht sonderlich \nschön hier. Alles vollkommen ausgetrocknet \n... so viele Heimatlose.");
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
                    drawText("Emrael", "Die Armen müssen bestimmt leiden.");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Bewohner", "Sie!! Sie sind doch Emrael, \n der Barmherzige, hab' ich recht?");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Der Barmherzige? Zumindest \nheiße ich Emrael.");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Bewohner", "Bitte helfen Sie uns. Wie \nSie vielleicht sehen, geht's unserem \nLand nicht mehr so gut.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Bewohner", "Alles begann als sie spurlos verschwunden \nsind. Ganz plötzlich trat eine Dürre \naus.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Bewohner", "In nur wenigen Sekunden wurde \nunser Land unfruchtbar und knapp 70% \nder Bevölkerung...");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Bewohner", "Sie...sie wurde von einer \nunbekannten Virenart befallen... Wir \nhaben kaum noch Essen.");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Pizaron", "Das ist ja furchtbar!!");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Bewohner", "Es geht schon soweit, \ndass wir unsere eigenen Tiere \nschlachten müssen, um an \nEssen zu kommen.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Emrael", "Nun...in meiner aktuellen \nVerfassung bin ich nicht in der \nLage, euch zu helfen.");
                    gespraechsteil++;
                    break;
                case 11:
                    drawText("Emrael", "Mein Gedächtnis ist nämlich auch \nweg, genauso wie meine Kräfte.");
                    gespraechsteil++;
                    break;
                case 12:
                    drawText("Bewohner", "Dann ergeht es Ihnen \nschlechter als jeden einzelnen \nvon uns...");
                    gespraechsteil++;
                    break;
                case 13:
                    drawText("Emrael", "Glauben Sie mir, aktuell \nist für mich nichts wichtiger, \nals euch zu helfen, nachdem \nich die Geschichte gehört \nhabe.");
                    gespraechsteil++;
                    break;
                case 14:
                    drawText("Bewohner", "Kein Zweifel. Sie sind \nEmrael, der Barmherzige. Hoffentlich \ngeht es Ihnen bald besser.");
                    gespraechsteil++;
                    break;
                case 15:
                    drawText("Emrael", "Ich danke Ihnen. Nun \nschaue ich erstmal, ob ich hier \nein paar Infos bekomme.");
                    gespraechsteil++;
                    break;
                case 16:
                    drawText("Bewohner", "Sie können in der Taverne mal \nden Barkeeper ansprechen, im Dorf wird ganz \ngerne mal getratscht.");
                    gespraechsteil++;
                    break;
                case 17:
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
        emrael.phase = Emrael.Phase.WirtTreffen;
        gespraechsteil = 18;
    }
}