import greenfoot.*;  


public class Huette extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    private GreenfootImage huetteBoden = new GreenfootImage("HuetteBoden.png");
    private boolean ersterHuettenbesuchVorbei = false;
    
    public Huette(Emrael emrael)
    {    
        super(600, 400, 1);
        setBackground(huetteBoden);
        //backgroundMusic.playLoop();
        prepare(emrael);
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
    
    private void prepare(Emrael alterEmrael)
    {
        Emrael emrael = new Emrael();
        addObject(emrael, 300, 380);
        addObject(alterEmrael.getLebensleiste(), 100, 40);
        if (ersterHuettenbesuchVorbei == false) {
            skriptErsterHuettenbesuch();
        }
    }
    
    private void skriptErsterHuettenbesuch() {
        Textbox textbox = new ErsterHuettenbesuch();
        addObject(textbox, 300,350);
    }
}
