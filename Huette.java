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
            Tisch tisch = new Tisch();
            addObject(tisch, 306, 214);
            Pizaron pizaron = new Pizaron();
            addObject(pizaron, 300, 135);
            Magiebuch magiebuch = new Magiebuch();
            addObject (magiebuch, 280, 199);
            Trank trank = new Trank();
            addObject (trank, 577, 200);
            Trank2 trank2 = new Trank2();
            addObject(trank2, 313, 180);
            Trank3 trank3 = new Trank3();
            addObject(trank3, 300, 192);
            Trank4 trank4 = new Trank4();
            addObject(trank4, 346, 201);
            Apfel apfel = new Apfel();
            addObject(apfel, 275, 214);
            Magiebuch2 magiebuch2 = new Magiebuch2();
            addObject(magiebuch2, 83, 100);
            Kraut1 kraut1 = new Kraut1();
            addObject(kraut1, 113, 256);
            Kraut2 kraut2 = new Kraut2();
            addObject(kraut2, 319, 211);
            Kamin kamin = new Kamin();
            addObject(kamin, 300, 57);
            // neuen Emrael erstellen
            Emrael emrael = new Emrael(alterEmrael);
            addObject(emrael, 300, 300);
            emrael.setBild("Emrael_hl.png");
            // Lebensleiste hinzufügen
            emrael.addLebensleiste();
            // Portal nach Wald 1 hinzufügen
            NachWald1 nachWald1 = new NachWald1(this, wald1, "Fußmatte.png");
            addObject(nachWald1, 300, 380);
            // Skript und Textbox hinzufügen
            BettHolz bettHolz = new BettHolz();
            addObject (bettHolz, 571, 55);
            for (int i = 0; i<5; i++)
            {
                addObject(new Unsichtbar(), (252+(25*i)), 177);
                addObject(new Unsichtbar(), (252+(25*i)), 225);
            }
            for (int i = 0; i<20; i++)
            {
                addObject(new Grube1(), (17+(30*i)), 11);
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
