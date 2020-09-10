public class CajaMusical{
    private boolean estado; //false=pausa  true=en reproduccion
    private String[] listaCanciones;
    private int indicadorCancCurso;
    public CajaMusical(String canc1, String canc2, String canc3){
        listaCanciones=new String[3];
        listaCanciones[0]=canc1;
        listaCanciones[1]=canc2;
        listaCanciones[2]=canc3;
        indicadorCancCurso=0;
        estado=false;        
    }
    public String reproducirCancion(){
        String msg;
        if(estado)
            msg="Ya esta sonando una cancion";
            else{
                msg="La cancion ha empezado a sonar";
                estado=true;
            }
        return msg;
    }
    public String pausarCancion(){
        String msg;
        if(estado){
            msg="La cancion ha sido pausada";
            estado=false;
        }
        else
            msg="La cancion ya se encuentra en pausa";
        return msg;
    }
    public void cambiarCancion(){
        indicadorCancCurso++;
        indicadorCancCurso%=3;
    }
    public String getCancCurso(){
        return listaCanciones[indicadorCancCurso];
    }
}
