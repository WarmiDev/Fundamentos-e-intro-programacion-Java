import java.util.ArrayList;
public class SistemaDeCaja{
    private int turno;
    private ArrayList<Ficha> fichasEnEspera;
    private ArrayList<Ficha> fichasAtendidas;
    public SistemaDeCaja(){
        turno=1;
        fichasEnEspera=new ArrayList();
        fichasAtendidas=new ArrayList();
    }
    public String generarFicha(){
        Ficha f=new Ficha(turno);
        turno++;
        fichasEnEspera.add(f);
        return f.getNombre();
    }
    public void atenderFicha(int tiempoDeAtencion){
        Ficha f=fichasEnEspera.get(0);
        fichasEnEspera.remove(0);
        System.out.println("Ficha "+f.getNombre()+" en caja... Espere, por favor");
        try{
            Thread.sleep(tiempoDeAtencion*1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Fin de la atencion a la ficha "+f.getNombre());
        fichasAtendidas.add(f);    
    }
    public void mostrarFichasAtendidas(){
        System.out.println("FICHAS ATENDIDAS:");
        for(Ficha f:fichasAtendidas){
            String nom=f.getNombre();
            System.out.println(nom);
        }
    }
    public void mostrarFichasEnEspera(){
        System.out.println("FICHAS EN ESPERA:");
        for(Ficha f:fichasEnEspera){
            String nom=f.getNombre();
            System.out.println(nom);
        }
    }
}
