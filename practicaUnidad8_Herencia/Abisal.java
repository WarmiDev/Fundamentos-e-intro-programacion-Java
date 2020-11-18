public class Abisal extends Casilla{
    public Abisal(){
        super('a');
    }
    public String mostrarCaracteristicasCasilla(){
        return "PERDISTE!!!";
    }
    public int efectoCasilla(Jugador j){
        j.estadoJugador=EstadoJugador.PERDIO;
        return 0;
    }
}