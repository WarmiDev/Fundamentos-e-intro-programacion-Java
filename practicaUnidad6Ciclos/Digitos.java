public class Digitos{
    public int contarDigitos(int num){
        int contDig=1;
        while(num/10>0){
            contDig++;
            num/=10;
        }
        return contDig;
    }
}
