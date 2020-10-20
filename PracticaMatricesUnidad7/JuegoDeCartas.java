import java.util.Scanner;
public class JuegoDeCartas{
    private Carta[][] tablero;
    int cantIntentos;
    int ptsFavor, ptsContra;
    public JuegoDeCartas(int tamTablero){
        cantIntentos=6;
        tablero=new Carta[tamTablero][tamTablero];
        for(int i=0;i<tamTablero;i++){
            for(int j=0;j<tamTablero;j++){
                int valor,aux;
                String simbolo="";
                valor=(int)(Math.random()*11);
                aux=(int)(Math.random()*4);
                switch(aux){
                    case 0:  simbolo="diamante"; break;
                    case 1:  simbolo="corazon"; break;
                    case 2:  simbolo="espada"; break;
                    case 3:  simbolo="trebol"; break;
                }
                tablero[i][j]=new Carta(valor,simbolo);
            }
        }
    }
    public void mostrarTablero(){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                int val=tablero[i][j].getValor();
                String simb=tablero[i][j].getSimbolo();
                if(val<10)
                    System.out.print(" ");
                System.out.print(val+" de "+simb+"  ");
                switch(simb){
                    case "corazon":System.out.print(" "); break;
                    case "espada":
                    case "trebol":System.out.print("  "); break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public String jugar(Intento intento){
        cantIntentos--;
        int valor=tablero[intento.getFila()][intento.getColumna()].getValor();
        String simbolo= tablero[intento.getFila()][intento.getColumna()].getSimbolo();
        if(valor==intento.getValor()&&simbolo.equals(intento.getSimbolo())){
            ptsFavor++;
            return "acertaste";
        }else{
            ptsContra++;
            return "siga participando";
        }
    
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        JuegoDeCartas juegoCartas =  new JuegoDeCartas(8);
        juegoCartas.mostrarTablero();
        while(juegoCartas.cantIntentos>0){
            //jugar
            System.out.println("ingrese la fila");
            int fila= sc.nextInt();
            System.out.println("ingrese la columna");
            int col= sc.nextInt();
            System.out.println("ingrese el valor");
            int valor= sc.nextInt();
            System.out.println("ingrese el simbolo");
            sc.nextLine();
            String simbolo= sc.nextLine();
            Intento intento= new Intento(fila,col,valor,simbolo);
            System.out.println(juegoCartas.jugar(intento));
        }
        System.out.println("puntos a favor "+juegoCartas.ptsFavor);
        System.out.println("puntos en contra "+juegoCartas.ptsContra);
    }
}
