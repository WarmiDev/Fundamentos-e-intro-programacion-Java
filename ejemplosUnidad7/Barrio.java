public class Barrio{
    private Lote[][] lotes;
    private int calleMay,calleMen;
    public Barrio(Lote[][] lotes){
        this.lotes=lotes;
    }
    public String nombPropMayCant(){
        int mayor=lotes[0][0].getCantPersonas();
        String nombre=lotes[0][0].getPropietario();
        calleMay=0;
        for(int i=0;i<lotes.length;i++){
            for(int j=0;j<lotes[i].length;j++){
                if(lotes[i][j].getCantPersonas()>mayor){
                    mayor=lotes[i][j].getCantPersonas();
                    nombre=lotes[i][j].getPropietario();
                    calleMay=i;
                }
            }
        }
        return nombre;
    }
    public String nombPropMenCant(){
        int menor=lotes[0][0].getCantPersonas();
        String nombre=lotes[0][0].getPropietario();
        calleMen=0;
        for(int i=0;i<lotes.length;i++){
            for(int j=0;j<lotes[i].length;j++){
                if(lotes[i][j].getCantPersonas()<menor){
                    menor=lotes[i][j].getCantPersonas();
                    nombre=lotes[i][j].getPropietario();
                    calleMen=i;
                }
            }
        }
        return nombre;
    }
    public String callesLoteMayCant(){
        return "Esta entre la calle "+calleMay+" y la calle "+(calleMay+1);
    }
    public String callesLoteMenCant(){
        return "Esta entre la calle "+calleMen+" y la calle "+(calleMen+1);
    }
    public void visualizar(){
        for(int i=0;i<lotes.length;i++){
            for(int j=0;j<lotes[i].length;j++){
                System.out.print("("+lotes[i][j].getCantPersonas()+","+
                lotes[i][j].getPropietario()+")  ");
            }
            System.out.println();
        }
    }
}
