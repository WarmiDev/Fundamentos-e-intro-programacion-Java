public class Estudiante{
    private String nombre;
    private int nota1,nota2;
    public Estudiante(String nombre,int nota1,int nota2){
        this.nombre=nombre;
        this.nota1=nota1;
        this.nota2=nota2;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNota1(){
        return nota1;
    }
    public int getNota2(){
        return nota2;
    }
}
