public class Digitos{
    public int contarDigitos(int num){
        int contDig=0;
        while(num>0){
            contDig++;
            num/=10;
        }
        return contDig;
    }
}
