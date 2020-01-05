import greenfoot.*;  

public class Pizaron extends NPC
{
    private GreenfootImage up = new GreenfootImage("Pizaron_hl.png");
    private GreenfootImage down = new GreenfootImage("Pizaron_vl.png");
    private GreenfootImage left = new GreenfootImage("Pizaron_lige.png");
    private GreenfootImage right = new GreenfootImage("Pizaron_rege.png");
    //Emrael emrael;
    // public Phase phase;
    
    // public Pizaron()
    // {
        // phase = Phase.Wald1Einfuehrung;
    // }
    
    public void setBild(String bild) {
        setImage(bild);
    }
    
    // public void act() 
    // {
        // if (this.phase == Phase.Wald2VorMobs) {
            // this.setLocation(getX()-88, getY());
            // this.setLocation(getX(), getY()+242);
        // }
    // }    
    
    // public enum Phase {
        // Wald1Einfuehrung,
        // ErsterHuettenbesuch,
        // Wald2VorMobs,
        // Wald2Tutorial,
        // Wald2Beeren,
        // WaldBeerenGegessen,
        // WaldBeerenErklaert
    // }
}
