public class Factorial{
    public int calcularFactorial(int n){
        if(n==0) return 1;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
