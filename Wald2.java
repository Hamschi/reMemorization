import greenfoot.*;  

public class Wald2 extends Wald
{
    Portale[] nachWald1Array = new NachWald1[20];
    Portale[] nachWald3Array = new NachWald3[20];
    Portale[] nachWald4Array = new NachWald4[20];
    
    public Wald2()
    {    
        prepare();
    }
    
    private void prepare()
    {
        for (int i = 0; i<4; i++)
        {
            addObject(new Baum(), (390+(61*i)), 488);
            addObject(new Baum(), (390+(61*i)), 30);
        } 
        for (int i = 0; i<4; i++)
        {
            addObject(new Baum(), (30+(61*i)), 488);
            addObject(new Baum(), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Baum(), (570), 101+(71*i));
        } 
        
        for (int i = 0; i<20; i++)
        {
            addObject(new NachWald1(), (30), 30+(20*i));
        }
        for (int i = 0; i<7; i++)
        {
            addObject(new NachWald3(), 240+(20*i), 30);
        }
        for (int i = 0; i<7; i++)
        {
            addObject(new NachWald4(), 240+(20*i), 450);
        }
    }
}
