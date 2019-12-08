import greenfoot.*;  

public class Wald extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wald.mp3");
    
    
    public Wald()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        prepare();

    }
    
    private void prepare()
    {
        Emrael emrael = new Emrael();
        addObject(emrael, 433, 239);
        addObject(emrael.getLebensleiste(), 100, 40);
    }
   
}
