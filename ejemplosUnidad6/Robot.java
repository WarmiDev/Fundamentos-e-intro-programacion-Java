public class Robot{
    private int energiaMax,energia;
    public Robot(int energiaMax){
        this.energiaMax=energiaMax;
        energia=0;
    }
    public void cargarEnergia(){
        energia=energiaMax;
    }
    public int cantVueltas(int perimetro){
        int vueltas=0;
        int energiaNecesaria=perimetro;
        while(energia>=energiaNecesaria){
            energia-=energiaNecesaria;
            vueltas++;
            energiaNecesaria+=perimetro;
        }
        return vueltas;
    }
    public int cantVueltas2(int perimetro){
        int vueltas=0;
        for(int energiaNecesaria=perimetro;energia>=energiaNecesaria;energiaNecesaria+=perimetro){
            energia-=energiaNecesaria;
            vueltas++;
        }
        return vueltas;
    }
}
