public class SombraCipres{
    private int[] sombras;
    private int cantHoras;
    public SombraCipres(int sombraInicial, int cantHorasAPredecir){
        cantHoras=cantHorasAPredecir;
        sombras=new int[cantHorasAPredecir+1];
        sombras[0]=sombraInicial;
    }
    public int[] predecir(){
        int cont=1;
        for(int i=1;i<sombras.length;i++){
            if(sombras[i-1]%2==0)sombras[i]=sombras[i-1]/2;
            else{
                sombras[i]=sombras[i-1]+cont;
                cont++;
            }
        }
        return sombras;
    }
}
