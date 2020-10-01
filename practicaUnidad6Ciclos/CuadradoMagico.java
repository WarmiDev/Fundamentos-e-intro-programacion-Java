public class CuadradoMagico{
    public int[] generarCuadradoMagico(int num){
        int[] cuadrado=new int[tam(num)];
        cuadrado[cuadrado.length-1]=num;
        for(int i=cuadrado.length-2;i>=0;i--){
            num=recorrer(num);
            cuadrado[i]=num;
        }
        return cuadrado;
    }
    private int tam(int n){
        int cont=1;
        while(n/10>0){
            cont++;
            n/=10;
        }
        return cont;
    }
    private int recorrer(int n){
        int factor=1;
        for(int i=1;i<tam(n);i++)
            factor*=10;
        return n/10+n%10*factor;
    }
}
