import greenfoot.*;  

public class ZweiterHuettenbesuch extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    Huette huette;
    public ZweiterHuettenbesuch(Emrael em) {
        drawText("Emrael", "Schön, du bist wieder da. Da du dich an \ndas kämpfen ja so langsam gewöhnt \nhast, machen wir \nweiter.");
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
                drawText("Pizaron", "Für meinen neuen Trank benötige \nich noch -Bitterkraut-.");
                huette.bildEinblenden();
                gespraechsteil++;
                break;
            case 2:
                getWorld().removeObject(kraut);
                drawText("Pizaron", "Könntest du mir das Zeug \nim Wald besorgen?.");
                gespraechsteil++;
                break;
            case 3:
                drawText("Emrael", "Okay, das ist keine große Sache.");
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
        emrael.phase = Emrael.Phase.Zwischenphase;
        gespraechsteil = 5;
    }
}
