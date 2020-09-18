public class Cumpleanios{
    private String dia,mes,anio;
    private String res="datos invalidos";
    public Cumpleanios(String fecha){
        dia=fecha.substring(0,fecha.indexOf("/"));
        fecha=fecha.substring(fecha.indexOf("/")+1,fecha.length());
        mes=fecha.substring(0,fecha.indexOf("/"));
        anio=fecha.substring(fecha.length()-4,fecha.length());
    }
    public String getDia(){
        return dia;
    }
    public String geMes(){
        return mes;
    }
    public String getAnio(){
        return anio;
    }
    public String fechaEnLiteral(){
        switch(mes){
            case "1":case "01":res=dia+" de enero de "+anio;break;
            case "2":case "02":res=dia+" de febrero de "+anio;break;
            case "3":case "03":res=dia+" de marzo de "+anio;break;
            case "4":case "04":res=dia+" de abril de "+anio;break;
            case "5":case "05":res=dia+" de mayo de "+anio;break;
            case "6":case "06":res=dia+" de junio de "+anio;break;
            case "7":case "07":res=dia+" de julio de "+anio;break;
            case "8":case "08":res=dia+" de agosto de "+anio;break;
            case "9":case "09":res=dia+" de septiembre de "+anio;break;
            case "10":res=dia+" de octubre de "+anio;break;
            case "11":res=dia+" de noviembre de "+anio;break;
            case "12":res=dia+" de diciembre de "+anio;break;        
        }
        return res;
    }
}