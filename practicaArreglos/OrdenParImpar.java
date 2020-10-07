public class OrdenParImpar{
    private int[] arreglo;
    public OrdenParImpar(int[] arreglo){
        this.arreglo=arreglo;
    }
    public int[] ordenar(){
        int[] impares=new int[arreglo.length],pares=new int[arreglo.length];//la longitud maxima que puedan tener
        int contPar=0,contImp=0;
        for(int i=0;i<arreglo.length;i++){//separa el arreglo en dos arreglos: pares e impares
            if(arreglo[i]%2==0){
                pares[contPar]=arreglo[i];
                contPar++;
            }   
            else{
                impares[contImp]=arreglo[i];
                contImp++;
            }
        }
        for(int i=0;i<contImp-1;i++){//ordena las casillas llenas del arreglo impares de menor a mayor
            int aux;
            for(int j=i+1;j<contImp;j++){
                if(impares[i]>impares[j]){ 
                    aux=impares[j];
                    impares[j]=impares[i];
                    impares[i]=aux;
                }
            }
        }
        for(int i=0;i<contPar-1;i++){//ordena las casillas llenas del arreglo pares de mayor a menor
            int aux;
            for(int j=i+1;j<contPar;j++){
                if(pares[i]<pares[j]){ 
                    aux=pares[j];
                    pares[j]=pares[i];
                    pares[i]=aux;
                }
            }
        }
        for(int i=0;i<contImp;i++)//llena las primeras casillas del arreglo con los impares ordenados
                arreglo[i]=impares[i];
        for(int i=contImp;i<arreglo.length;i++)//llena las ultimas casillas del arreglo con los pares ordenados
                arreglo[i]=pares[i-contImp];
            return arreglo;
    }
 }
 
