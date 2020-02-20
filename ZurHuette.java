import greenfoot.*; 
import java.util.List;

public class ZurHuette extends Portale
{
    Emrael emrael;
    ZurHuette(World from) {
        this.from = from;
        List<Emrael> emraels = from.getObjects(Emrael.class);
        this.to = new Huette(emraels.get(0), from);
    }
}
