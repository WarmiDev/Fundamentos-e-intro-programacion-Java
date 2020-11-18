public class Negro extends Casilla{
    public Negro(){
        super('n');
    }
    public String mostrarCaracteristicasCasilla(){
        return "Los ptsEspiritu incrementan en 3";
    }
    public int efectoCasilla(Jugador j){
        j.setPtsEspiritu(j.getPtsEspiritu()+3);
        return -1;
    }
}
