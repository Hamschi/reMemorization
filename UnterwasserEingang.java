import greenfoot.*;  

public class UnterwasserEingang extends Unterwasser
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wasser.mp3");
    
    public UnterwasserEingang()
    {    
        prepare();
    }
    
    private void prepare()
    {
        Hoehle hoehle = new Hoehle();
        addObject(hoehle, 526, 169);
    }
}
