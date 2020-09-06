public class Insomnio{
    public int calcularTiempo(){
    int horaDurmio=2;
        int minDurmio=45;
        int horaDesp=11;
        int minDesp=25;
        int horaDurmioMin=horaDurmio*60+minDurmio;
        int horaDespMin=horaDesp*60+minDesp;
        int res=horaDespMin-horaDurmioMin;
        return res;
    }
}
