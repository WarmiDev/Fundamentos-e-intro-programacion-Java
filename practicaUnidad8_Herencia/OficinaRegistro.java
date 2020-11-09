import java.util.ArrayList;
public class OficinaRegistro{
    private ArrayList<Identificacion> identificaciones;
    public OficinaRegistro(){
       identificaciones=new ArrayList();
    }
    public int cantIdentificaciones(){
        return identificaciones.size();
    }
    public String cantIdentificPorTipo(){
        int contMagna=0,contTurista=0,contClasica=0;
        for(Identificacion i:identificaciones){
            if(i instanceof IMagna)
                contMagna++;
            else if(i instanceof ITurista)
                contTurista++;
            else if(i instanceof IClasica)
                contClasica++;
        }
        return "Existen "+contMagna+" identificaciones magnas."+
            "\nExisten "+contTurista+" identificaciones turistas."+
            "\nExisten "+contClasica+" identificaciones clasicas.";
    }
}
