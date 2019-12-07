import greenfoot.*;  

public class NachWald1 extends Portale
{

    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald1());
    }


}
