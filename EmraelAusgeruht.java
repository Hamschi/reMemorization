import greenfoot.*;  

public class EmraelAusgeruht extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;

    public EmraelAusgeruht(Emrael em) {
        drawText("Emrael", "Gut, dann gehe ich mal zu Pizaron \nund höre mir an, was ich tun soll.");
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
        emrael.phase = Emrael.Phase.FuenfterHuettenbesuch;
        gespraechsteil = 2;
    }
}