/**
 * Permite la creación de un calendario básico,que guarda la fecha utilizando 3
 * atributos enteros y devuelve dicha fecha como una cadena de caracteres de dos dígitos.
 *
 * @author Sergio Acebes Ponga
 * @version 2017.10.27
 */
public class CalendarioBasico{
    //Atributo del día.
    private DisplayDosCaracteres day;
    //Atributo del mes.
    private DisplayDosCaracteres month;
    //Atributo del año.
    private DisplayDosCaracteres year;
    /**
     * Constructor de objetos de la clase CalendarioBasico.
     */
    public CalendarioBasico(){
        //La fecha por defecto del calendario sera 01/01/2001.
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(99);
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

    /**
     * Método para que te devuelva la fecha.
     */
    public String obtenerFecha(){
        //Devolverá la fecha en modo dd/MM/aaaa.
        return day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay()  + "-" + year.getTextoDelDisplay();
    }
}
