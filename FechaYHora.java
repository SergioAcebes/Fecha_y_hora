
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
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString; 
    private int limit;
    private int value;
    /**
     * Constructor de la clase FechaYHora.
     */
    public FechaYHora()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(99);
        hours= new NumberDisplay(24);
        minutes=new NumberDisplay(60);
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
    /**
     * Método para que te devuelva la fecha.
     */
    public String obtenerFechayhora(){
        //Devolverá la fecha en modo dd/MM/aaaa.
        return day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay()  + "-" + year.getTextoDelDisplay();
    }
      /**
     * Método para fijar la fecha que queramos.
     */
    public void fijarFecha(int dia,int mes,int ano){
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);
    }
     /**
     * Método para avanzar un dia.
     */
    public void avanzarFecha(){
        day.incrementaValorAlmacenado();
        if (day.getValorAlmacenado()==1){
            month.incrementaValorAlmacenado();
            if (month.getValorAlmacenado()== 1){
                year.incrementaValorAlmacenado();

            }
        }
    }
}
