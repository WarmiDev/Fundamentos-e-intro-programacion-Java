public class RAnalogico extends Reloj{
    private String indicadorTurno;
    public RAnalogico(int horaActual,int minutoActual,String pmOam){
        super(horaActual,minutoActual);
        indicadorTurno=pmOam;
    }
    public void mostrarHora(){
        System.out.println(
            corregir(hora)+":"+corregir(minuto)+":"+corregir(segundo)+
            " "+indicadorTurno);
    }
    protected void revisarFormato(){
        if(segundo==60){
            segundo=0;
            minuto++;
        }
        if(minuto==60){
            minuto=0;
            hora++;
        }
        if (hora==13)
            hora=1;
        if(hora==12&&minuto==0&&segundo==0&&indicadorTurno=="am")
            indicadorTurno="pm";
        else if(hora==12&&minuto==0&&segundo==0&&indicadorTurno=="pm")
            indicadorTurno="am";
    }
}