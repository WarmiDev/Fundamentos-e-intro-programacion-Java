import java.util.Calendar;
import java.util.GregorianCalendar;
public class Hora{
    private int hora;
    private int minutos;
    private int segundos;
    public Hora(){
        Calendar calendario=new GregorianCalendar();
        hora=calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND);
    }
    public String getHora(){
        return hora+":"+minutos+":"+segundos;
    }
}
