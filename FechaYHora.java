
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;
    private NumberDisplay hora;
    private NumberDisplay minutos;
    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(99);
        hora= new NumberDisplay(24);
        minutos=new NumberDisplay(60);
    }
}
