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
            String nombre=nombres[i];
            String palabra="";
            String nombreCorregido="";
            char c;
            for(int j=0;j<nombres[i].length();j++){
                c=nombre.charAt(j);
                if(c==' '||j==(nombre.length()-1)){
                    String primeraLetra=palabra.substring(0,1);
                    primeraLetra=primeraLetra.toUpperCase();
                    String resto=palabra.substring(1);
                    if(j==nombre.length()-1)
                        resto=resto+nombre.substring(j);
                    resto=resto.toLowerCase();
                    nombreCorregido=nombreCorregido+primeraLetra+resto+" ";
                    palabra="";
                }else{
                    palabra=palabra+c;
                }
            }
            nombres[i]=nombreCorregido;
        }
    }
    public void ordenarAlfabeticamente(){
        for(int i=0;i<nombres.length-1;i++){
            if(nombres[i].compareTo(nombres[i+1])>0){
                String aux=nombres[i];
                nombres[i]=nombres[i+1];
                nombres[i+1]=aux;
            }
        }
    }
    public void mostrarInforme(){
        for(int i=0;i<nombres.length;i++)
            System.out.println(nombres[i]);
    }
}
