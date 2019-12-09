import greenfoot.*;  


public class Huette extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    private GreenfootImage huetteBoden = new GreenfootImage("HuetteBoden.png");
    private boolean ersterHuettenbesuchVorbei = false;
    
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
        Emrael emrael = new Emrael();
        addObject(emrael, 300, 300);
        // Lebensleiste hinzufügen
        addObject(alterEmrael.getLebensleiste(), 100, 40);
        // Portal nach Wald 1 hinzufügen
        NachWald1 nachWald1 = new NachWald1(this, wald1);
        addObject(nachWald1, 300, 380);
        // Skript und Textbox hinzufügen
        if (ersterHuettenbesuchVorbei == false) {
            skriptErsterHuettenbesuch();
        }
    }
    
    private void skriptErsterHuettenbesuch() {
        Textbox textbox = new ErsterHuettenbesuch();
        addObject(textbox, 300,350);
    }
}
