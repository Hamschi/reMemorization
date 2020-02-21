import greenfoot.*;  
import java.util.List;


public class Wald3 extends Wald
{
    private Emrael emrael;
    Wald2 wald2;
    Kraut herb;

    public Wald3(Emrael em, Wald2 w2)
    {   
        wald2 = w2;
        emrael = new Emrael(em);
        addObject(emrael, 100, 100);
        emrael.addLebensleiste();
        prepare();
    }
    
    public Wald3()
    {    
        wald2 = new Wald2();
        emrael = new Emrael();
        addObject(emrael, 100, 320);
        emrael.addLebensleiste();
        emrael.setBewegungBlockiert(false);
        prepare();
    }
    
    private void prepare()
    {
        Deko teich = new Deko("Teich.png");
        addObject(teich, 496, 100);
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis("Baum.png"), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis("Baum.png"), (30), 101+(71*i));
        } 
        
        for (int i = 0; i<3; i++)
        {
            addObject(new Hindernis("Baum.png"), (570), 243+(71*i));
        } 
        
        addObject(new Mob(300, 1000, 80, 10, 120, "Krake.PNG"), 102, 154);
        addObject(new Mob(300, 1000, 80, 10, 120, "Krake.PNG"), 183, 95);
        
        herb = new Kraut();
        addObject(herb , 86, 88);
        
        for (int i = 0; i<30; i++)
        {
            NachWald2 nw2 = new NachWald2(this, wald2);
            nw2.setPortalFix(300, 80);
            addObject(nw2, (30+(20*i)), 450);
        }
        
        UnterwasserEingang unterwasserEingang = new UnterwasserEingang(emrael, this);
        for (int i = 0; i<7; i++)
        {
            Portale insWasser = new Portale(this, unterwasserEingang);
            insWasser.setPortalFix(158, 208);
            addObject(insWasser, (410), 11+(20*i));
        }
        
        for (int i = 0; i<10; i++)
        {
            Portale insWasser = new Portale(this, unterwasserEingang);
            insWasser.setPortalFix(158, 208);
            addObject(insWasser, 410+(20*i), 130);
        }
    }
    
    public void wald3Skript()
    {
        switch(emrael.phase)
        {
            case BotanTreffen:
                if((emrael.istInNaeheVonKraut() == true) && (Greenfoot.isKeyDown("space")))
                {
                    skriptWald3BotanTreffen(emrael);
                    botanHinzufuegen();
                }
                break;
            case BotanBesiegt:
                int mobs = getObjects(Mob.class).size();
                if(mobs ==0)
                {
                    skriptWald3BotanBesiegt(emrael);
                }
            case DritterHuettenbesuch:
                if((emrael.istInNaeheVonKraut() == true) && (Greenfoot.isKeyDown("space")))
                {
                    removeObject(herb);
                }
        }
    }
    public void botanHinzufuegen()
    {
        addObject(new Mob(300, 1000, 80, 10, 200, "botan.png"), 139, 93);
    }
    public boolean krautNochDa()
    {
        int kraut = getObjects(Kraut.class).size();
        if(kraut>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void skriptWald3BotanTreffen(Emrael emrael) {
            Textbox textbox = new BotanTreffen(emrael);
            addObject(textbox, 300,350);
    }
    public void skriptWald3BotanBesiegt(Emrael emrael) {
            Textbox textbox = new BotanBesiegt(emrael);
            addObject(textbox, 300,350);
    }
}
