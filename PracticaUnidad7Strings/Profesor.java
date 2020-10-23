public class Profesor{
    private Informe[] archivo; 
    public Profesor(int cantInformes){
        archivo=new Informe[cantInformes];
        for(int i=0;i<archivo.length;i++){
            archivo[i]=new Informe(3);
            archivo[i].ingresarDatosEstudiantes();
        }
    }
    public void organizarInformes(){
        for(int i=0;i<archivo.length;i++){
            archivo[i].corregirNombres();
            archivo[i].ordenarAlfabeticamente();
        }
    }
    public void generarReporte(){
        for(int i=0;i<archivo.length;i++){
            System.out.println("\nAUTORES DEL INFORME NRO."+(i+1)+":\n");
            archivo[i].mostrarInforme();
        }
    }
}
