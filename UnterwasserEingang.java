import greenfoot.*;  

public class UnterwasserEingang extends Unterwasser
{
    Wald3 wald3;

    public UnterwasserEingang(Emrael em, Wald3 wald)
    {   
        wald3 = wald;
        setPaintOrder(Lebensleiste.class, Emrael.class,Hindernis.class, Deko.class);
        prepare();
    }
    
    public UnterwasserEingang()
    {
        setPaintOrder(Lebensleiste.class, Emrael.class,Hindernis.class, Deko.class);
        prepare();
    }
    
    private void prepare()
    {
        Emrael emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 250, 150);
        emrael.addLebensleiste();
        
        Deko hoehle = new Deko("Hoehle.png");
        addObject(hoehle, 526, 169);
        Deko kreis = new Deko("Kreis.png");
        addObject(kreis, 138, 208);
        for (int i = 0; i<13; i++)
        {
            addObject(new Hindernis("Fels.png"), (21+(45*i)), 382);
            addObject(new Hindernis("Fels.png"), (21+(45*i)), 19);
        } 
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Hindernis("Fels.png"), (21), 63+(45*i));
            addObject(new Hindernis(), (532), 143+(16*i));
        } 
        
        for (int i = 0; i<2; i++)
        {
            addObject(new Hindernis("Fels.png"), (561), 63+(45*i));
            addObject(new Hindernis("Fels.png"), (561), 288+(45*i));
        } 
        
        UnterwasserBoss unterwasserBoss = new UnterwasserBoss(this);
        for (int i = 0; i<3; i++)
        {
            Portale inDieHoehle = new Portale(this, unterwasserBoss);
            inDieHoehle.setPortalFix(57, 200);
            addObject(inDieHoehle, (515), 214+(16*i));
            //addObject(new Portale(this, unterwasserBoss), 515, 214+(16*i));
        } 
        
        addObject(new Mob(300, 1000, 80, 10, 150, "HelmKrabbe.png"), 239, 97);
        addObject(new Mob(300, 1000, 80, 10, 150, "HelmKrabbe.png"), 281, 286);
        
        Busch beeren = new Busch();
        addObject(beeren, 71, 336);

        Portale nachWald3 = new Portale(this, wald3);
        nachWald3.setPortalFix(378, 71);
        addObject(nachWald3, 137, 209);

    }
}


