public class ReglasHogar
{
    public int calcularDias(){
        int contDia=0;
        int diaSem=3; //lunes: 1, martes: 2, etc
        do{
            contDia++;
            diaSem++;
            diaSem%=7;
        } while((diaSem!=3)||(contDia%2!=0));
        return contDia;
    }
}
