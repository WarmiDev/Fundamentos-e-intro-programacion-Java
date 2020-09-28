public class Cielo{
    public int[] estadoEstrellas;
    public Cielo(int cantEstrellas){
        estadoEstrellas=new int[cantEstrellas];
        for(int i=0;i<cantEstrellas;i++){
            estadoEstrellas[i]=(int)(Math.random()*2);
        }
    }
    public Cielo(int[] cantEstrellas){
        estadoEstrellas=cantEstrellas;
    }
    public int[] getEstadoEstrellas(){
        return estadoEstrellas;
    }
}
