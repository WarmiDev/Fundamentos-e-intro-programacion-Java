public class Bisiesto{
    private int anio;
    String res="el dato proporcionado es invalido";
    public Bisiesto(int anio){
        this.anio=anio;
    }
    public String definirSiBisiesto(){
        if(anio%4==0&&(!(anio%100==0||anio%200==0||anio%300==0)||anio%400==0))
            res=anio+" es un anio bisiesto";
        else
            res=anio+" no es un anio bisiesto";
        return res;
    }
}
