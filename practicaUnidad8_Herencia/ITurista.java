public class ITurista extends Identificacion{
    private String nacionalidad;
    private int vigencia;
        public ITurista(String nombre,int edad,int codigo,int vig,String nac){
        super(nombre,edad,codigo);
        vigencia=vig;
        nacionalidad=nac;
    }
    public boolean comprobarVigencia(int diaActual){
        return diaActual<vigencia;
    }
}