import greenfoot.*;  

public class Wald3 extends Wald
{
    private Emrael emrael;
    Wald2 wald2;

    public Wald3(Emrael em, Wald2 w2)
    {   emrael = new Emrael(em);
        addObject(emrael, 100, 100);
        emrael.addLebensleiste();
        wald2 = w2;
        prepare();
    }
    
    public Wald3()
    {    
        prepare();
        wald2 = new Wald2();
    }
    
    private void prepare()
    {
        Teich teich = new Teich();
        addObject(teich, 496, 100);
        for (int i = 0; i<5; i++)
        {
            addObject(new Baum(), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Baum(), (30), 101+(71*i));
        } 
        
        for (int i = 0; i<3; i++)
        {
            addObject(new Baum(), (570), 243+(71*i));
        } 
        
        for (int i = 0; i<30; i++)
        {
            NachWald2 nw2 = new NachWald2(this, wald2);
            nw2.setPortalFix(300, 80);
            addObject(nw2, (30+(20*i)), 450);
        }
    }
}
