import java.util.ArrayList;
public class JuegoSenderoTenebros{
    private Casilla[][] tablero;
    private Jugador j1,j2;
    private int marcadorTurno;
    private boolean juegoActivo;
    public JuegoSenderoTenebros(){
        tablero=new Casilla[3][60];
        int contadorAbisales=0;
        //cargamos el tablero aleatoriamente
        for(int i=1;i<tablero[0].length-1;i++){
            int limite;
            if(contadorAbisales<3)
                limite=6;
            else
                limite=5;
            int num=(int)(Math.random()*limite+1);
            switch(num){
                case 1:tablero[0][i]=new Negro();break;
                case 2:tablero[0][i]=new Blanco();break;
                case 3:{
                    int n=(int)(Math.random()*2+1);
                    if(n==1) 
                        tablero[0][i]=new TMiedo();
                    else
                        tablero[0][i]=new TCodicia();
                    break;
                }
                case 4:tablero[0][i]=new Miedoso();break;
                case 5:tablero[0][i]=new Suertudo();break;
                case 6:{
                    tablero[0][i]=new Abisal();
                    contadorAbisales++;
                    break;
                }
            }
        }
        tablero[0][tablero[0].length-1]=new Ganador();//La ultima siempre casilla ganador
    }
    public void agregarJugadores(Jugador j1,Jugador j2){
        this.j1=j1;
        this.j2=j2;
        tablero[1][j1.getPosicion()]=j1;
        tablero[2][j2.getPosicion()]=j2;
    }
    public void jugar(){
        juegoActivo=true;
        marcadorTurno=1;
        while(juegoActivo){
            if(marcadorTurno==1)
                turno(j1);
            else
                turno(j2);
            marcadorTurno*=-1;
        }
    }
    private void turno(Jugador j){
        System.out.println("Turno de: "+j.getFicha());
        int dado=lanzarDado();
        System.out.println("Se lanzo el dado y salio: "+dado);
        int posicionAnterior=j.getPosicion(),aux;
        j.setPosicion(j.getPosicion()+dado);
        //si se pasa del tablero, retrocede
        if(j.getPosicion()>=tablero[0].length){
            j.setPosicion(2*(tablero[0].length-1)-posicionAnterior-dado);
        }
        if(marcadorTurno==1){
            tablero[1][posicionAnterior]=null;
            tablero[1][j.getPosicion()]=j1;
        }else{
            tablero[2][posicionAnterior]=null;
            tablero[2][j.getPosicion()]=j2;
        }
        mostrarTablero();
        Casilla c=tablero[0][j.getPosicion()];
        if(c!=null)
            System.out.println(c.mostrarCaracteristicasCasilla());
        if(c instanceof Negro)
            j.setPtsEspiritu(j.getPtsEspiritu()+3);
        if(c instanceof Blanco)
            j.setMonedasOro(j.getMonedasOro()+3);
        if(c instanceof TMiedo){
            if(j.getPtsEspiritu()>=5){
                j.setPtsEspiritu(j.getPtsEspiritu()-5);    
            }else{//pierde un turno
                marcadorTurno*=-1;
                if(marcadorTurno==1)
                    turno(j1);
                else
                    turno(j2);
            }   
        }
        if(c instanceof TCodicia){
            if(j.getMonedasOro()>=2){
                j.setMonedasOro(j.getMonedasOro()/2);    
            }else{//pierde tantos turnos como monedas de oro
                marcadorTurno*=-1;
                for(int k=0;k<j.getMonedasOro();k++){
                    if(marcadorTurno==1)
                        turno(j1);
                    else
                        turno(j2);
                }
            }
        }
        if(c instanceof Miedoso){
            posicionAnterior=j.getPosicion();
            j.setPosicion(j.getPosicion()-j.getPtsEspiritu()-j.getMonedasOro());
                if(j.getPosicion()<0)
                    j.setPosicion(0);
            if(marcadorTurno==1){
                tablero[1][posicionAnterior]=null;
                tablero[1][j.getPosicion()]=j1;
            }else{
                tablero[2][posicionAnterior]=null;
                tablero[2][j.getPosicion()]=j2;
            }
            mostrarTablero();
        }
        if(c instanceof Suertudo){
            if(marcadorTurno==1)
                turno(j1);
            else
                turno(j2);
        }
        if(c instanceof Abisal)
            juegoActivo=false;
        if(c instanceof Ganador)
            juegoActivo=false;
    }
    public void mostrarTablero(){
        System.out.println();
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                if(tablero[i][j]==null)
                    System.out.print("  ");
                else
                    System.out.print(tablero[i][j].getFicha()+" ");
            }
        System.out.println();
        }
    }
    private int lanzarDado(){
        return (int)(Math.random()*6+1);
    }
}