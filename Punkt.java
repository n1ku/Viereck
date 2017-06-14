
/**
 * Beschreiben Sie hier die Klasse Punkt.
 * 
 * @author (n1k)
 * @version (14062017)
 */
public class Punkt
{
    private int xAchse;
    private int yAchse;
    private int posX;
    private

    /**
     * X-Achse angeben
     * Y-Achse angeben
     */
    public  Punkt(int x, int y)
    {
        this.xAchse = x;
        this.yAchse = y;
    }

    // setzt Wert für x Achse
    public void setzeX(int x)
    {
        this.xAchse = x;
    }

    // setzt Wert für y Achse
    public void setzeX(int y)
    {
        this.yAchse = y;
    }

    // gibt Position von Y zurück
    public int gib()
    {
        return this.yAchse;
    }
}
