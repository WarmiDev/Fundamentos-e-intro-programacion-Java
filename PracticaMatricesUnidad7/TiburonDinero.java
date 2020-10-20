import java.util.Scanner;
public class TiburonDinero{
    private int[][] tablero;
    static int cantTiburones=0;
    static int dinero=0;
    static boolean seguirJugando=true;
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
                System.out.print(tablero[i][j]==0?"dinero   ":"tiburon  ");
            }
            System.out.println();
        }
        System.out.println();    
    }
    public void jugar(int fila,int colum){
        if(tablero[fila][colum]==1){
            System.out.println("En la posicion ("+fila+","+colum+") hay un tiburon");
            cantTiburones++;
            dinero=0;
        }
        else{
            System.out.println("En la posicion ("+fila+","+colum+") hay dinero");
            dinero+=50;
        }
        if(cantTiburones==3)System.out.println("Perdiste por encontrar 3 tiburones");
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        TiburonDinero tibDin=new TiburonDinero(6,4);
        tibDin.mostrarTablero();
        while(cantTiburones<3){
            System.out.println("Ingrese la fila");
            int fila= scanner.nextInt();
            System.out.println("Ingrese la columna");
            int col= scanner.nextInt();
            tibDin.jugar(fila,col);
            if(cantTiburones<3){
                System.out.println("Quieres continuar jugando?");
                scanner.nextLine();
                String respuesta= scanner.nextLine();
                if(respuesta.equals("no")){
                    System.out.println("Acumulaste "+dinero+" monedas de oro");
                    break;
                }
            }
        }
    }
}
