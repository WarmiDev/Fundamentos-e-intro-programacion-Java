public class Recuerdo{
    private Fecha fecha;
    private String descripcion;
    public Recuerdo(Fecha fecha,String descripcion){
        this.fecha=fecha;
        this.descripcion=descripcion;
    }
    public Fecha getFecha(){
        return fecha;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
