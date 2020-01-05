import greenfoot.*;  

public class Banditenteil extends Elshin
{
    Emrael emrael;
    Textbox textbox;
    
    public Banditenteil()
    {
        Kugel kugel = new Kugel();
        addObject(kugel, 500, 196);
        for (int i = 0; i<14; i++)
        {
            addObject(new Mauer(), 586, 40+(26*i));
        } 
        
        for (int i = 0; i<23; i++)
        {
            addObject(new Mauer(), 14+(26*i), 14);
            addObject(new Mauer(), (14+(26*i)), 389);
        }
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Mauer(), 405, 40+(26*i));   
            addObject(new Mauer(), 405, 274+(26*i));
        }
        prepare();
        
        for (int i = 0; i<11; i++)
        {
            addObject(new InsZentrumElshin(), (10), 49+(30*i));
        } 
    }
    
    private void prepare()
    {

    }

}
