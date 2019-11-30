import greenfoot.*;  

public class Wald extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wald.mp3");
    
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Wald()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        prepare();

    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
    
    private void prepare()
    {
        Emrael emrael = new Emrael();
        addObject(emrael, 317, 210);
        addObject(lebensleiste, 100, 40);
        //Wald wald = new Wald();
    }
    

    
}
