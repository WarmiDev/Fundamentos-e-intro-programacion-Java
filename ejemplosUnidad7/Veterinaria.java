public class Veterinaria{
    private int ganancias[];
    private Gato gatos[];
    private int index;
    public Veterinaria(int tam){
        ganancias=new int[12];
        gatos=new Gato[tam];
        index=0;
    }
    public String busquedaBinaria(double buscado){
        ordenarGatosPorPeso();
        String res="No se encontre el gato";
        int li=0,ls=gatos.length-1,medio=(li+ls)/2;
        boolean bandera=false;
        while(bandera==false&&li<=ls){
            Gato actual=gatos[medio];
            double pesoActual=actual.getPeso();
            if(pesoActual==buscado){
                bandera=true;
                res=actual.getNombre();
            }else{
                if(pesoActual>buscado) ls=medio-1;
                else li=medio+1;
                medio=(li+ls)/2;
            }
        }
        return res;
    }
    public void ordenarGatosPorPeso(){
        for(int i=1;i<=gatos.length;i++){
            for(int j=0;j<=gatos.length-1-i;j++){
                Gato actual=gatos[j];
                double pesoActual=actual.getPeso();
                Gato vecino=gatos[j+1];
                double pesoVecino=vecino.getPeso();
                if(pesoActual>pesoVecino){
                    Gato aux=gatos[j];
                    gatos[j]=gatos[j+1];
                    gatos[j+1]=aux;
                }
            }
        }
    }
    public void burbuja(){
        for(int i=1;i<=ganancias.length;i++){
            for(int j=0;j<=ganancias.length-1-i;j++){
                if(ganancias[j]>ganancias[j+1]){
                    int aux=ganancias[j];
                    ganancias[j]=ganancias[j+1];
                    ganancias[j+1]=aux;
                }
            }
        }
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
