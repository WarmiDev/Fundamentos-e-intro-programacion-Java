public class Textos{
    private String texto;
    private int contPalabras;
    private String[] palabras;
    public Textos(String texto){
        this.texto=texto;
        contPalabras=1;
        palabras=new String[300];
    }
    public void contarPalabras(){
        String palabra="";
        char c;
        for(int i=0;i<texto.length();i++){
            c=texto.charAt(i);
            if((c==' '||c==','||c=='.')&&!(palabra.equals(""))){
                if(palabra.charAt(0)==' ') palabra=palabra.substring(1);
                palabras[contPalabras-1]=palabra;
                contPalabras++;
                palabra="";
            }else{
                palabra=palabra+c;
            }
        }
        System.out.println("El texto tiene "+(contPalabras-1)+" palabras");
    }
    public void mostrarPalabras(){
        for(int i=0;i<contPalabras-1;i++)
            System.out.println(palabras[i]);
    }
}
