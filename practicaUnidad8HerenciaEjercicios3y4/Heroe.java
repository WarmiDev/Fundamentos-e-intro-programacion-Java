public class Heroe extends Elemento{
    public Heroe(){
        super(2,0,'H');
    }
    public void moverse(int mov){
        if(mov>0&&this.posX>0&&this.posX<=4)
            this.posX-=mov;
        else {
            if(mov<0&&this.posX>=0&&this.posX<4)
                this.posX-=mov;
            else
                System.out.println("Accion invalida");
        }
    }
}
