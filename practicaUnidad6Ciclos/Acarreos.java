public class Acarreos{
    public int calcularAcarreos(int n1,int n2){
        int contAcarreos=0;
        int acarreo=0;
        while(n1>9 || n2>9){
            acarreo=(n1%10+n2%10+acarreo)/10;
            if(acarreo>0) contAcarreos++;
            n1/=10;
            n2/=10;
        }
        return contAcarreos;
    }
}
