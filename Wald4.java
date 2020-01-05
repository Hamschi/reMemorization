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
    
    private void prepare()
    {
        for (int i = 0; i<6; i++)
        {
            addObject(new Baum(), (30), 30+(71*i));
        } 
        
        for (int i = 0; i<6; i++)
        {
            addObject(new Baum(), (570), 30+(71*i));
        } 
        
        for (int i = 0; i<6; i++)
        {

            addObject(new Baum(), (213+(61*i)), 30);
        } 
 
        
        for (int i = 0; i<7; i++)
        {
            addObject(new Baum(), (30+(61*i)), 172);
            addObject(new Baum(), (152+(61*i)), 314);
        }
        
        for (int i = 0; i<7; i++)
        {
            //addObject(new NachWald2(), 61+(20*i), 40);
        }
        
        for (int i = 0; i<30; i++)
        {
            addObject(new InsZentrumElshin(), (30+(20*i)), 450);
        }
    }
}
