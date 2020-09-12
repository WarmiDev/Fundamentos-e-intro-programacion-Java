public class ModuloRobotico{
    private int capacidadUnidadesSavia, capacidadReflejos;
    private int cantidadUnidadesSavia, cantidadReflejos;
    private boolean botonEncendido;
    public ModuloRobotico(){
        capacidadUnidadesSavia=90;
        capacidadReflejos=20;
        cantidadUnidadesSavia=0;
        cantidadReflejos=0;
        botonEncendido=false;
    }
    public String crearReflejo(){
        String msg;
        if(botonEncendido){
            if(cantidadUnidadesSavia>50&&cantidadReflejos<capacidadReflejos){
                cantidadReflejos++;
                cantidadUnidadesSavia-=50;
                msg="La accion ha sido completada con exito.";
            }
            else 
                msg="No puede realizar esta accion. Espacio insuficiente.";
        }
        else
            msg="La maquina esta apagada";
        return msg;
    }
    public String agregarSavia(){
        String msg;
        if(botonEncendido){
            if(cantidadUnidadesSavia<capacidadUnidadesSavia){
                cantidadUnidadesSavia++;
                msg="La accion ha sido completada con exito.";
            }
            else 
                msg="No puede realizar esta accion. Espacio insuficiente.";
        }
        else 
                msg="La maquina esta apagada";
        return msg;
    }
    public String retirarTodoLoAlmacenado(){
        cantidadUnidadesSavia=0;
        cantidadReflejos=0;
        return "La accion ha sido completada con exito.";
    }
    public void encenderMaquina(){
        botonEncendido=true;
    }
    public void apagarMaquina(){
        botonEncendido=false;
    }
    public int getUnidadesSavia(){
        return cantidadUnidadesSavia;
    }
    public int getCantidadReflejos(){
        return cantidadReflejos;
    }
}
