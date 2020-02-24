import greenfoot.*;  
import java.util.List; 

public class Wald1 extends Wald
{
    Emrael emrael;
    Textbox textbox;
    private int laufen = 1;
    Pizaron pizaron;
    Mob barbar;
    int xPosition =1;
    int yPosition =1;
    private GreenfootImage right = new GreenfootImage("Pizaron_rege.png");

    public Wald1()
    {    
        prepare();
    }
    
    private void prepare()
    {
        emrael = new Emrael();
        addObject(emrael, 433, 239);
        emrael.addLebensleiste();
        
        Deko hutte = new Deko("Holzhaus.png");
        addObject(hutte, 210, 140);
        ZurHuette zurHuette = new ZurHuette(this);
        zurHuette.setPortalFix(300, 300);
        addObject(zurHuette, 246, 179);
        for (int i = 0; i<10; i++)
        {
            addObject(new Hindernis("Baum.png"), (30+(61*i)), 488);
            addObject(new Hindernis("Baum.png"), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis("Baum.png"), (30), 101+(71*i));
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis(), 130+(20*i), 200);
        }
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Hindernis(), 130+(20*i), 157);
        }
        Hindernis unsichtbar = new Hindernis();
        addObject(unsichtbar, 130, 180);
        Hindernis unsichtbar2 = new Hindernis();
        addObject(unsichtbar2, 285, 180);
        Hindernis unsichtbar3 = new Hindernis();
        addObject(unsichtbar3, 285, 200);
        
        starteSkripte();
    }
    
    public void starteSkripte() {
         switch(emrael.phase) {
         case Wald1Einfuehrung:
            skriptWald1Einleitung();
         }
    }
    
    public void setzePortalNachWald2() {
        if (getObjects(NachWald2.class).size() == 0) {
            Wald2 wald2 = new Wald2(emrael, this);
            for (int i = 0; i<20; i++) {
                addObject(new NachWald2(this, wald2), (570), 30+(20*i));
            }
            emrael.addLebensleiste();
        }
    }
    
    public void pizaronLaeuft()
    {
        Pizaron piz = new Pizaron();
        this.addObject(piz, 392, 313);
        piz.setImage("Pizaron_vl.png");
        switch(laufen)
        {
            case 1:
                skriptVorWald2Tutorial(emrael);
            case 2:
                piz.setImage("Pizaron_rege.png");
                for (int i = 0; i<94; i++)
                {
                    piz.setLocation(piz.getX()+(2), piz.getY());
                    Greenfoot.delay(1);
                }
                removeObject(piz);
        }
    }
    public void pizaronHinzufuegen()
    {
        pizaron = new Pizaron();
        addObject(pizaron, 249, 219);
    }
    public void pizaronWirdZuBarbar()
    {
        barbar = new Mob(300, 1000, 80, 10, 2000, "Barbar.png");
        addObject(barbar, 249, 219);
        removeObject(pizaron);
    }
    public void barbarWirdZuPizaron()
    {
        addObject(pizaron, xPosition, yPosition);
    }
    public void setBarbarPosition()
    {
        int barbarVorhanden= getObjects(Mob.class).size();
        if(barbarVorhanden>0)
        {
            xPosition = barbar.getX();
            yPosition = barbar.getY(); 
        }
    }
    public void pizaronGehtFort()
    {
        pizaron.setImage(right);
        while(pizaron.getX()<575)
        {
            pizaron.setLocation(pizaron.getX()+(2), pizaron.getY());
            Greenfoot.delay(1);
        }
        removeObject(pizaron);
    }
    public int getAnzahlEmrael() {
        int emrael = getObjects(Emrael.class).size();
        return emrael;
    }
    public void skriptWald1Einleitung() {
        textbox = new Wald1Einleitung(emrael);
        addObject(textbox, 300, 350);
    }
    public void skriptVorWald2Tutorial(Emrael emrael) {
        textbox = new VorWald2Tutorial(emrael);
        addObject(textbox, 300, 350);
    }
    public void skriptBarbarKonflikt(Emrael emrael) {
        textbox = new BarbarKonflikt(emrael, this);
        addObject(textbox, 300, 350);
    }
    public void skriptBarbarBesiegt(Emrael emrael) {
        textbox = new BarbarBesiegt(emrael, this);
        addObject(textbox, 300, 350);
    }
}
