abstract public class Reloj{
    protected int hora,minuto,segundo;
    protected boolean interruptor;
    public Reloj(int horaActual,int minutoActual){
        hora=horaActual;
        minuto=minutoActual;
        segundo=0;
        interruptor=true;
    }
    abstract public void mostrarHora();
    public void caminar(){
        while(interruptor){
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){}
            mostrarHora();
            segundo++;
            revisarFormato();
        }
    }
    abstract protected void revisarFormato();
    protected String corregir(int n){
        if(n<10)
            return "0"+n;
        else
            return ""+n;
    }
}
