public class Ficha{
    private String nombre;
    public Ficha(int turno){
        if(turno<10)
            nombre="C1-0"+turno;
        else
            nombre="C1-"+turno;
    }
    public String getNombre(){
        return nombre;
    }
}
