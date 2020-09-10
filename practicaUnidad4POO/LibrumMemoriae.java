public class LibrumMemoriae{
    private String tareaActual;
    private boolean estadoTarea; //false: en curso; true: concluida
    private int contadorTareas;
    public LibrumMemoriae(String tareaInicial){
        tareaActual=tareaInicial;
        estadoTarea=false;
        contadorTareas=1;
    }
    public String agregarActividad(String nuevaTarea){
        String msg;
        if(estadoTarea){
            tareaActual=nuevaTarea;
            contadorTareas++;
            msg="Nueva tarea asignada";
        }
        else
            msg="La tarea en curso aun no ha sido concluida";
        return msg;
    }
    public void marcarTareaConcluidad(){
        estadoTarea=true;
    }
    public boolean getEstadoTarea(){
        return estadoTarea;
    }
    public int getContadorTareas(){
        return contadorTareas;
    }
    public String getTareaActual(){
        return tareaActual;
    }
}
