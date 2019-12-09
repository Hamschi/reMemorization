import greenfoot.*; 
import java.util.List;

public class ZurHuette extends Portale
{
    ZurHuette(World from) {
        this.from = from;
        List<Emrael> emraels = from.getObjects(Emrael.class);
        this.to = new Huette(emraels.get(0), from);
    }
}
