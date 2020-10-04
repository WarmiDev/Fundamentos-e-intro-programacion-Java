
public class Feos{
    public int hallarFeo(int posicion){
        int contFeos=1;
        int num=1;
        while(contFeos<posicion){
            num++;
            if(feo(num)) contFeos++;
        }
        return num;
    }
    private boolean feo(int n){
        for(int i=2;i<=n;i++)
            if(n%i==0 && !(i%2==0||i%3==0||i%5==0)) return false;
        return true;
    }
}
