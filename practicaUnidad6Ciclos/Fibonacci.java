public class Fibonacci{
    public int calcular(int termino){
        int num=0,anterior=1;
        int aux;
        for(int i=0;i<termino;i++){
            aux=num;
            num+=anterior;
            anterior=aux;
        }
        return num;
    }
}
