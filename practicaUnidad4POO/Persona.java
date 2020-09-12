public class Persona{
    private String nombre;
    private int edad;
    public Persona(String nombreN, int edadN){
        nombre=nombreN;
        edad=edadN;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}