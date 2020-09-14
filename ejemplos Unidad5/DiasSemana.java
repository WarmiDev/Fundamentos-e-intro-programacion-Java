public class DiasSemana{
    public String diaSemana(int n){
        String res="ese dia no existe";
        if(n==1){
            res="lunes";
        } else if(n==2){
            res="martes";
        } else if(n==3){
            res="miercoles";
        } else if(n==4){
            res="jueves";
        } else if(n==5){
            res="viernes";
        } else if(n==6){
            res="sabado";
        } else if(n==7){
            res="domingo";
        }
        return res;
    }
}
