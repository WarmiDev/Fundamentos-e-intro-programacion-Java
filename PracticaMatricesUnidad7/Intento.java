public class Intento{
    private int fila,columna,valor;
    private String simbolo;
    public Intento(int fila,int columna,int valor,String simbolo){
        this.fila=fila;
        this.columna=columna;
        this.valor=valor;
        this.simbolo=simbolo;
    }
    public int getFila(){
        return fila;
    }
    public int getColumna(){
        return columna;
    }
    public int getValor(){
        return valor;
    }
    public String getSimbolo(){
        return simbolo;
    }
}
