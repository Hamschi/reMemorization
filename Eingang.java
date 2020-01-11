import greenfoot.*;  


public class Eingang extends Actor
{
    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald());
    }
}
