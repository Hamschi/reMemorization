import greenfoot.*;  

public class UnterwasserEingang extends Unterwasser
{
  Wald3 wald3;

    public UnterwasserEingang(Emrael em, Wald3 wald)
    {   
        wald3 = wald;
        setPaintOrder(Emrael.class,Unsichtbar.class, Hoehle.class);
        prepare();
    }
    
    private void prepare()
    {
        Hoehle hoehle = new Hoehle();
        addObject(hoehle, 526, 169);
        Kreis kreis = new Kreis();
        addObject(kreis, 138, 208);
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
        
        UnterwasserBoss unterwasserBoss = new UnterwasserBoss(this);
        for (int i = 0; i<3; i++)
        {
            // Portale inDieHoehle = new Portale(this, unterwasserBoss);
            // inDieHoehle.setPortalFix(46, 200);
            // addObject(inDieHoehle, (515), 214+(16*i));
            addObject(new Portale(this, unterwasserBoss), 515, 214+(16*i));
        } 

        Portale nachWald3 = new Portale(this, wald3);
        nachWald3.setPortalFix(378, 71);
        addObject(nachWald3, 137, 209);

    }
}


