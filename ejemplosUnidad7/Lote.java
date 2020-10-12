public class Lote{
    private String propietario;
    private int cantPersonas;
    public Lote(int cant,String prop){
        propietario=prop;
        cantPersonas=cant;
    }
    public String getPropietario(){
        return propietario;
    }
    public int getCantPersonas(){
        return cantPersonas;
    }
    public void setPropietario(String p){
        propietario=p;
    }
    public void setCantPersonas(int c){
        cantPersonas=c;
    }
}
