import java.util.ArrayList;
public class Persona{
    private String nombre,sexo;
    private int edad;
    private ArrayList<Persona> amigos;
    public Persona(String nombre,String sexo,int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
        amigos=new ArrayList();
    }
    public String getNombre(){
        return nombre;
    }
    public String getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public void agregarAmigos(Persona p){
        amigos.add(p);
    }
    /*public void mostrarAmigosEnComun2(Persona p1,Persona p2){
        if(p1.amigos.contains(p2)&&p2.amigos.contains(p1)){
            System.out.println("Amigos en comun:");
            String nom1,nom2,sexo1,sexo2;
            int edad1,edad2;
            for(Persona per1:p1.amigos){
                nom1=per1.getNombre();
                sexo1=per1.getSexo();
                edad1=per1.getEdad();
                for(Persona per2:p2.amigos){
                    nom2=per2.getNombre();
                    sexo2=per2.getSexo();
                    edad2=per2.getEdad();
                    if(nom1.equals(nom2)&&sexo1.equals(sexo2)&&(edad1==edad2))
                        System.out.println(nom1+" de sexo "+sexo1+" de "+edad1+" anios.");
                }
            }
        }
        else 
            System.out.println("No son amigos en comun");
    }*/
    public void mostrarAmigosEnComun(Persona p){
        if(amigos.contains(p)&&p.amigos.contains(this)){
            System.out.println("Amigos en comun:");
            String nom1,nom2,sexo1,sexo2;
            int edad1,edad2;
            for(Persona per1:p.amigos){
                nom1=per1.getNombre();
                sexo1=per1.getSexo();
                edad1=per1.getEdad();
                for(Persona per2:amigos){
                    nom2=per2.getNombre();
                    sexo2=per2.getSexo();
                    edad2=per2.getEdad();
                    if(nom1.equals(nom2)&&sexo1.equals(sexo2)&&(edad1==edad2))
                        System.out.println(nom1+" de sexo "+sexo1+" de "+edad1+" anios.");
                }
            }
        }
        else 
            System.out.println("No son amigos en comun");
    }
}
