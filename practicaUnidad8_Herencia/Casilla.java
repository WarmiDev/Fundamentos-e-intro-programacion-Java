abstract public class Casilla{
    protected char ficha;
    public Casilla(char s){
        ficha=s;
    }
    abstract public String mostrarCaracteristicasCasilla();
    public char getFicha(){
        return ficha;
    }
}
