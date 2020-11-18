public class Ganador extends Casilla{
    public Ganador(){
        super('g');
    }
    public String mostrarCaracteristicasCasilla(){
        return "GANASTE!!!";
    }
    public int efectoCasilla(Jugador j){
        j.estadoJugador=EstadoJugador.GANO;
        return 0;
    }
}