public class Jugador extends Casilla{
    int ptsEspiritu,monedasOro,posicion;
    EstadoJugador estadoJugador;
    public Jugador(char inicial){
        super(inicial);
        ptsEspiritu=0;
        monedasOro=0;
        posicion=0;
        estadoJugador= EstadoJugador.JUGANDO;
    }
    public String mostrarCaracteristicasCasilla(){
        return "Jugador con ficha: "+ficha;
    }
    public char getFicha(){
        return ficha;
    }
    public int getPtsEspiritu(){
        return ptsEspiritu;
    }
    public int getMonedasOro(){
        return monedasOro;
    }
    public int getPosicion(){
        return posicion;
    }
    public void setPtsEspiritu(int p){
        ptsEspiritu=p;
    }
    public void setMonedasOro(int m){
        monedasOro=m;
    }
    public void setPosicion(int p){
        posicion=p;
    }
    public int efectoCasilla(Jugador j){
        return 0;
    }
}
