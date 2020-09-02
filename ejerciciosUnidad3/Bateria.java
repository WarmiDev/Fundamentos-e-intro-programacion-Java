public class Bateria{
    public int batRestante(){
        int conJue=20;
        int conRrss=10;
        int conYt=15;
        int batInic=55;
        int minJue=30;
        int minRrss=15;
        int minYt=40;
        int conTotal=conJue*minJue/60+conRrss*minRrss/60+conYt*minYt/60;
        int res=batInic-conTotal;
        return res;
    }
}
