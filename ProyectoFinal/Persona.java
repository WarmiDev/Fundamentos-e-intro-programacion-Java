import java.util.ArrayList;
public class Persona{
    private String nombre;
    private int edad;
    private int numCel;
    private ArrayList<Persona> contactos;
    private ArrayList<Mensaje> bandejaEntrada;
    private ArrayList<Mensaje> bandejaSalida;
    public Persona(String nom,int edad,int num){
        nombre=nom;
        this.edad=edad;
        numCel=num;
        contactos=new ArrayList();
        bandejaEntrada=new ArrayList();
        bandejaSalida=new ArrayList();
    }
    public String agregarContacto(Persona p){
        int num=p.numCel;
        String res="";
        boolean inexistente=true;
        for(Persona per:contactos)
            if(per.numCel==num){
                inexistente=false;
                res="Este numero ya esta agregado en tus contactos";
            }
        if(inexistente){
            contactos.add(p);
            res="Contacto agregado exitosamente";
        }
        return res;
    }
    public void buscarContactoPorNumCel(int num){
        for(Persona p:contactos)
            if(p.numCel==num){
                mostrarInformacionContacto(p);
                break;
            }
    }
    public void buscarContactoPorNombre(String nom){
        for(Persona p:contactos)
            if(p.nombre.equals(nom)){
                mostrarInformacionContacto(p);
                break;
            }
    }
    private void mostrarInformacionContacto(Persona p){
        System.out.println(p.nombre);
        System.out.println("Edad: "+p.edad+"\tNumero de celular: "+p.numCel);
    }
    public void ordenarContactosAlfabeticamente(){
        for(int i=0;i<contactos.size()-1;i++){
            Persona aux;
            for(int j=i+1;j<contactos.size();j++){
                if(contactos.get(i).nombre.compareTo(contactos.get(j).nombre)>0){
                    aux=contactos.get(i);
                    contactos.set(i,contactos.get(j));
                    contactos.set(j,aux);
                }
            }
        }
    }
    public void mostrarContactos(){
        System.out.println("TU LISTA DE CONTACTOS");
        for(Persona p:contactos)
            mostrarInformacionContacto(p);
    }
    public String enviarMensaje(int numDestino,String textoMensaje){
        String res="";
        Mensaje mensaje=new Mensaje(textoMensaje,numCel,numDestino);
        bandejaSalida.add(mensaje);
        for(Persona p:contactos)
            if(p.numCel==numDestino){
                p.bandejaEntrada.add(mensaje);
                res="El mensaje fue enviado correctamente";
                mensaje.mensajeRecibido();
                break;
            }else
                res="Numero de destinatario incorrecto";
        return res;
    }
    public void revisarMensajesRecibidos(){
        System.out.println("TU BANDEJA DE ENTRADA");
        for(Mensaje m:bandejaEntrada){
            m.mensajeLeido();
            mostrarMensaje(m);
        }
    }
    public void revisarMensajesRecibidosDe(int numRemitente){
        System.out.println("Mensajes recibidos de: "+numRemitente);
        for(Mensaje m:bandejaEntrada)
            if(m.getNumRemitente()==numRemitente){
                m.mensajeLeido();
                mostrarMensaje(m);
            }
    }
    public void revisarMensajesEnviados(){
        System.out.println("TU BANDEJA DE SALIDA");
        for(Mensaje m:bandejaSalida)
            mostrarMensaje(m);
    }
    public void revisarMensajesEnviadosA(int numDestino){
        System.out.println("Mensajes enviados a: "+numDestino);
        for(Mensaje m:bandejaSalida)
            if(m.getNumDestinatario()==numDestino)
                mostrarMensaje(m);
    }
    private void mostrarMensaje(Mensaje m){
        System.out.println("De: "+m.getNumRemitente()+"\tPara: "+m.getNumDestinatario());
        System.out.println("Mensaje enviado a las: "+m.getHoraEnvio());
        System.out.println("<<"+m.getContenido()+">>");
        System.out.println("Estado del mensaje: "+m.getEstado());
    }
}
