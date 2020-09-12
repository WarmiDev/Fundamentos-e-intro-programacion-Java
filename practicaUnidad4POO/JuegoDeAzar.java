public class JuegoDeAzar{
    private int coordenadaEnX, coordenadaEnY, intentos;
    public JuegoDeAzar(){
        coordenadaEnX=(int)Math.floor(Math.random()*(11));
        coordenadaEnY=(int)Math.floor(Math.random()*(11));
        intentos=0;
        
    }
    public String jugar(int x, int y){
        String msg;
        if(intentos<3){
            if(x==coordenadaEnX && y==coordenadaEnY){
                msg="Ganaste!!! Aqui esta tu tesoro";
                intentos=3; 
            }
            else{
                if(x==coordenadaEnX)
                    msg="x esta en su posicion, ";
                else{
                    if(Math.abs(coordenadaEnX-x)<3)
                        msg="x esta cerca, ";
                    else
                        msg="x esta lejos, ";
                    }
                if(y==coordenadaEnY)
                    msg+="y esta en su posicion, ";
                else{
                    if(Math.abs(coordenadaEnY-y)<3)
                            msg+="y esta cerca.";
                    else
                            msg+="y esta lejos.";
                 }
            }
            intentos++;
        }
        else
            msg="Se acabaron tus intentos";
        return msg;
    }
}
