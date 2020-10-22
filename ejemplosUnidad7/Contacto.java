public class Contacto{
    private int nroCel;
    private String[] bandejaEntrada;
    private String mensaje;
    private int control;
    public Contacto(int nro,int cap){
        nroCel=nro;
        bandejaEntrada=new String[cap];
        control=0;
    }
    private void codificar(){
        String res="";
        for(int i=0;i<mensaje.length();i++){
            char x=mensaje.charAt(i);
            x++;
            res=res+x;
        }
        mensaje=res;
    }
    private void decodificar(){
        String res="";
        for(int i=0;i<mensaje.length();i++){
            char x=mensaje.charAt(i);
            x--;
            res=res+x;
        }
        mensaje=res;
    }
    public void escribirSms(String msj){
        mensaje="De: "+nroCel+"\n"+msj;
    }
    public void enviarSms(Contacto c){
        codificar();
        c.recibirSms(mensaje);
    }
    public void recibirSms(String msj){
        mensaje=msj;
        decodificar();
        bandejaEntrada[control]=mensaje;
        control++;
    }
    public void revisarBandeja(){
        for(int i=0;i<bandejaEntrada.length;i++){
            System.out.println("mensaje nro:"+(i+1));
            System.out.println(bandejaEntrada[i]); 
        }
    }
}
