public class CCorriente extends Cuenta{
    public CCorriente(double saldo){
        super(saldo);
    }
    public String retirar(double monto){
        String res="";
        if(monto<=saldo){
            saldo-=monto;
            res="Transaccion exitosa";
        }else
            res="Saldo insuficiente";
        return res;
    }
}