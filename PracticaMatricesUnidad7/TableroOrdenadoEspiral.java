public class TableroOrdenadoEspiral{
    private int tablero[][];
    public TableroOrdenadoEspiral(int tam){
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
        int[] arreglo=new int[tablero.length*tablero.length];
        int index=0;
        for(int i=0;i<tablero.length;i++){//"descarga" los datos de tablero en un arreglo
            for(int j=0;j<tablero.length;j++){
                arreglo[index]=tablero[i][j];
                index++;
            }
        }
        for(int i=0;i<arreglo.length-1;i++){//ordena las casillas del arreglo de menor a mayor
            int aux;
            for(int j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){ 
                    aux=arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]=aux;
                }
            }
        }
        index=0;
        //"cargamos" los datos del arreglo en el tablero en orden de espiral 
        for(int i=0;i<tablero.length/2;i++){ //i son las vueltas q hay q dar, como la cantidad de circulos concentricos
            for(int j=tablero.length-i-1;j>i;j--){//recorrido de izquierda a derecha, 
                                                     //"length-i" representa la columna inicial del recorrido dependiendo en q vuelta estamos
                                                     //j>i es para q llegue hasta el limite izquierdo de la vuelta -1, antes de comenzae el sgte ciclo  
                tablero[tablero.length-i-1][j]=arreglo[index]; //tablero.length-i-1 representa la fila que varia segun cada vuelta
                index++; //para pasar al sgte elemento del arreglo ya ordenado
            }
            for(int j=tablero.length-i-1;j>i;j--){//recorrido de abajo a arriba, similar al anterior pero cambian las filas 
                tablero[j][i]=arreglo[index]; 
                index++; 
            }
            for(int j=i;j<tablero.length-1-i;j++){//recorrido de izq a derecha 
                tablero[i][j]=arreglo[index]; 
                index++; 
            }
            for(int j=i;j<tablero.length-1-i;j++){//recorrido de arriba a abajo 
                tablero[j][tablero.length-i-1]=arreglo[index]; 
                index++; 
            }
        }
        if(tablero.length%2!=0){//en caso que el tamanio del tablero sea impar, hay q aumentar el medio
            tablero[tablero.length/2][tablero.length/2]=arreglo[index];
        }
    }
}
