public class EnCrecimiento{
    public boolean verificarCrecimiento(int n){
        while(n>9){
            if(n%10<(n%100)/10) return false;
            n/=10;
        }
        return true;
    }
}