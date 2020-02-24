import greenfoot.*; 
import java.lang.*;
import java.util.List;

public class Emrael extends Actor
{
    private GreenfootImage up = new GreenfootImage("Emrael_hl.png");
    private GreenfootImage down = new GreenfootImage("Emrael_vl.png");
    private GreenfootImage left = new GreenfootImage("Emrael_lige.png");
    private GreenfootImage right = new GreenfootImage("Emrael_rege.png");
    Lebensleiste lebensleiste;
    public Phase phase;
    private int leben;
    private int schnelligkeit;
    private int rüstung;
    public boolean bewegungBlockiert;
    public boolean willHeilen;
    private long letzterAngriffStart;
    private int mobRichtungX;
    private int mobRichtungY;
    private int angriffsdauer = 300; // in millisekunden
    private Mob target;
    private int schaden = 30;
    private int anzahlMobs;
    Wald1 wald1;
    Wald2 wald2;
    Wald3 wald3;
    Huette huette;
    ElshinZentrum elshinZentrum;
    Pizaron piz;
    Unterwasser unterwasser;
    private int heilen = 1;
   
    
    public Emrael() {
        lebensleiste = new Lebensleiste();
        phase = Phase.Wald1Einfuehrung;
        bewegungBlockiert = true;
        letzterAngriffStart = 0;
    }
    
    public void setBild(String bild) {
        setImage(bild);
    }
    
    public void addLebensleiste() {
        getWorld().addObject(lebensleiste, 100, 40);
        getWorld().setPaintOrder(Lebensleiste.class);
    }
    
    public Lebensleiste getLebensleiste() {
        return lebensleiste;
    }
    
    public Emrael(Emrael alterEmrael) {
        lebensleiste = new Lebensleiste(alterEmrael.getLebensleiste().getLeben());
        phase = alterEmrael.phase;
        letzterAngriffStart = 0;
    }
    
    public void setBewegungBlockiert(boolean b) {
        bewegungBlockiert = b;
    }
    
    private void setImage(){
        if(Greenfoot.isKeyDown("left")) 
            setImage(left);
        if(Greenfoot.isKeyDown("right"))
            setImage(right);
        if(Greenfoot.isKeyDown("up"))
            setImage(up);
        if(Greenfoot.isKeyDown("down"))
            setImage(down);
        
        if(Greenfoot.isKeyDown("a"))
        setImage(left);
        if(Greenfoot.isKeyDown("d"))
            setImage(right);
        if(Greenfoot.isKeyDown("w"))
            setImage(up);
        if(Greenfoot.isKeyDown("s"))
            setImage(down);
    }
    
    public void act(){
        if (lebensleiste.getLeben() == 0) {
            bewegungBlockiert = true;
        }
        if (bewegungBlockiert) 
            return;
            
        setImage();
        int lastX = getX();
        int lastY = getY();
        // bewegen
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
            setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
            setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+3);
        // Position zuruecksetzen bei einem Hindernis
        boolean istAmRand = (getY()<16 || getY()>382 || getX()<17 || getX()>583);
        if (isTouching(Hindernis.class) || isTouching(NPC.class) || istAmRand || isTouching(Busch.class) || isTouching(Bewohner.class) || isTouching(Pizaron.class) || isTouching(Kraut.class) || isTouching(Kugel.class) || isTouching(Barkeeper.class)) 
        {
            setLocation(lastX, lastY);
        }
        // angreifen
        if (isTouching(Mob.class) && Greenfoot.isKeyDown("1")) {
            angreifen((Mob)getOneIntersectingObject(Mob.class));
        }
        angriffFortsetzen();
        emraelWillHeilen();
        if(getWorld() instanceof Wald2)
        {
        Wald2 wald2 = (Wald2) getWorld();
            wald2.wald2Skript();
        }
    
        if(getWorld() instanceof Wald1)
        {
            Wald1 wald1 = (Wald1) getWorld();
            wald1Skript(wald1);
        }
    
        if(getWorld() instanceof Huette)
        {
            Huette huette = (Huette) getWorld();
            huetteSkript(huette);
        }
        
        if(getWorld() instanceof Wald3)
        {
            Wald3 wald3 = (Wald3) getWorld();
            wald3.wald3Skript();
        }
        
        if(getWorld() instanceof UnterwasserBoss)
        {
            UnterwasserBoss unterwasserBoss = (UnterwasserBoss) getWorld();
            unterwasserBoss.unterwasserBossSkript();
        }
        
        if(getWorld() instanceof ElshinZentrum)
        {
            ElshinZentrum elshinZentrum = (ElshinZentrum) getWorld();
            elshinZentrum.elshinZentrumSkript();
        }
        
        if(getWorld() instanceof Taverne)
        {
            Taverne taverne = (Taverne) getWorld();
            taverne.taverneSkript();
        }
        
        if(getWorld() instanceof Zimmer)
        {
            Zimmer zimmer = (Zimmer) getWorld();
            zimmer.zimmerSkript();
        }
        
