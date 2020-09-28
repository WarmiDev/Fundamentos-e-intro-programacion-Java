public class Veterinaria{
    private int ganancias[];
    private Gato gatos[];
    private int index;
    public Veterinaria(int tam){
        ganancias=new int[12];
        gatos=new Gato[tam];
        index=0;
    }
    public boolean agregarGatos(Gato nuevo){
        boolean res=false;
        for(int i=0;i<gatos.length && !res;i++){
            if(gatos[i]==null){
                gatos[i]=nuevo;
                res=true;
            }
        }
        return res;
    }
    public boolean agregarElemento(int valor){
        boolean res=false;
        if(index<ganancias.length){
            ganancias[index]=valor;
            index++;
            res=true;
        }
        return res;
    }
    public boolean agregarGanancias(int valor){
        boolean res=false;
        for(int i=0;i<ganancias.length && !res;i++){
            if(ganancias[i]==0){
                ganancias[i]=valor;
                res=true;
            }
        }
        return res;
    }
    public boolean eliminarGanancia(int buscado){
        boolean res=false;
        for(int i=0;i<ganancias.length && !res;i++){
            int actual=ganancias[i];
            if(actual==buscado){
                res=true;
                ganancias[i]=0;
                //reordenar(i);
            }
        }
        return res;
    }
    public boolean eliminarGato(Gato buscado){
        boolean res=false;
        for(int i=0;i<gatos.length && !res;i++){
            Gato actual=gatos[i];
            if(actual.equals(buscado)){
                res=true;
                gatos[i]=null;
                //reordenar(i);
            }
        }
        return res;
    }
    private void reordenar(int ini){
        for(int i=ini;i<index;i++){
            ganancias[i]=ganancias[i+1];
        }
        index--;
    }
}
