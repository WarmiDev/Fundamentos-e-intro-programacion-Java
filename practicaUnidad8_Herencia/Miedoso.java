public class Miedoso extends Casilla{
    public Miedoso(){
        super('m');
    }
    public String mostrarCaracteristicasCasilla(){
        return "Retrocede tantas casillas como ptsEspirutu tenga";
    }
    public int efectoCasilla(Jugador j){
        return 0;
    }
}