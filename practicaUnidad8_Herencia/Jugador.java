public class Jugador{
    int ptsEspiritu,monedasOro,posicion;
    char ficha;
    boolean estado;
    public Jugador(String nombre){
        ficha=nombre.charAt(0);
        ptsEspiritu=0;
        monedasOro=0;
        posicion=-1;
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
}
