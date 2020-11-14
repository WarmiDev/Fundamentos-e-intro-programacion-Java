public class RDigital extends Reloj{
    public RDigital(int horaActual,int minutoActual){
        super(horaActual,minutoActual);
    }
    public void mostrarHora(){
        System.out.println(
            corregir(hora)+":"+corregir(minuto)+":"+corregir(segundo));
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
        if (hora==24)
            hora=0;
    }
}
