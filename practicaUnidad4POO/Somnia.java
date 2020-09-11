public class Somnia{
    private int alcance, durabilidad;
    private int cantObjMovObservados;
    public Somnia(int alcance, int durabilidad){
        this.alcance=alcance;
        this.durabilidad=durabilidad;
        cantObjMovObservados=0;
    }
    public String observar(){
        String msg;
        boolean objMovHallado;
        double aux;
        aux=Math.random();
        if(aux<0.65){
            msg="Objeto en movimiento detectado";
            cantObjMovObservados++;
        }
        else
            msg="El intento ha fallado";
        return msg;
    }
    public Somnia combinarConOtroSomnia(Somnia somnia){
        Somnia somnia3;
        int alcance3=this.alcance+somnia.alcance;
        int durabilidad3=Math.min(this.durabilidad, somnia.durabilidad);
        somnia3=new Somnia(alcance3, durabilidad3);
        return somnia3;
    }
}
