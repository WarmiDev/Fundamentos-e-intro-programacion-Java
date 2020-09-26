public class EjemploFor{
    public int calcularGastoEnergia(int perimetro,int cantVueltas){
        int res=0;
        int factor=1;
        for(int i=0;i<cantVueltas;i++){
            res+=perimetro*factor;
            factor++;
        }
        return res;
    }
    public int calcularGastoEnergiaWhile(int perimetro,int cantVueltas){
        int res=0;
        int factor=1;
        int i=0;
        while(i<cantVueltas){
            res+=perimetro*factor;
            factor++;
            i++;
        }
        return res;
    }
}
