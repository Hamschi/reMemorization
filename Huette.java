import greenfoot.*;  

public class Huette extends World
{
        private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
        Lebensleiste lebensleiste = new Lebensleiste();
        private GreenfootImage huetteBoden = new GreenfootImage("HuetteBoden.png");
        private boolean ersterHuettenbesuchVorbei = false;
        Emrael emrael;
        Pizaron pizaron;
            
        public Huette(Emrael emrael, World wald1)
        {    
            super(600, 400, 1);
            setBackground(huetteBoden);
            //backgroundMusic.playLoop();
            prepare(emrael, wald1);
        }
        
        public Lebensleiste getLebensleiste()
        {
            return lebensleiste;
        }
        
        private void prepare(Emrael alterEmrael, World wald1)
        {
            Deko tisch = new Deko("Tisch.png");
            addObject(tisch, 306, 214);
            Pizaron pizaron = new Pizaron();
            addObject(pizaron, 300, 135);
            Deko magiebuch = new Deko("Magiebuch.PNG");
            addObject (magiebuch, 280, 199);
            Hindernis trank = new Hindernis("Trank.PNG");
            addObject (trank, 577, 200);
            Deko trank2 = new Deko("Trank2.PNG");
            addObject(trank2, 313, 180);
            Deko trank3 = new Deko("Trank3.PNG");
            addObject(trank3, 300, 192);
            Deko trank4 = new Deko("Trank4.PNG");
            addObject(trank4, 346, 201);
            Deko apfel = new Deko("Apfel.png");
            addObject(apfel, 275, 214);
            Deko magiebuch2 = new Deko("Magiebuch2.PNG");
            addObject(magiebuch2, 83, 100);
            Deko kraut1 = new Deko("Kraut1.PNG");
            addObject(kraut1, 113, 256);
            Deko kraut2 = new Deko("Kraut2.PNG");
            addObject(kraut2, 319, 211);
            Hindernis kamin = new Hindernis("kamin.png");
            addObject(kamin, 300, 57);
            // neuen Emrael erstellen
            Emrael emrael = new Emrael(alterEmrael);
            addObject(emrael, 300, 300);
            emrael.setBild("Emrael_hl.png");
            // Lebensleiste hinzufügen
            emrael.addLebensleiste();
            // Portal nach Wald 1 hinzufügen
            NachWald1 nachWald1 = new NachWald1(this, wald1, "Fußmatte.png");
            nachWald1.setPortalFix(250, 240);
            addObject(nachWald1, 300, 380);
            // Skript und Textbox hinzufügen
            Deko bettHolz = new Deko("BettHolz.PNG");
            addObject (bettHolz, 571, 55);
            for (int i = 0; i<5; i++)
            {
                addObject(new Hindernis(), (252+(25*i)), 177);
                addObject(new Hindernis(), (252+(25*i)), 225);
            }
            for (int i = 0; i<20; i++)
            {
                addObject(new Hindernis("Grube1.PNG"), (17+(30*i)), 11);
            }
            if (emrael.phase == Emrael.Phase.Wald1Einfuehrung) {
                skriptErsterHuettenbesuch(emrael, pizaron);
            }

        }
        
        private void skriptErsterHuettenbesuch(Emrael emrael, Pizaron pizaron) {
            Textbox textbox = new ErsterHuettenbesuch(emrael, pizaron);
            addObject(textbox, 300,350);
        }
        
}
