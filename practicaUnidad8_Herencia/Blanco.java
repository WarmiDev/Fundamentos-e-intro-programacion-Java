public class Blanco extends Casilla{
    public Blanco(){
        super('b');
    }
    public String mostrarCaracteristicasCasilla(){
        return "Las monedasOro incrementan en 3";
    }
    public int efectoCasilla(Jugador j){
        j.setMonedasOro(j.getMonedasOro()+3);
        return -1;
    }
}