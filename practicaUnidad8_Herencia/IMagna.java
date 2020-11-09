public class IMagna extends Identificacion{
    private int registroDiario;
    private int descuento;
    public IMagna(String nombre,int edad,int codigo){
        super(nombre,edad,codigo);
        registroDiario=0;
        descuento=edad;
    }
    public void nuevaVisita(){
        registroDiario++;
    }
    public int aplicarDescuento(int costoLugar){
        return costoLugar*(1-descuento/100);
    }
}
