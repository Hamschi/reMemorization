import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class VorWald2Tutorial extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    
    public VorWald2Tutorial(Emrael em) 
    {
        drawText("Pizaron", "Na komm, folge mir.");
        gespraechsteil = 1;
        setFertig(false);
        emrael = em;
        emrael.setBewegungBlockiert(true);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")) 
        {
            switch (gespraechsteil){
            case 1:
                drawText("Pizaron", "Ja warte, nicht so schnell.");
                gespraechsteil++;
                break;
            case 2: 
                ende();
            }
        }     
    }
    
    private void ende() {
    loescheTextbox();
    setFertig(true);
    emrael.setBewegungBlockiert(false);
    emrael.phase = Emrael.Phase.Wald2Tutorial;
    gespraechsteil = 3;
    }
}
