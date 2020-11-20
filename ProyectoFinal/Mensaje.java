public class Mensaje{
    private String contenido;
    private Hora horaEnvio;
    private Estado estado;
    private int numRemitente;
    private int numDestinatario;
    public Mensaje(String textoMensaje,int numRem,int numDest){
        contenido=textoMensaje;
        horaEnvio=new Hora();
        estado=Estado.ENVIADO;
        numRemitente=numRem;
        numDestinatario=numDest;
    }
    public int getNumRemitente(){
        return numRemitente;
    }
    public int getNumDestinatario(){
        return numDestinatario;
    }
    public String getHoraEnvio(){
        return horaEnvio.getHora();
    }
    public String getEstado(){
        if(estado==Estado.ENVIADO)
            return "Mensaje enviado";
        else if(estado==Estado.RECIBIDO)
            return "Mensaje recibido";
        else return "Mensaje leido";
    }
    public String getContenido(){
        return contenido;
    }
    public void mensajeLeido(){
        estado=Estado.LEIDO;
    }
    public void mensajeRecibido(){
        estado=Estado.RECIBIDO;
    }
}
