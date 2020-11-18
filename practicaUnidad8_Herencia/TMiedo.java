public class TMiedo extends Trampa{
    public String mostrarCaracteristicasCasilla(){
        return "Si tienes suficiente, se descuentan 5 ptsEspiritu, sino pierde turno";
    }
    public int efectoCasilla(Jugador j){
        if(j.getPtsEspiritu()>=5){
                j.setPtsEspiritu(j.getPtsEspiritu()-5);   
                return -1;
            }else{//pierde un turno
                return 1;
            }
    }
}