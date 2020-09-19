public class Semaforo{
    private int cantCambios,estado;//estado 0:rojo, 1:verde, 2:amarillo
    public Semaforo(String estadoInicial, int cantCambios){
        if(estadoInicial=="rojo")estado=0;
        if(estadoInicial=="verde")estado=1;
        if(estadoInicial=="amarillo")estado=2;
        this.cantCambios=cantCambios;
    }
    public String mostrarEstadoFinal(){ 
        String res="Los datos ingresados son invalidos";
        estado=(estado+cantCambios)%2;
        if(estado==0)res="Estado final: rojo";
        if(estado==1)res="Estado final: verde";
        if(estado==2)res="Estado final: amarillo";
        return res;
    }
}
