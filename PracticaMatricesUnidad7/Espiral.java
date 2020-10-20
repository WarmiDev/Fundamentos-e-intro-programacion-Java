public class Espiral{
    private int tablero[][];
    public Espiral(int tam){
        tablero=new int[tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                tablero[i][j]=(int)(Math.random()*100);
            }
        }
    }
    public void mostrarTablero(){
        System.out.println();
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                if(tablero[i][j]<10)
                    System.out.print(" "+tablero[i][j]+"  ");
                else
                    System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();    
    }
    public void setTablero(int[][] mat){
        tablero=mat;
    }            
    public void ordenarEnEspiral(){
        //colocar los datos del tablero en un arreglo
        int[] arreglo=new int[tablero.length*tablero.length];
        int index=0;
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                arreglo[index]=tablero[i][j];
                index++;
            }
        }
        //ordenar las casillas del arreglo de menor a mayor
        for(int i=0;i<arreglo.length-1;i++){
            int aux;
            for(int j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){ 
                    aux=arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]=aux;
                }
            }
        }
        //acomodar los datos del arreglo en el tablero en orden de espiral 
        index=0;
        for(int vueltas=0;vueltas<tablero.length/2;vueltas++){ 
            //recorrido de izquierda a derecha
            for(int i=tablero.length-1-vueltas;i>vueltas;i--){ 
                tablero[tablero.length-1-vueltas][i]=arreglo[index]; 
                index++; 
            }
            //recorrido de abajo a arriba
            for(int i=tablero.length-1-vueltas;i>vueltas;i--){ 
                tablero[i][vueltas]=arreglo[index]; 
                index++; 
            }
            //recorrido de izquierda a derecha
            for(int i=vueltas;i<tablero.length-1-vueltas;i++){ 
                tablero[vueltas][i]=arreglo[index]; 
                index++; 
            }
            //recorrido de arriba a abajo
            for(int i=vueltas;i<tablero.length-1-vueltas;i++){ 
                tablero[i][tablero.length-1-vueltas]=arreglo[index]; 
                index++; 
            }
        }
        //Cuando el tamanio del tablero sea impar, hay q aumentar el valor de la celda del centro
        if(tablero.length%2!=0)
            tablero[tablero.length/2][tablero.length/2]=arreglo[index];
    }
}
