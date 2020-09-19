public class Familia{
    private Hijo mayor,mediano,menor;
    public Hijo h1,h2,h3;
    public Familia(Hijo h1,Hijo h2, Hijo h3){
        this.h1=h1;
        this.h2=h2;
        this.h3=h3;
    }
    public void establecerOrdenHijos(){     
        if(h1.edad>h2.edad&&h2.edad>h3.edad){
            mayor=h1;
            mediano=h2;
            menor=h3;
        } else if(h1.edad>h3.edad&&h3.edad>h2.edad){
            mayor=h1;
            mediano=h3;
            menor=h2;
        } else if(h2.edad>h1.edad&&h1.edad>h3.edad){
            mayor=h2;
            mediano=h1;
            menor=h3;
        } else if(h2.edad>h3.edad&&h3.edad>h1.edad){
            mayor=h2;
            mediano=h3;
            menor=h1;
        } else if(h3.edad>h1.edad&&h1.edad>h2.edad){
            mayor=h3;
            mediano=h1;
            menor=h2;
        } else if(h3.edad>h2.edad&&h2.edad>h1.edad){
            mayor=h3;
            mediano=h2;
            menor=h1;
        }
    }
    public String getMayor(){
        return mayor.nombre;
    }
    public String getMediano(){
        return mediano.nombre;
    }
    public String getMenor(){
        return menor.nombre;
    }
}
