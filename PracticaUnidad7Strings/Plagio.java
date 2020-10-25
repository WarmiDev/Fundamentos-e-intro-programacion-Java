import java.util.Scanner;
public class Plagio{
    private String texto1,texto2;
    private String[] palabrasDeTexto1,palabrasDeTexto2;
    public void ingresarTextos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el texto 1:");
        texto1=sc.nextLine();
        System.out.println("Ingrese el texto 2:");
        texto2=sc.nextLine();
    }
    public void contarRepeticiones(){
        palabrasDeTexto1=Textos.getPalabras(texto1);
        palabrasDeTexto2=Textos.getPalabras(texto2);
        for(int i=0;i<palabrasDeTexto1.length;i++){
            int contCoincidencias=0;
            for(int j=0;j<palabrasDeTexto2.length;j++){
                if(palabrasDeTexto1[i].equals(palabrasDeTexto2[j]))
                    contCoincidencias++;
            }
            System.out.println(palabrasDeTexto1[i]+": "+contCoincidencias);
        }
    }
}
