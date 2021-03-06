import greenfoot.*;  
    
    public class ErsterHuettenbesuch extends Textbox
    {
    private int gespraechsteil;
    private boolean fertig;
    private Emrael emrael;
    private Pizaron pizaron;
    private GreenfootImage up = new GreenfootImage("Pizaron_hl.png");
    private GreenfootImage down = new GreenfootImage("Pizaron_vl.png");
    private GreenfootImage left = new GreenfootImage("Pizaron_lige.png");
    private GreenfootImage right = new GreenfootImage("Pizaron_rege.png");
    Wald1 wald1;
    
    public ErsterHuettenbesuch(Emrael em, Pizaron piz) {
        drawText("Emrael", "Hallo, ist hier jemand?");
        gespraechsteil = 1;
        fertig = false;
        emrael = em;
        pizaron = piz;
        emrael.setBewegungBlockiert(true);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
            case 1:
                drawText("Pizaron", "Was machst du in meiner Hütte?");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Argh?! O.o");
                gespraechsteil++;
                break;
            case 3:
                drawText("Emrael", "Entschuldigung, dass ich so plötzlich herein-\ngetreten bin. Ich heiße Emrael.");
                gespraechsteil++;
                break;
            case 4:
                drawText("Pizaron", "Okay, und was führt einen wie dich zu mir?");
                gespraechsteil++;
                break;
            case 5:
                drawText("Emrael", "Ich bin eben bewusstlos im Wald aufgewacht und \nhoffte, dass Sie vielleicht mehr über mich wissen. \nIch habe nämlich mein Gedächtnis verloren.");
                gespraechsteil++;
                break;
            case 6:
                drawText("Pizaron", "Nein, da kann ich dir nicht weiterhelfen. \nDie Angelegenheiten anderer interessieren mich \naber auch nicht.");
                gespraechsteil++;
                break;
            case 7:
                drawText("Emrael", "Oh, okay. Wenn dem so ist, gehe ich wieder. \nEntschuldigen Sie, dass ich gestört habe.");
                gespraechsteil++;
                break;
            case 8:
                drawText("Pizaron", "Warte! Du hast keine eigene Behausung, nehme \nich mal an, bzw. du weißt nicht, wo du herkommst, oder?");
                gespraechsteil++;
                break;
            case 9:
                drawText("Emrael", "Ja, das ist richtig.");
                gespraechsteil++;
                break;
            case 10:
                drawText("Pizaron", "Deiner kräftigen Körperstatue zu urteilen bist \ndu ein starker Krieger. ");
                gespraechsteil++;
                break;
            case 11:
                drawText("Pizaron", "Und wenn ich mir deine hochwertige Kleidung \nund dein Schwert so ansehe, stammst du aus einer edlen \nFamilie. Bestimmt beherrschst du auch ein paar Zauber.");
                gespraechsteil++;
                break;
            case 12:
                drawText("Emrael", "Ich befürchte, dass ich sogar vergessen habe, \nwie ich Zauber anwenden kann. Sogar das \nKämpfen habe ich wahrscheinlich verlernt.");
                gespraechsteil++;
                break;
            case 13:
                drawText("Pizaron", "Nun, ich könnte dir ein Angebot machen. \nWie du vielleicht sehen kannst, bin ich ein Magier.");
                gespraechsteil++;
                break;
            case 14:
                drawText("Emrael", "Ja, und weiter?");
                gespraechsteil++;
                break;
            case 15:
                drawText("Pizaron", "Ich könnte dir anbieten, mir zu assistieren. \nIch möchte nämlich viele neue Heilmethoden entwickeln. \nDas wäre eine guter Gelegenheit, deine Kräfte \nwieder zu erwecken.");
                gespraechsteil++;
                break;
            case 16:
                drawText("Emrael", "Und was genau soll ich dafür machen?");
                gespraechsteil++;
                break;
            case 17:
                drawText("Pizaron", "Du musst mir eigentlich nur ein paar Materialien \nbesorgen.");
                gespraechsteil++;
                break;
            case 18:
                drawText("Emrael", "Nagut, ich willige ein. \nVielleicht hilft das meinem Gedächtnis auf die Sprünge.");
                gespraechsteil++;
                break;
            case 19:
                drawText("Pizaron", "Ich würde vorschlagen, wir testen deine \nFähigkeiten erstmal bei ein paar Waldlebewesen.");
                gespraechsteil++;
                break;
            case 20:
                drawText("Pizaron", "Ich würde vorschlagen, damit du erstmal die \nGrundlagen lernst, gehen wir raus und \nüben den Umgang mit dem Schwert.");
                gespraechsteil++;
                break;
            case 21:
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
            fertig = true;
            emrael.setBewegungBlockiert(false);
            emrael.phase = Emrael.Phase.VorWald2Tutorial;
                    pizaron.setImage(right);
                    for (int i = 0; i<44; i++)
                    {
                        pizaron.setLocation(pizaron.getX()+(2), pizaron.getY());
                        Greenfoot.delay(1);
                    }
                    pizaron.setImage(down);
                    for (int i = 0; i<103; i++)
                    {
                        pizaron.setLocation(pizaron.getX(), pizaron.getY()+(2));
                        Greenfoot.delay(1);
                    }
                    pizaron.setImage(left);
                    for (int i = 0; i<44; i++)
                    {
                        pizaron.setLocation(pizaron.getX()-(2), pizaron.getY());
                        Greenfoot.delay(1);
                    }
                    pizaron.setImage(down);
                    for (int i = 0; i<5; i++)
                    {
                        pizaron.setLocation(pizaron.getX(), pizaron.getY()+(2));
                        Greenfoot.delay(1);
                    }
                    getWorld().removeObject(pizaron);
                gespraechsteil = 22;
            }
}
