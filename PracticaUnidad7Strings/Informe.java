import java.util.Scanner;
public class Informe{
    private String[] nombres;
    public Informe(int cantEstudiantes){
        nombres=new String[cantEstudiantes];
    }
    public void ingresarDatosEstudiantes(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nombres.length;i++){
            System.out.println("Ingrese nombre del estudiante "+(i+1));
            nombres[i]=sc.nextLine();
        }
    }
    public void corregirNombres(){
        for(int i=0;i<nombres.length;i++){
            String[] nombreYApellidos=Textos.getPalabras(nombres[i]);
            for(int j=0;j<nombreYApellidos.length;j++)
                nombreYApellidos[j]=corregirPalabra(nombreYApellidos[j]);
            nombres[i]="";
            for(int j=0;j<nombreYApellidos.length;j++)
                nombres[i]=nombres[i]+nombreYApellidos[j]+" ";    
        }
    }
    private String corregirPalabra(String palabra){
        if(palabra!=""&&palabra.length()>1){
            String primeraLetra=palabra.substring(0,1);
            primeraLetra=primeraLetra.toUpperCase();
            String resto=palabra.substring(1);
            resto=resto.toLowerCase();
            return primeraLetra+resto;
        }else{
            return palabra.toUpperCase();
        }
    }
    public void ordenarAlfabeticamente(){
        for(int i=0;i<nombres.length-1;i++){
            String aux;
            for(int j=i+1;j<nombres.length;j++){
                if(nombres[i].compareTo(nombres[j])>0){
                    aux=nombres[i];
                    nombres[i]=nombres[j];
                    nombres[j]=aux;
                }
            }
        }
    }
    public void mostrarInforme(){
        for(int i=0;i<nombres.length;i++)
            System.out.println(nombres[i]);
    }
}
