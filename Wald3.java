import greenfoot.*;  

public class Wald3 extends Wald
{
    Hindernis[] baumArray = new Hindernis[10];
    Portale[] nachWald2Array = new NachWald2[20];
    
    
    public Wald3()
    {    
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
            //addObject(new NachWald2(), (30+(20*i)), 450);
        }
    }
}
