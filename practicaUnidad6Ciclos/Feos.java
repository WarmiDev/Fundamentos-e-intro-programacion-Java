public class Feos{
    public int hallarFeo(int posicion){
        int contFeos=1;
        int num=1;
        while(contFeos<posicion){
            num++;
            if(num%2==0||num%3==0||num%5==0) contFeos++;
        }
        return num;
    }
}
