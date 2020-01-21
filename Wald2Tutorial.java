import greenfoot.*;  

public class Wald2Tutorial extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    public Wald2Tutorial(Emrael em) {
        drawText("Pizaron", "Jetzt sind wir bisschen weiter weg von \nmeiner Hütte entfernt. Das heißt, wir sind \naußerhalb meiner Schutzbarriere.");
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
                drawText("Pizaron", "Die habe ich aufgerichtet, damit mich keine \nTiere angreifen können. Von Außen kann \nmich nämlich kein Tier sehen.");
                gespraechsteil++;
                break;
            case 2:
                drawText("Emrael", "Oh okay.");
                gespraechsteil++;
                break;
            case 3:
                drawText("Pizaron", "Wenn du hier herumläufst, dann kann es \ndurchaus vorkommen, dass dich \npaar von diesen Viehchern angreifen.");
                gespraechsteil++;
                break;
            case 4:
                drawText("Pizaron", "Um einen normalen Angriff auszuführen, \nmusst du „1“ drücken. Das \nfügt deinem Gegner Schaden zu. Versuche \nes mal");
                gespraechsteil++;
                break;
            case 5:
                ende();
            }
        }
        if(Greenfoot.isKeyDown("enter")) {
            ende();
        }
    }    
    
    private void ende() {
        loescheTextbox();
        setFertig(true);
        emrael.setBewegungBlockiert(false);
        emrael.phase = Emrael.Phase.Wald2Beeren;
        }
}
