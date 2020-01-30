import greenfoot.*;  

    public class Wald2BeerenGegessen extends Textbox
{
        private int gespraechsteil;
        private Emrael emrael;
        public Wald2BeerenGegessen(Emrael em) {
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
            emrael.phase = Emrael.Phase.Wald2BeerenErklaert;
        }
    }
