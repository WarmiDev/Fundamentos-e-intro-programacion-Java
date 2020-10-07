public class Memorias{
    private Recuerdo[] mente;
    private int index=0;
    public Memorias(int tamMente){
        this.mente=new Recuerdo[tamMente];
    }
    public String agregarRecuerdo(Recuerdo recuerdo){
        if(index<mente.length){
            mente[index]=recuerdo;
            index++;
            return "Recuerdo agregado exitosamente";
        }
        else    
            return "No existe espacio en la mente para mas recuerdos";
    }
    public String ordenarPorDia(){
        if(mente[mente.length-1]==null)
            return "El metodo no se puede invocar porque aun hay espacios vacios en el arreglo";
        else{
            for(int i=0;i<mente.length-1;i++){
                Recuerdo aux;
                for(int j=i+1;j<mente.length;j++){
                    if(mente[i].getFecha().getDia()>mente[j].getFecha().getDia()){ 
                        aux=mente[j];
                        mente[j]=mente[i];
                        mente[i]=aux;
                    }
                }
            }
            return "Se ordeno el arreglo por dias exitosamente";
        }
    }
    public String ordenarPorMes(){
        if(mente[mente.length-1]==null)
            return "El metodo no se puede invocar porque aun hay espacios vacios en el arreglo";
        else{
            for(int i=0;i<mente.length-1;i++){
                Recuerdo aux;
                for(int j=i+1;j<mente.length;j++){
                    if(mente[i].getFecha().getMes()>mente[j].getFecha().getMes()){ 
                        aux=mente[j];
                        mente[j]=mente[i];
                        mente[i]=aux;
                    }
                }
            }
            return "Se ordeno el arreglo por meses exitosamente";
        }
    }
    public String ordenarPorAnio(){
        if(mente[mente.length-1]==null)
            return "El metodo no se puede invocar porque aun hay espacios vacios en el arreglo";
        else{
            for(int i=0;i<mente.length-1;i++){
                Recuerdo aux;
                for(int j=i+1;j<mente.length;j++){
                    if(mente[i].getFecha().getAnio()>mente[j].getFecha().getAnio()){ 
                        aux=mente[j];
                        mente[j]=mente[i];
                        mente[i]=aux;
                    }
                }
            }
            return "Se ordeno el arreglo por anios exitosamente";
        }
    }
    public String hallarRecuerdoDeLuz(){
        return mente[mente.length-1]==null?"El metodo no se puede invocar porque aun hay espacios vacios en el arreglo":mente[mente.length/2].getDescripcion();
    }
}
