public class Semaforo{
    private String estadoInicial;
    private int cantCambios;
    public Semaforo(String estadoInicial, int cantCambios){
        this.estadoInicial=estadoInicial;
        this.cantCambios=cantCambios;
    }
    public String mostrarEstadoFinal(){
        String res="Los datos ingresados son invalidos";
        switch(estadoInicial){
            case "rojo": {
                switch(cantCambios%3){
                    case 0:res="Estado final: rojo";break;
                    case 1:res="Estado final: verde";break;
                    case 2:res="Estado final: amarilo";break;
                } break;
                    
            }
            case "amarillo": {
                switch(cantCambios%3){
                    case 0:res="Estado final: amarillo";break;
                    case 1:res="Estado final: rojo";break;
                    case 2:res="Estado final: verde";break;
                } break;
                    
            }
            case "verde": {
                switch(cantCambios%3){
                    case 0:res="Estado final: verde";break;
                    case 1:res="Estado final: amarillo";break;
                    case 2:res="Estado final: rojo";break;
                } break;
                    
            }
        }
        return res;
    }
    public void setEstadoInicial(String estadoInicial){
        this.estadoInicial=estadoInicial;
    }
    public void setCantCambios(int cantCambios){
        this.cantCambios=cantCambios;
    }
    public String getEstadoInicial(){
        return estadoInicial;
    }
    public int seEstadoInicial(){
        return cantCambios;
    }
}
