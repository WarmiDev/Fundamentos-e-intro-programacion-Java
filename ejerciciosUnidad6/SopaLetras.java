public class SopaLetras{
    private String frase,palabra,primerasLetras;
    public SopaLetras(String frase,String palabra){
        this.frase=frase.toLowerCase();
        this.palabra=palabra.toLowerCase();
        primerasLetras=this.frase.substring(0,1);
        for(int i=0;i<this.frase.length()-1;i++){
            char c=this.frase.charAt(i);
            if(c==' ')
                primerasLetras=primerasLetras+this.frase.substring(i+1,i+2);
        }
    }
    public String evaluarPalabra(){
        String res;
        for(int i=0;i<palabra.length();i++){
            boolean bandera=false;
            char a=palabra.charAt(i);
            for(int j=0;j<primerasLetras.length();j++){
                char b=primerasLetras.charAt(j);
                if(a==b) bandera=true;
            }
            if(bandera==false) return "No es posible formar la palabra deseada";
        }
        return "Si, es posible formar la palabra deseada";
    }
    public String evaluarPalabra2(){
        return primerasLetras.contains(palabra)?"Es posible":"No es posible";
    }
}
