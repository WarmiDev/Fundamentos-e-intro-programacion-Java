public class Hijo{
    public String nombre;
    public int edad;
    public Hijo(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}
