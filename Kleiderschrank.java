import greenfoot.*;  

public class Kleiderschrank extends Hindernis
{
    private GreenfootImage kleiderschrank = new GreenfootImage("Kleiderschrank.png");
   
    public Kleiderschrank()
    {
        GreenfootImage kleiderschrank = getImage();
        kleiderschrank.scale(kleiderschrank.getWidth() + 10, kleiderschrank.getHeight() + 10);
        setImage(kleiderschrank);
    }
    
    public void act() 
    {

    }    
}
