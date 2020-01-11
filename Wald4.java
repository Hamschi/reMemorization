import greenfoot.*;  

public class Wald4 extends Wald
{
    private Emrael emrael;
    Wald2 wald2;

    public Wald4(Emrael em, Wald2 w2)
    {   emrael = new Emrael(em);
        addObject(emrael, 100, 100);
        emrael.addLebensleiste();
        wald2 = w2;
        prepare();
    }
    
    public Wald4() {
        emrael = new Emrael();
        addObject(emrael, 100, 320);
        emrael.addLebensleiste();
        emrael.setBewegungBlockiert(false);
        wald2 = new Wald2();
        prepare();
    }
    
    private void prepare()
    {
        for (int i = 0; i<6; i++)
        {
            addObject(new Hindernis("Baum.png"), (30), 30+(71*i));
        } 
        
        for (int i = 0; i<6; i++)
        {
            addObject(new Hindernis("Baum.png"), (570), 30+(71*i));
        } 
        
        for (int i = 0; i<6; i++)
        {
            addObject(new Hindernis("Baum.png"), (213+(61*i)), 30);
        } 
 
        
        for (int i = 0; i<7; i++)
        {
            addObject(new Hindernis("Baum.png"), (30+(61*i)), 172);
            addObject(new Hindernis("Baum.png"), (152+(61*i)), 314);
        }
      
        for (int i = 0; i<7; i++)
        {
            Portale nw2 = new Portale(this, wald2);
            nw2.setPortalFix(300,320);
            addObject(nw2, 61+(20*i), 40);
        }
        ElshinZentrum elshin = new ElshinZentrum(emrael, this);
        for (int i = 0; i<30; i++)
        {
            Portale nachElshin = new Portale(this, elshin);
            nachElshin.setPortalFix(300, 70);
            addObject(nachElshin, (30+(20*i)), 450);
        }
    }
}
