public class Suertudo extends Casilla{
    public Suertudo(){
        super('s');
    }
    public String mostrarCaracteristicasCasilla(){
        return "Vuelves a lanzar el dado";
    }
    public int efectoCasilla(Jugador j){
        return 1;
    }
}