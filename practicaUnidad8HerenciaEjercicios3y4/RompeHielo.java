
import java.util.Scanner;
public class RompeHielo{
    private Elemento[][] cueva;
    private int cantFlechas;
    private Heroe heroe;
    private Flecha flecha;
    private Princesa princesa;
    private Boolean estado;
    public RompeHielo(int cantFlechas){
        this.cantFlechas=cantFlechas;
        cueva=new Elemento[5][4];
        heroe=new Heroe();
        cueva[heroe.posX][heroe.posY]=heroe;
        princesa=new Princesa();
        cueva[princesa.posX][princesa.posY]=princesa;
        flecha=new Flecha(-1);
        acomodarHielos();
        estado=true;
        mostrarCueva();
    }
    public void jugar(){
        Scanner lector=new Scanner(System.in);
        String tecla;
        while(estado){
            tecla=lector.nextLine();
            switch(tecla){
                case("w"):arriba();break;
                case("s"):abajo();break;
                case("d"):disparar();break;
                default:System.out.println("Accion invalida");
            }
            mostrarCueva();
            evaluarEstado();
        }
    }
    private void arriba(){
        int xAnt=heroe.posX;
        heroe.moverse(1);
        cueva[xAnt][0]=null;
        cueva[heroe.posX][0]=heroe;
    }
    private void abajo(){
        int xAnt=heroe.posX;
        heroe.moverse(-1);
        cueva[xAnt][0]=null;
        cueva[heroe.posX][0]=heroe;
    }
    private void disparar(){
        int xHieloCercano=heroe.posX;
        int yHieloCarcano=hallarYHieloProximo();
        if(yHieloCarcano==-1)
            System.out.println("No hay hielo que disparar desde tu posicion");
        else{
            cueva[xHieloCercano][yHieloCarcano].disparos++;
            cantFlechas--;
            if(cueva[xHieloCercano][yHieloCarcano].disparos==2)
                cueva[xHieloCercano][yHieloCarcano]=null;
        }
    }
    private int hallarYHieloProximo(){
        if(cueva[heroe.posX][2]!=null)
            return 2;
        else{
            if(cueva[heroe.posX][3]!=null)
                return 3;
            else
                return -1;
            }
    }
    private void evaluarEstado(){
        int contHielosDestruidos=0;
        if(cueva[1][3]==null)
            contHielosDestruidos++;
        if(cueva[3][3]==null)
            contHielosDestruidos++;
        for(int i=1;i<4;i++)
            if(cueva[i][2]==null)
                contHielosDestruidos++;
        if(cantFlechas==0){
            estado=false;
            System.out.println("Acabas de usar tu ultima flecha");
        }
        if(contHielosDestruidos==5){
            estado=false;
            System.out.println("Liberaste a la princesa. GANASTE!!!");
        }
    }
    private void acomodarHielos(){
        Hielo hielo;
        for(int i=0;i<cueva.length;i++){
            for(int j=2;j<cueva[i].length;j++){
                if(cueva[i][j]==null){
                    hielo=new Hielo(i,j);
                    cueva[i][j]=hielo;
                }
            }
        }
    }
    private void mostrarCueva(){
        for(int i=0;i<cueva.length;i++){
            for(int j=0;j<cueva[i].length;j++){
                if(cueva[i][j]==null)
                    System.out.print("         ");
                else
                    System.out.print("   "+cueva[i][j].simbolo+"     ");
            }
            System.out.println();
        }
    }
}
