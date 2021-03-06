import greenfoot.*;  

public class BarbarKonflikt extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    Wald1 wald1;
    public BarbarKonflikt(Emrael em, Wald1 w1) {
        drawText("Emrael", "Komm heraus Pizaron!!");
        gespraechsteil = 1;
        setFertig(false);
        emrael = em;
        emrael.setBewegungBlockiert(true);
        wald1 = w1;
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) {
            switch (gespraechsteil) {
                case 1:
                    drawText("Emrael", "Oder sollte ich dich besser \nDämonenkönig Barbar nennen?");
                    gespraechsteil++;
                    break;
                case 2:
                    wald1.pizaronHinzufuegen();
                    gespraechsteil++;
                    break;
                case 3: 
                    drawText("Pizaron", "Soso, du hast die Kugel \nalso für dich benutzt und damit \ndeine Erinnerungen zurückerlangt.?");
                    gespraechsteil++;
                    break;
                case 4: 
                    drawText("Emrael", "Nicht nur das, meine Kräfte sind \nauch wieder da. Dieses Mal werde \nich dich zu Fall bringen.");
                    gespraechsteil++;
                    break;
                case 5: 
                    drawText("Pizaron", "Ach, ist das so? Du bist \ndir schon im Klaren, dass du mich durch \ndeine Sünden viel stärker gemacht hast?");
                    gespraechsteil++;
                    break;
                case 6: 
                    wald1.pizaronWirdZuBarbar();
                    drawText("Pizaron", "Ich sollte dir echt \ndankbar sein, dass du mir zu dieser \nMacht verholfen hast Emrael.");
                    gespraechsteil++;
                    break;
                case 7: 
                    drawText("Emrael", "Sei still Barbar!! Mit meiner \nneuen Kraft bin ich dir weitestgehend \nüberlegen.");
                    gespraechsteil++;
                    break;
                case 8: 
                    drawText("Pizaron", "Wenn du das denkst Emrael, \ndann nur zu.");
                    gespraechsteil++;
                    break;
                case 9:
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
        emrael.phase = Emrael.Phase.BarbarBesiegt;
        gespraechsteil = 10;
    }
}