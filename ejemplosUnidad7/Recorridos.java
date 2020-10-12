public class Recorridos{
    
    public void ajedrez(int tam){
        int[][] matriz=new int[tam][tam];
        int c=1;
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                if(c==1)  matriz[i][j]=1;
                c*=-1;
            }
        }
        mostrar(matriz);
    }public void diagonalSecundaria(int tam){
        int[][] matriz=new int[tam][tam];
        for(int i=0;i<tam;i++){
            matriz[i][tam-1-i]=1;
        }
        mostrar(matriz);
    }
    public void diagonalPrincipal(int tam){
        int[][] matriz=new int[tam][tam];
        for(int i=0;i<tam;i++){
            matriz[i][i]=1;
        }
        mostrar(matriz);
    }
    public void mostrar(int[][] mat){
        for(int fila=0;fila<mat.length;fila++){
            for(int columna=0;columna<mat[fila].length;columna++){
                System.out.print(mat[columna][fila]+" ");
            }
            System.out.println();
        }
    }
}
/*{{2,5,12,10,4,5},{4,2,22,1,3,0},{8,7,3,4,2,1},{14,0,2,15,8,6},{6,10,4,2,1,21},{2,1,6,8,0,10}}*/