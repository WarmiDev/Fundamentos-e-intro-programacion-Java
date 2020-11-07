import java.util.ArrayList;
public class Cliente implements SerVivo,Mortal{
    private ArrayList<Cuenta> cuentas;
    public Cliente(){
        cuentas=new ArrayList<>();
    }
    public void agregarCuenta(Cuenta nueva){
        cuentas.add(nueva);
    }
    public int contarCuentasCorrientes(){
        int cont=0;
        for(Cuenta c:cuentas)
            if(c instanceof CCorriente)
                cont++;
        return cont;
    }
    public int contarCuentasAhorros(){
        int cont=0;
        for(Cuenta c:cuentas)
            if(c instanceof CAhorro)
                cont++;
        return cont;
    }
}