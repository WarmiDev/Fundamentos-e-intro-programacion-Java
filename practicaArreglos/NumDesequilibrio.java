public class NumDesequilibrio{
    int[] pesosEmoc;
    public NumDesequilibrio(int[] arreglo){
        pesosEmoc=arreglo;
    }
    public String hallarNumeroDelDesequilibrio(){
        while(pesosEmoc.length>1){
            int[] arrIzq= new int[pesosEmoc.length/2];
            int[] arrDer=new int[pesosEmoc.length-pesosEmoc.length/2];
            for(int i=0;i<arrIzq.length;i++) 
                arrIzq[i]=pesosEmoc[i];
            for(int i=arrIzq.length;i<pesosEmoc.length;i++) 
                arrDer[i-arrIzq.length]=pesosEmoc[i];
            if(sumaElementos(arrIzq)==sumaElementos(arrDer))
                return "No existe numero de desequilibrio";
            pesosEmoc=sumaElementos(arrIzq)>sumaElementos(arrDer)?arrIzq:arrDer;
        }
        return "El numero del desequilibrio es "+pesosEmoc[0];
    }
    private int sumaElementos(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) 
            sum+=arr[i];
        return sum;
    }
}
