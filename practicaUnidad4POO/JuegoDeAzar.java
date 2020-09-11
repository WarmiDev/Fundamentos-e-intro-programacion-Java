public class JuegoDeAzar{
    private int a, b, i;
    public JuegoDeAzar(){
        a=(int)Math.floor(Math.random()*(11));
        b=(int)Math.floor(Math.random()*(11));
    }
    public void jugar(){
        for(i=0; i<3; i++){
            int x=pedirCoordenada();
            int y=pedirCoordenada();
            comparar(x,y);
        }
    }
    private int pedirCoordenada(){//no se como pedir
        return 0;//solo para que compile
    }
    private String comparar(int x, int y){
        String msg;
        if(x==a && y==b){
            msg="Ganaste!!! Aqui esta tu tesoro";
            i=3;
        }
        else{
            if(x==a)
                msg="x esta en su posicion, ";
            else{
                if(Math.abs(a-x)<3)
                    msg="x esta cerca, ";
                else
                    msg="x esta lejos, ";
                }
            if(y==b)
                msg+="y esta en su posicion, ";
            else{
                if(Math.abs(b-y)<3)
                        msg+="y esta cerca.";
                else
                        msg+="y esta lejos.";
             }
        }
        return msg;
    }
}
