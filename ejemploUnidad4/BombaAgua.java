public class BombaAgua{
    private int cantAguaTransporta;//litros
    private Turril turrilConectado;
    private TanqueAgua tanqueConectado;
    public BombaAgua(int cantAguaTransporta){
        this.cantAguaTransporta=cantAguaTransporta;
    }
    public BombaAgua(){
        cantAguaTransporta=7;
    }
    public void bombear(){
        int cantAguaTurril=turrilConectado.getCantAgua();
        cantAguaTurril=cantAguaTurril-cantAguaTransporta;
        turrilConectado.setCantAgua(cantAguaTurril);
        
        int cantAguaTanque=tanqueConectado.getCantAgua();
        cantAguaTanque=cantAguaTanque+cantAguaTransporta;
        tanqueConectado.setCantAgua(cantAguaTanque);
         
    }
    public int cantVecesBombear(){
        int res=210/cantAguaTransporta;
        return res;
    }
    public void conectarTurril(Turril turril){
        turrilConectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}
