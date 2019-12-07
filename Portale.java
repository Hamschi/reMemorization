import greenfoot.*;  


public class Portale extends Actor
{
    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald());
    }
}
