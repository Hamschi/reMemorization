import greenfoot.*;  

public class ElshinWohngebiet extends Elshin
{
    public ElshinWohngebiet()
    {
        prepare();
    }
    
        private void prepare()
    {
        Gebaeude1 gebaeude1 = new Gebaeude1();
        addObject(gebaeude1, 127, 103);
        Gebaeude2 gebaeude2 = new Gebaeude2();
        addObject(gebaeude2, 470, 103);
        Gebaeude3 gebaeude3 = new Gebaeude3();
        addObject(gebaeude3, 127, 248);
        Gebaeude4 gebaeude4 = new Gebaeude4();
        addObject(gebaeude4, 470, 248);
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
