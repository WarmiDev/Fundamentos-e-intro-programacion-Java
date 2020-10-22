public class EjemplosStrings{
    public int tam(String cad){
        return cad.length();
    }
    public char obtenerChar(String cad,int i){
        return cad.charAt(i);
    }
    public boolean esIgual(String cad1){
        return cad1.equals("hola");
    }
    public String minus(String cad){
        return cad.toLowerCase();
    }
    public String mayus(String cad){
        return cad.toUpperCase();
    }
    public boolean contiene(String cad,String subcad){
        return cad.contains(subcad);
    }
    public int indiceDe(String cad,String subcad){
        return cad.indexOf(subcad);
    }
}
