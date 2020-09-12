import java.util.ArrayList;
public class ComplejoTuristico {
    private ArrayList<Persona> listaClientes;
    private ArrayList<Persona> listaEspera;
    private int limiteMax;
    public ComplejoTuristico(){
        listaClientes= new ArrayList();
        listaEspera= new ArrayList();
        limiteMax=3;
    }
    public boolean ingresarComplejo(Persona p){
        boolean res=false;
        if(listaClientes.size()<3){
            listaClientes.add(p);
            res=true;
        }else{
            listaEspera.add(p);
        }
        return res;
    }
    public void salirComplejo(Persona p){
        listaClientes.remove(p);
        if(!listaEspera.isEmpty()){
            listaClientes.add(listaEspera.get(0));
        }
    }
}
