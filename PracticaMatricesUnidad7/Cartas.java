    public class Cartas{
        private Carta[][] tablero;
        public Cartas(int tamTablero){
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
                    System.out.print(tablero[i][j].getValor()+" de "+
                    tablero[i][j].getSimbolo()+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        public String jugar(Intento int1,Intento int2,Intento int3,Intento int4,
        Intento int5,Intento int6){
            Intento[] intentos=new Intento[6];
            intentos[0]=int1;
            intentos[1]=int2;
            intentos[2]=int3;
            intentos[3]=int4;
            intentos[4]=int5;
            intentos[5]=int6;
            int puntaje=0;
            for(int i=0;i<6;i++){
                if(tablero[intentos[i].getFila()][intentos[i].getColumna()].getValor()==intentos[i].getValor()&&
                    tablero[intentos[i].getFila()][intentos[i].getColumna()].getSimbolo()==intentos[i].getSimbolo())
                    puntaje++;
                    else puntaje--;
            }    
            return "puntaje final: "+puntaje;
        }
    }
