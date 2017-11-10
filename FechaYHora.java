
/**
 * Ejercicio que nos permitira crear un objeto que nos almacenara la fecha y la hora.
 *
 * @Sergio Acebes
 * version 10/11/2017
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
     * Constructor de la clase FechaYHora.
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
