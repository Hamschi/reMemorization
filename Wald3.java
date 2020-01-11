import greenfoot.*;  

public class Wald3 extends Wald
{
    private Emrael emrael;
    Wald2 wald2;

    public Wald3(Emrael em, Wald2 w2)
    {   
        wald2 = w2;
        emrael = new Emrael(em);
        addObject(emrael, 100, 100);
        emrael.addLebensleiste();
        prepare();
    }
    
    public Wald3()
    {    
        wald2 = new Wald2();
        emrael = new Emrael();
        addObject(emrael, 100, 320);
        emrael.addLebensleiste();
        emrael.setBewegungBlockiert(false);
        prepare();
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
        UnterwasserEingang unterwasserEingang = new UnterwasserEingang(emrael, this);
        for (int i = 0; i<7; i++)
        {
            Portale insWasser = new Portale(this, unterwasserEingang);
            insWasser.setPortalFix(158, 208);
            addObject(insWasser, (410), 11+(20*i));
            addObject(insWasser, (410)+(27*i), 132); //Hilfe
        }
    }
}
