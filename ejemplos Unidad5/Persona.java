public class Persona{
    private String nombre;
    private int edad, ci;
    public Persona(String nombre, int edad, int ci){
        this.nombre=nombre;
        this.edad=edad;
        this.ci=ci;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getCi(){
        return ci;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setCi(int ci){
        this.ci=ci;
    }
}
