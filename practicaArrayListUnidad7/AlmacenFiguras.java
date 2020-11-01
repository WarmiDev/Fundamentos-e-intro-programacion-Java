import java.util.ArrayList;
public class AlmacenFiguras{
    private ArrayList<Figura> circulos,triangulos,cuadrados;
    public AlmacenFiguras(){
        circulos=new ArrayList();
        triangulos=new ArrayList();
        cuadrados=new ArrayList();
    }
    public String agregarFigura(Figura f){
        String formaf=f.getForma();
        switch(formaf){
            case "circulo":return agregarCirculo(f);
            case "triangulo":return agregarTriangulo(f);
            case "cuadrado":return agregarCuadrado(f);
            default:return "La forma de la figura es invalida";
        }
    }
    public void generarReportePorColor(){
        int ciAm=0,ciAz=0,ciRo=0,trAm=0,trAz=0,trRo=0,cuAm=0,cuAz=0,cuRo=0;
        for(Figura f:circulos)
            switch(f.getColor()){
                case "amarillo":ciAm++;break;
                case "azul":ciAz++;break;
                case "rojo":ciRo++;break;
            }
        for(Figura f:triangulos)
            switch(f.getColor()){
                case "amarillo":trAm++;break;
                case "azul":trAz++;break;
                case "rojo":trRo++;break;
            }
        for(Figura f:cuadrados)
            switch(f.getColor()){
                case "amarillo":cuAm++;break;
                case "azul":cuAz++;break;
                case "rojo":cuRo++;break;
            }
        System.out.println("\nAmarillo:\tcirculo="+ciAm+"\ttriangulo="+trAm+"\tcuadrado="+cuAm);
        System.out.println("Azul:\tcirculo="+ciAz+"\ttriangulo="+trAz+"\tcuadrado="+cuAz);
        System.out.println("Rojo:\tcirculo="+ciRo+"\ttriangulo="+trRo+"\tcuadrado="+cuRo);
    }
    public void mostrarListaFiguras(){
        System.out.println();
        for(Figura f:circulos)
            System.out.println(f.getForma()+" "+f.getColor());
        for(Figura f:triangulos)
            System.out.println(f.getForma()+" "+f.getColor());
        for(Figura f:cuadrados)
            System.out.println(f.getForma()+" "+f.getColor());
    }
    private String agregarCirculo(Figura f){
        if(circulos.size()==0){
            circulos.add(f);
            return "La figura fue agregada";
        }else{
            String colorf=f.getColor();
            String colori=circulos.get(circulos.size()-1).getColor();
            if(!colorf.equals(colori)){
                circulos.add(f);
                return "La figura fue agregada";
            }else{
                return "La figura no fue agregada por coincidencia de color";
            }
        }    
    }
    private String agregarTriangulo(Figura f){
        if(triangulos.size()==0){
            triangulos.add(f);
            return "La figura fue agregada";
        }else{
            String colorf=f.getColor();
            String colori=triangulos.get(triangulos.size()-1).getColor();
            if(!colorf.equals(colori)){
                triangulos.add(f);
                return "La figura fue agregada";
            }else{
                return "La figura no fue agregada por coincidencia de color";
            }
        }    
    }
    private String agregarCuadrado(Figura f){
        if(cuadrados.size()==0){
            cuadrados.add(f);
            return "La figura fue agregada";
        }else{
            String colorf=f.getColor();
            String colori=cuadrados.get(cuadrados.size()-1).getColor();
            if(!colorf.equals(colori)){
                cuadrados.add(f);
                return "La figura fue agregada";
            }else{
                return "La figura no fue agregada por coincidencia de color";
            }
        }    
    }
}
