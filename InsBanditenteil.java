import greenfoot.*;  

public class InsBanditenteil extends Portale
{


    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Banditenteil());
    }


}

//582 292 