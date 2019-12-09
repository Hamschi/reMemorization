import greenfoot.*;  

public class NachWald1 extends Portale
{
    NachWald1() { //optional
        from = getWorld();
        to = new Wald1();
    }
    
    NachWald1(World from, World to) {
        setImage(new GreenfootImage("Fußmatte.png"));
        this.from = from;
        this.to = to;
    }
}
