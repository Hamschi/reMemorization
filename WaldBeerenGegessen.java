import greenfoot.*;  

    public class WaldBeerenGegessen extends Textbox
{
        private int gespraechsteil;
        private Emrael emrael;
        public WaldBeerenGegessen(Emrael em) {
            drawText("Emrael", "Oh, ich fühle mich besser.");
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
                    drawText("Pizaron", "Richtig. Du hast eben im Kampf Schaden \nerlitten. Die Sollte dich jetzt ein \nwenig geheilt haben.");
                    gespraechsteil++;
                    break;
                case 2:
                    loescheTextbox();
                    setFertig(true);
                    emrael.phase = Emrael.Phase.ErsterHuettenbesuch;
                    emrael.setBewegungBlockiert(false);
                case 3:
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
            emrael.phase = Emrael.Phase.Wald2Beeren;
        }
    }
