public class NumeroEnCrecimiento{
    int n;
    String res="Numero invalido para esta situacion";
    public NumeroEnCrecimiento(int num){
       n=num;
    }
    public String definirSiCrecimiento(){
        if(n>99&&n<1000){
            if(n/100<=(n-100*(n/100))/10&&(n-100*(n/100))/10<=n%10)
                res=n+" es un numero en crecimiento";
            else
                res=n+" no es un numero en crecimiento";
        }
        return res;
    }
}
