import greenfoot.*;  


public class Huette extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    private GreenfootImage huetteBoden = new GreenfootImage("HuetteBoden.png");
    
    
    public Huette(Emrael emrael)
    {    
        super(400, 400, 1);
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
        addObject(emrael, 300, 370);
        addObject(alterEmrael.getLebensleiste(), 100, 40);
    }
    

}
