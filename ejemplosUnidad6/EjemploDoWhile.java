public class EjemploDoWhile{
    public int calcularEnergiaGasto(int perimetro,int cantVueltas){
        int res=0,factor=1,cont=0;
        do{
            res+=perimetro*factor;
            factor++;
            cont++;
        }while(cont<cantVueltas);
        return res;
    }
}
