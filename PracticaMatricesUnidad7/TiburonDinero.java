public class TiburonDinero{
    private int[][] tablero;
    public TiburonDinero(int cantFilas,int cantColumnas){
        tablero=new int[cantFilas][cantColumnas];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                tablero[i][j]=(int)(Math.random()*2); //0 representara dinero y 1 tiburon
            }
        }    
    }
    public void mostrarTablero(){
        System.out.println();
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();    
    }
    public void jugar(){
        int cantTiburones=0;
        int dinero=0;
        boolean seguirJugando=true;
        while(cantTiburones<3&&seguirJugando){
            int fila=(int)(Math.random()*tablero.length);//creamos una posicion aleatoria
            int colum=(int)(Math.random()*tablero[0].length);
            if(tablero[fila][colum]==1){
                System.out.println("En la posicion ("+fila+","+colum+") hay un tiburon");
                cantTiburones++;
                dinero=0;
            }
            else{
                System.out.println("En la posicion ("+fila+","+colum+") hay dinero");
                dinero+=50;
            }
            if(Math.random()>0.8){
                seguirJugando=false;
                System.out.println("Decidiste salir del juego, acumulaste "+dinero+" monedas de oro");
            }
        }
        if(cantTiburones==3)System.out.println("Perdiste por encontrar 3 tiburones");
    }
}
