public class Perfectos{
    public boolean verifPerfecto(int num){
        int suma=0;
        for(int i=1;i<num;i++){
            if(num%i==0) suma+=i;
        }
        if(suma==num) return true;
        else return false;
    }
}