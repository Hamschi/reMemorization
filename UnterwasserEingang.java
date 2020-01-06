import greenfoot.*;  

public class UnterwasserEingang extends Unterwasser
{
    Wald3 wald3;
    public UnterwasserEingang(Emrael em, Wald3 wald)
    {   
        wald3 = wald;
        prepare();
    }
    
    private void prepare()
    {
        Hoehle hoehle = new Hoehle();
        addObject(hoehle, 526, 169);
        Emrael emrael = new Emrael();
        addObject(emrael, 300, 300);
        for (int i = 0; i<13; i++)
        {
            addObject(new Fels(), (21+(45*i)), 382);
            addObject(new Fels(), (21+(45*i)), 19);
        } 
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Fels(), (21), 63+(45*i));
            addObject(new Unsichtbar(), (532), 143+(16*i));
        } 
        
        for (int i = 0; i<2; i++)
        {
            addObject(new Fels(), (561), 63+(45*i));
            addObject(new Fels(), (561), 288+(45*i));
        } 
        
        for (int i = 0; i<3; i++)
        {
            addObject(new Unsichtbar(), (515), 214+(16*i));
        } 
        
        for (int i = 0; i<10; i++)
        {
            Portale nachWald3 = new Portale(this, wald3);
            nachWald3.setPortalFix(100, 320);
            addObject(nachWald3, (234+(20*i)), 5);
        }
    }
}


