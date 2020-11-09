import java.util.ArrayList;
public class JuegoSenderoTenebros{
    private ArrayList<Casilla> tablero;
    private Jugador j1,j2;
    private int marcadorTurno;
    private boolean juegoActivo;
    public JuegoSenderoTenebros(){
        tablero=new ArrayList();
        int contadorAbisales=0;
        //cargamos el tablero aleatoriamente
        for(int i=0;i<59;i++){
            int limite;
            if(contadorAbisales<3)
                limite=6;
            else
                limite=5;
            int num=(int)(Math.random()*limite+1);
            switch(num){
                case 1:tablero.add(new Negro());break;
                case 2:tablero.add(new Blanco());break;
                case 3:{
                    int n=(int)(Math.random()*2+1);
                    if(n==1) 
                        tablero.add(new TMiedo());
                    else
                        tablero.add(new TCodicia());
                    break;
                }
                case 4:tablero.add(new Miedoso());break;
                case 5:tablero.add(new Suertudo());break;
                case 6:{
                    tablero.add(new Abisal());
                    contadorAbisales++;
                    break;
                }
            }
        }
        tablero.add(new Ganador());//La ultima siempre casilla ganador
    }
    public void agregarJugadores(Jugador j1,Jugador j2){
        this.j1=j1;
        this.j2=j2;
    }
    public void jugar(){
        juegoActivo=true;
        marcadorTurno=1;
        while(juegoActivo){
            turno();
            marcadorTurno*=-1;
        }
    }
    private void turno(){
        if(marcadorTurno==1)
            System.out.println("Turno de: "+j1.getFicha());
        else
            System.out.println("Turno de: "+j2.getFicha());
        int dado=lanzarDado();
        System.out.println("Se lanzo el dado y salio: "+dado);
        if(marcadorTurno==1){
            j1.setPosicion(j1.getPosicion()+dado);
            //si se pasa del tablero, retrocede
            if(j1.getPosicion()>=tablero.size())
                j1.setPosicion(2*(tablero.size()-1)-j1.getPosicion()-dado);
        }else{
            j2.setPosicion(j2.getPosicion()+dado);
            if(j2.getPosicion()>=tablero.size())
                j2.setPosicion(2*(tablero.size()-1)-j2.getPosicion()-dado);
        }
        mostrarTablero();
        mostrarJugadores();
        Casilla c;
        if(marcadorTurno==1)
            c=tablero.get(j1.getPosicion());
        else
            c=tablero.get(j2.getPosicion());
        System.out.println(c.mostrarCaracteristicasCasilla());
        if(c instanceof Negro){
            if(marcadorTurno==1)
                j1.setPtsEspiritu(j1.getPtsEspiritu()+3);
            else
                j2.setPtsEspiritu(j2.getPtsEspiritu()+3);
        }
        if(c instanceof Blanco){
            if(marcadorTurno==1)
                j1.setMonedasOro(j1.getMonedasOro()+3);
            else
                j2.setMonedasOro(j2.getMonedasOro()+3);
        }
        if(c instanceof TMiedo){
            if(marcadorTurno==1){
                if(j1.getPtsEspiritu()>=5){
                    j1.setPtsEspiritu(j1.getPtsEspiritu()-5);    
                }else{//pierde un turno
                    marcadorTurno=-1;
                    turno();
                }
            }else{
                if(j2.getPtsEspiritu()>=5){
                    j2.setPtsEspiritu(j2.getPtsEspiritu()-5);    
                }else{//pierde un turno
                    marcadorTurno=1;
                    turno();
                }
            }   
        }
        if(c instanceof TCodicia){
            if(marcadorTurno==1){
                for(int k=0;k<j1.getMonedasOro();k++){
                    marcadorTurno=-1;
                    turno();
                }
            }else{
                for(int k=0;k<j2.getMonedasOro();k++){
                    marcadorTurno=1;
                    turno();
                }
            }
        }
        if(c instanceof Miedoso){
            if(marcadorTurno==1){
                j1.setPosicion(j1.getPosicion()-j1.getPtsEspiritu());
                if(j1.getPosicion()<0)
                    j1.setPosicion(0);
            }else{j1.setPosicion(j1.getPosicion()-j1.getPtsEspiritu());
                if(j1.getPosicion()<0)
                    j1.setPosicion(0);
            }
            mostrarTablero();
            mostrarJugadores();
        }
        if(c instanceof Suertudo){
            turno();
        }
        if(c instanceof Abisal)
            juegoActivo=false;
        if(c instanceof Ganador)
            juegoActivo=false;
    }
    private void mostrarJugadores(){
        for(int m=0;m<tablero.size();m++){
            if(j1.getPosicion()==m)
                System.out.print(j1.getFicha()+" ");
            else
                System.out.print("  ");
        }
        System.out.println();
        for(int m=0;m<tablero.size();m++){
            if(j2.getPosicion()==m)
                System.out.print(j2.getFicha()+" ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
    public void mostrarTablero(){
        for(Casilla c:tablero){
            if(c instanceof Negro)
                System.out.print("N ");
            if(c instanceof Blanco)
                System.out.print("B ");
            if(c instanceof Trampa)
                System.out.print("T ");
            if(c instanceof Miedoso)
                System.out.print("M ");
            if(c instanceof Suertudo)
                System.out.print("S ");
            if(c instanceof Abisal)
                System.out.print("A ");
            if(c instanceof Ganador)
                System.out.print("G ");
        }
        System.out.println();
    }
    private int lanzarDado(){
        return (int)(Math.random()*6+1);
    }
}