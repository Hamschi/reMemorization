import greenfoot.*;  


public class Huette extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    private GreenfootImage huetteBoden = new GreenfootImage("HuetteBoden.png");
    private boolean ersterHuettenbesuchVorbei = false;
    Emrael emrael;
    
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
        // neuen Emrael erstellen
        Emrael emrael = new Emrael(alterEmrael);
        addObject(emrael, 300, 300);
        emrael.setBild("Emrael_hl.png");
        // Lebensleiste hinzufügen
        addObject(alterEmrael.getLebensleiste(), 100, 40);
        // Portal nach Wald 1 hinzufügen
        NachWald1 nachWald1 = new NachWald1(this, wald1, "Fußmatte.png");
        addObject(nachWald1, 300, 380);
        // Skript und Textbox hinzufügen
        if (ersterHuettenbesuchVorbei == false) {
            skriptErsterHuettenbesuch(emrael);
        }
    }
    
    private void skriptErsterHuettenbesuch(Emrael emrael) {
        Textbox textbox = new ErsterHuettenbesuch(emrael);
        addObject(textbox, 300,350);
    }
}
