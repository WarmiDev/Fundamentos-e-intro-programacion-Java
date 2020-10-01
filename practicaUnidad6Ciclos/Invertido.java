public class Invertido{
    public int invertirNumero(int num){
        int inv=0;
        while(num>0){
            inv=inv*10+num%10;
            num/=10;
        }
        return inv;
    }
}