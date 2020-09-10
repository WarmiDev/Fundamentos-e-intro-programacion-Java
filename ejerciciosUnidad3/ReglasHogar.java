public class ReglasHogar
{
    public int calcularDias(){
        int contDia=0;
        int diaSem=2; //lunes: 0, martes: 1, miercoles: 2, etc
        do{
            contDia++;
            diaSem++;
            diaSem%=7;
        } while((diaSem!=2)||(contDia%2!=0));
        return contDia;
    }
}
