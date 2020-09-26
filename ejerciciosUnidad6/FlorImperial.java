public class FlorImperial{
    private int altura;
    public FlorImperial(int alturaInicial){
        altura=alturaInicial;
    }
    public int cantAnios(){
        int anios=0;
        while(altura<9999999){
            altura*=2;
            anios++;
        }
        return anios;
    }
}
