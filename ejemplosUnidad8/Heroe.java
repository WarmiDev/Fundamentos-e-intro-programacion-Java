public class Heroe extends Jugador{
    private boolean itemVelocidad;
    public Heroe(String nom,int ptsS,int ptsD,int vel,int x,int y){
        super(nom,ptsS,ptsD,vel,x,y);
        itemVelocidad=false;
    }
    public void habilitarItem(){
        itemVelocidad=true;
    }
    public void deshabilitarItem(){
        itemVelocidad=false;
    }
    @Override
    public void caminar(){
        if(itemVelocidad)
            posY+=velMovimiento*2;
        else
            posY+=velMovimiento;
    }
}