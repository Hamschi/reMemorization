import greenfoot.*;  

public class ElshinZentrum extends Elshin
{
    public ElshinZentrum()
    {
        prepare();
    }
    
        private void prepare()
    {
        for (int i = 0; i<24; i++)
        {
            addObject(new Mauer(), (14+(26*i)), 389);
            addObject(new Mauer(), (14+(26*i)), 14);
        } 
        
        for (int i = 0; i<14; i++)
        {
            addObject(new Mauer(), (14), 40+(26*i));
        } 
        
        for (int i = 0; i<14; i++)
        {
            addObject(new Mauer(), (586), 40+(26*i));
        } 
        
        for (int i = 0; i<20; i++)
        {
            addObject(new NachWald2(), (570), 30+(20*i));
        }

    }
}
