public class Textos{
    private String texto;
    public Textos(String texto){
        this.texto=texto;
    }
    public static String[] getPalabras(String texto){
        int cantPalabras=0;
        if(texto!=""){
            cantPalabras=1;
        }
        char c;
        for(int i=0;i<texto.length();i++){
            c=texto.charAt(i);
            if(c==' ')
                cantPalabras++;
        }
        String[] res=new String[cantPalabras];
        String palabra="";
        int index=0;
        for(int i=0;i<texto.length();i++){
            c=texto.charAt(i);
            if((c==' '||c==','||c=='.'||i==texto.length()-1)&&!(palabra.equals(""))){
                if(palabra.charAt(0)==' ') 
                    palabra=palabra.substring(1);
                if(i==texto.length()-1&&c!='.')
                    palabra=palabra+texto.substring(i);
                res[index]=palabra;
                index++;
                palabra="";
            }else{
                palabra=palabra+c;
            }
        }
        return res;
    }
    public void mostrarPalabras(){
        String[] palabras=getPalabras(texto);
        int tamTexto=palabras.length; 
        System.out.println("El texto tiene "+tamTexto+" palabras");
        for(int i=0;i<tamTexto;i++)
            System.out.println(palabras[i]);
    }
}
