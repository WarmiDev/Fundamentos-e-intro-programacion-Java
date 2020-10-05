public class OrdenParImpar{
    private int[] arreglo;
    public OrdenParImpar(int[] arreglo){
        this.arreglo=arreglo;
    }
    public int[] ordenar(){
        int[] impares=new int[arreglo.length],pares=new int[arreglo.length];
        int contPar=0,contImp=0;
            for(int i=0;i<arreglo.length;i++){
                if(arreglo[i]%2==0){
                    pares[contPar]=arreglo[i];
                    contPar++;
                } else{
                    impares[contImp]=arreglo[i];
                    contImp++;
                }
            }
            for(int i=0;i<contImp;i++){
                int aux;
                for(int j=contImp;j>0;j--){
                    if(impares[i]<impares[j]){    //sin terminar
                        
                    }
                }
            }
            return arreglo;
    }
}
