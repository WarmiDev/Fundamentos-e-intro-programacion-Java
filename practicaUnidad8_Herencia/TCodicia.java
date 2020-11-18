public class TCodicia extends Trampa{
    public String mostrarCaracteristicasCasilla(){
        return "Pierdes tantos turnos como cantidad de monedas de oro o pierdes la mitad de tus monedas de oro";
    }
    public int efectoCasilla(Jugador j){
        if(j.getMonedasOro()>=2){
            j.setMonedasOro(j.getMonedasOro()/2);  
            return -1;
        } 
        else//pierde tantos turnos como monedas de oro
             return 1;
    }
}