        if(getWorld() instanceof Banditenteil)
        {
            Banditenteil banditenteil = (Banditenteil) getWorld();
            banditenteil.banditenteilSkript();
        }
        //emraelHeilt();
        // kampfBradleyHeilen();
        //System.out.println(phase);
    }
    
    public void angreifen(Mob mob) {
       // wenn ein Mob in der Nähe ist und noch kein Angriff gestartet wurde, starte den Angriff
       if (intersects(mob) && letzterAngriffStart == 0) {
           letzterAngriffStart  = System.currentTimeMillis();
           mobRichtungX = mob.getX() - getX();
           mobRichtungY = mob.getY() - getY();
           setLocation(getX() - mobRichtungX, getY() - mobRichtungY);
           target = mob;
       }
    }
    
    public void angriffFortsetzen() {
       long jetzt = System.currentTimeMillis();
       // wenn Angriff gestartet wurde, lasse Emrael zum Mob laufen
       if (target != null && letzterAngriffStart != 0 && (jetzt - letzterAngriffStart >= angriffsdauer)) {
           setLocation(getX() + mobRichtungX, getY() + mobRichtungY);
           letzterAngriffStart = 0;
           target.schadenNehmen(schaden);
       }
    }
    
    private void emraelWillHeilen()
    {
        int emraelNaeheBusch= getObjectsInRange(80, Busch.class).size();
        if((emraelNaeheBusch>0) && (Greenfoot.isKeyDown("space")))
        {
            lebensleiste.heilung();
        }
    }
    private void emraelHeilt()
    {
        if((Greenfoot.isKeyDown("2")) && ((this.phase ==Emrael.Phase.BarbarKonflikt) || (this.phase == Emrael.Phase.BarbarBesiegt) || (this.phase == Emrael.Phase.ElshinEnde)))
        {
            lebensleiste.heilung();
        }
    }
    public int getXNachPortal() {
       if (getX() < 60)
           return 540;
       if  (getX() > 540)
           return 60;
       return getX();
    }
    
    public int getYNachPortal() {
       if (getY() < 60)
           return 340;
       if (getY() > 340)
           return 60;
       return getY();
    }

    
    public boolean istInNaeheVonBusch()
    {
        return getObjectsInRange(70, Busch.class).size() > 0;
    }
    public boolean istInNaeheVonKraut()
    {
        return getObjectsInRange(70, Kraut.class).size() > 0;
    }
    public boolean istInNaeheVonBarkeeper()
    {
        return getObjectsInRange(120, Barkeeper.class).size() > 0;
    }
    public boolean istInNaeheVonBett()
    {
        return getObjectsInRange(70, Bett.class).size() > 0;
    }
    public boolean istInNaeheVonKugel()
    {
        return getObjectsInRange(70, Kugel.class).size() > 0;
    }
    
    public void kampfBradleyHeilen()
    {
        if(this.phase == Emrael.Phase.BradleyKonflikt)
        {
            while(this.phase == Emrael.Phase.BradleyKonflikt)
            {
                if(heilen%10==0)
                {
                    lebensleiste.heilung();
                    heilen++;
                }
                else
                {
                    heilen++;
                }
            }
        }
    }
    
    public void wald1Skript(Wald1 wald1)
    {
        switch(phase)
        {
            case VorWald2Tutorial:
                wald1.pizaronLaeuft();
                this.phase = Emrael.Phase.Wald2Tutorial;
                break;
            case BarbarKonflikt:
                wald1.skriptBarbarKonflikt(this);
                break;
            case BarbarBesiegt:
                int anzahlMobs= getObjectsInRange(600, Mob.class).size();
                wald1.setBarbarPosition();
                if(anzahlMobs==0)
                {
                    wald1.barbarWirdZuPizaron();
                    wald1.skriptBarbarBesiegt(this);
                    break;
                }
        }
    }   
    
    public void huetteSkript(Huette huette) 
    {
        switch(phase)
        {
            // case ErsterHuettenbesuch:
                // skriptErsterHuettenbesuch(emrael, pizaron);
                // break;
            case ZweiterHuettenbesuch:
                huette.skriptZweiterHuettenbesuch(this);
                break;
            case DritterHuettenbesuch:
                huette.skriptDritterHuettenbesuch(this); 
                break;
            case VierterHuettenbesuch:
                huette.skriptVierterHuettenbesuch(this);
                break;
            case FuenfterHuettenbesuch:
                huette.skriptFuenfterHuettenbesuch(this);
                break;
            case BarbarBesiegt:
                huette.pizaronEntfernen();
                break;
            case ElshinEnde:
                huette.pizaronEntfernen();
        }
    }
    public enum Phase 
    {
        Wald1Einfuehrung,
        ErsterHuettenbesuch,
        VorWald2Tutorial,
        Wald2Tutorial,
        Wald2Beeren,
        Wald2BeerenGegessen,
        Wald2BeerenErklaert,
        PizaronSollWeg,
        ZweiterHuettenbesuch,
        BotanTreffen,
        BotanBesiegt,
        HatKraut,
        DritterHuettenbesuch,
        HydreixTreffen,
        HydreixBesiegt,
        VierterHuettenbesuch,
        AnkunftElshin,
        WirtTreffen,
        EmraelAusgeruht,
        FuenfterHuettenbesuch,
        HinweisBanditen,
        BradleyKonflikt,
        BradleyBesiegt,
        //CelestiaAnsprechen,
        Gedankending,
        KriegserklaerungBarbar,
        BarbarKonflikt,
        BarbarBesiegt,
        ElshinEnde,
        Zwischenphase
    }
}
