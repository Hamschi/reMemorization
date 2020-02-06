import greenfoot.*;  

public class Gedankending extends Textbox
{
    private int gespraechsteil;
    private Emrael emrael;
    private Deko kraut;
    
    public Gedankending(Emrael em) {
        drawText("Celestia", "Hallo Emrael, ich bin \nCelestia, die Kugel des magischen Scheins.");
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
                    drawText("Emrael", "Woher kennst du meinen Namen?");
                    gespraechsteil++;
                    break;
                case 2:
                    drawText("Celestia", "Warum sollte ich ihn nicht \nkennen? Du bist ein Mitglied \ndes Orden des Lichts.");
                    gespraechsteil++;
                    break;
                case 3:
                    drawText("Emrael", "Aber was ist mit Pizaron? \nEr meinte, du gehörest ihn...");
                    gespraechsteil++;
                    break;
                case 4:
                    drawText("Celestia", "Weißt du eigentlich, warum \ndie Banditen mich gekidnappt haben?.");
                    gespraechsteil++;
                    break;
                case 5:
                    drawText("Celestia", "Ich bin in der Lage, demjenigen \nsein vollsten Potential zu \nerwecken, der mich darum bittet.");
                    gespraechsteil++;
                    break;
                case 6:
                    drawText("Celestia", "Bedingung, mit mir überhaupt \nKontakt aufnehmen zu können ist, dass man ein \nreines Herz haben muss.");
                    gespraechsteil++;
                    break;
                case 7:
                    drawText("Emrael", "Und was ist mit mir? Ich \nhabe so viele Lebewesen getötet...");
                    gespraechsteil++;
                    break;
                case 8:
                    drawText("Celestia", "Nun, das bist nicht du \ngewesen. Du hattest keine \nandere Wahl gehabt.");
                    gespraechsteil++;
                    break;
                case 9:
                    drawText("Celestia", "Ganz tief in deinem Herzen \nsehe ich doch, dass du das \nauch nicht wolltest.");
                    gespraechsteil++;
                    break;
                case 10:
                    drawText("Celestia", "Du bist ein guter Mensch \nEmrael. Ich erwercke nun das \nvollste Potential, das in dir schlummert.");
                    gespraechsteil++;
                    break;
                case 11:
                    drawText("Emrael", "Aber ich habe doch noch \nso viele Fragen...");
                    gespraechsteil++;
                    break;
                case 12:
                    drawText("Celestia", "Auf deine Fragen kannst \nnur du eine Antwort finden \nlieber Emrael.");
                    gespraechsteil++;
                    break;
                case 13:
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
        emrael.phase = Emrael.Phase.KriegserklaerungBarbar;
        gespraechsteil = 14;
    }
}