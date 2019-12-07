import greenfoot.*;  

public class UnterwasserBoss extends Unterwasser
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wasser.mp3");
    
    public UnterwasserBoss()
    {    
        // super(600, 400, 1);
        // //backgroundMusic.playLoop();
        prepare();
    }
    
    private void prepare()
    {
        Hydreix hydreix = new Hydreix();
        addObject(hydreix, 490, 178);
    }
}
