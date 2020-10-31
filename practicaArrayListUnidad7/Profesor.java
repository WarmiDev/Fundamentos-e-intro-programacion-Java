import java.util.ArrayList;
public class Profesor{
    private ArrayList<Estudiante> registro;
    public Profesor(){
        registro=new ArrayList();
    }
    public void AgregarEstudiante(Estudiante e){
        registro.add(e);
    }
    public void mostrarAprobados(){
        int prom;
        System.out.println("\nESTUDIANTES APROBADOS:");
        for(Estudiante e:registro){
            prom=(e.getNota1()+e.getNota2())/2;
            if(prom>=51)
                System.out.println(e.getNombre()+"\t nota: "+prom);
        }
    }
    public void mostrarReprobados(){
        int prom;
        System.out.println("\nESTUDIANTES REPROBADOS:");
        for(Estudiante e:registro){
            prom=(e.getNota1()+e.getNota2())/2;
            if(prom<51)
                System.out.println(e.getNombre()+"\t nota: "+prom);
        }
    }
    public void mostraHabilitadosSegInst(){
        int prom;
        System.out.println("\nESTUDIANTES HABILITADOS PARA 2DA INSTANCIA:");
        for(Estudiante e:registro){
            prom=(e.getNota1()+e.getNota2())/2;
            if(prom<51&&prom>=26)
                System.out.println(e.getNombre()+"\t nota: "+prom);
        }
    }
    public void mostrarListaCompleta(){
        String nom;
        int n1,n2;
        System.out.println("\nLISTA GENERAL DE ESTUDIANTES:");
        for(Estudiante e:registro){
            nom=e.getNombre();
            n1=e.getNota1();
            n2=e.getNota2();
            System.out.println(nom+"\t notas: "+n1+" y "+n2);
        }
    }
}
