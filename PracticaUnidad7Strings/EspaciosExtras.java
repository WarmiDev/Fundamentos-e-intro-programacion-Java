public class EspaciosExtras{
    private String texto;
    public EspaciosExtras(String texto){
        this.texto=texto;
    }
    public String eliminarEspaciosExtras(){
        String res="";
        char c,csig;
        for(int i=0;i<texto.length()-1;i++){
            //quita espacios repetidos contiguos, solo deja un espacio cuando hay mas de uno
            c=texto.charAt(i);
            csig=texto.charAt(i+1);
            if(c==' '){
                //si hay espacio, pero luego no hay espacio, entonces el espacio se mantiene
                if(csig!=' ')
                    res=res+c;    
            }else{
                res=res+c;
            }
        }
        c=texto.charAt(texto.length()-1);//analiza el ultimo caracter y solo lo aniade si no es espacio
        if(c!=' ')
            res=res+c; 
        c=res.charAt(0);//si el primer caracter es espacio, lo quita
        if(c==' ')
            res=res.substring(1);
        return res;
    }
}
