import greenfoot.*;  

public class NachWald2 extends Portale
{

    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald2());
    }


}
