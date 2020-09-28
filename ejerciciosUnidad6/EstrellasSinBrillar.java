public class EstrellasSinBrillar{
    private Cielo cielo;
    private int inicio,fin;
    private String res;
    public EstrellasSinBrillar(Cielo cielo,int inicio, int fin){//se podia recibir directamente arreglo
        this.cielo=cielo;
        this.inicio=inicio;
        this.fin=fin;
    }
    public String cantEstrellasDejadoBrillar(){
        int cont=0;
        for(int i=inicio;i<=fin;i++)
            if(cielo.estadoEstrellas[i]==0)cont++;
        res="Hay "+cont+" estrellas que han dejado de brillar.";
        return res;
    }
}
