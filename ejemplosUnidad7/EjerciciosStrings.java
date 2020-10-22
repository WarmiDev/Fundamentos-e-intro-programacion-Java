public class EjerciciosStrings{
    public int cantVocales(String nomb){
        int cont=0;
        nomb=nomb.toLowerCase();
        for(int i=0;i<nomb.length();i++){
            char x=nomb.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                cont++;
        }
        return cont;
    }
    public String invertir(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            res=cad.charAt(i)+res;
        }
        return res;
    }
    public String codificar(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            char x=cad.charAt(i);
            if(x=='z'){
                x='a';
            }else{
            x++;
            }
            res=res+x;
        }
        return res;
    }
    public String decodificar(String cad){
        String res="";
        for(int i=0;i<cad.length();i++){
            char x=cad.charAt(i);
            if(x=='a'){
                x='z';
            }else{
            x--;
            }
            res=res+x;
        }
        return res;
    }
}
