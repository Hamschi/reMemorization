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
        Deko teich = new Deko("Teich.png");
        addObject(teich, 496, 100);
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis("Baum.png"), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis("Baum.png"), (30), 101+(71*i));
        } 
        
        for (int i = 0; i<3; i++)
        {
            addObject(new Hindernis("Baum.png"), (570), 243+(71*i));
        } 
        
        addObject(new Mob(300, 1500, 100, 5, "Krake.PNG"), 159, 248);
        addObject(new Mob(300, 1500, 100, 5, "Krake.PNG"), 313, 163);
        addObject(new Mob(300, 1500, 100, 5, "Krake.PNG"), 477, 286);
        
        Hindernis herb = new Hindernis("Herb.PNG");
        addObject(herb , 86, 88);
        
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
        }
        
        for (int i = 0; i<10; i++)
        {
            Portale insWasser = new Portale(this, unterwasserEingang);
            insWasser.setPortalFix(158, 208);
            addObject(insWasser, 410+(20*i), 130);
        }
    }
}
