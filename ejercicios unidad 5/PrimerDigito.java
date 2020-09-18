public class PrimerDigito{
    private int n;
    private String res="Numero invalido para esta situacion";
    public PrimerDigito(int n){
        this.n=n;
    }
    public String calcPrimerDigito(){
        if(n>99&&n<1000)
            res="Primer digito: "+n/100;
        return res;
    }
}
