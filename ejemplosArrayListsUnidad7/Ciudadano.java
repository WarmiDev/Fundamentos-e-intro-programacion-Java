import java.util.ArrayList;
public class Ciudadano{
    private ArrayList<Integer> informe;
    private int sueldo;
    public Ciudadano(int sueldo){
        informe=new ArrayList();
        this.sueldo=sueldo;
    }
    public boolean hacerInforme(int monto){
        boolean res=false;
        if(sueldo>=monto){
            informe.add(monto);
            res=true;
            sueldo-=monto;
        }
        return res;
    }
    public void visualizarInforme(){
        for(int i=0;i<informe.size();i++){
            System.out.print("Dia"+(i+1)+": ");
            System.out.println(informe.get(i)+" Bs");
        }
    }
}
