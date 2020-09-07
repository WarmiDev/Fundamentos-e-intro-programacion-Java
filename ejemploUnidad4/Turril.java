public class Turril{
    private int capacidad;//litros
    private int cantAgua;//litros
    public Turril(){
        capacidad=210;
        cantAgua=0;
    }
    public void cargarAgua(){
        cantAgua=capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantAgua(){
        return cantAgua;
    }
    public void setCapacidad(int cap){
        capacidad=cap;
    }
    public void setCantAgua(int cant){
        cantAgua=cant;
    }
}
