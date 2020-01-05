import greenfoot.*; 

public class NachWald1 extends Portale
{
    NachWald1() { //veraltet
        from = getWorld();
        to = new Wald1();
    }
    
    NachWald1(World from, World to, String bild) 
    {
        setImage(new GreenfootImage(bild));
        this.from = from;
        this.to = to;
    }
    
    NachWald1(World from, World to) 
    {
        this.from = from;
        this.to = to;
    }
    
    public void act() 
    {
        ((Wald1)to).setzePortalNachWald2();
        super.act();
    }
}
