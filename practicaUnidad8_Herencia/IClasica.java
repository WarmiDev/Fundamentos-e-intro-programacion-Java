public class IClasica extends Identificacion{
    private String direccion,trabajo;
    private int puntaje,contadorVisitas;
    public IClasica(String nombre,int edad,int codigo,String dir,String tra){
        super(nombre,edad,codigo);
        direccion=dir;
        trabajo=tra;
        puntaje=0;
        contadorVisitas=0;
    }
    public void nuevaVisita(){
        contadorVisitas++;
        if(contadorVisitas==5){
            puntaje+=10;
            contadorVisitas=0;
        }
    }
    public int consultarPuntaje(){
        return puntaje;
    }
}
