import greenfoot.*;  

public class InsZentrumElshin extends Portale
{

    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new ElshinZentrum());
    }
}
