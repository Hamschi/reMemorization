import greenfoot.*;  

public class Banditenteil extends Elshin
{
    Emrael emrael;
    Textbox textbox;
    ElshinZentrum elshinZentrum;
    
    public Banditenteil(ElshinZentrum ez)
    {
        elshinZentrum = ez;
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

        for (int i = 0; i<11; i++)
        {
            Portale p = new Portale(this, ez);
            p.setPortalFix(530, 320);
            addObject(p, (10), 49+(30*i));
        } 
        
        prepare();
    }
    
    private void prepare()
    {

    }

}
