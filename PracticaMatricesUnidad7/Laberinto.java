public class Laberinto{
    private char[][] jardines;
    private int filaD,columD;
    public Laberinto(int n,int m){
        jardines=new char[n][m];
        for(int i=0;i<jardines.length;i++){
            for(int j=0;j<jardines[i].length;j++){
                jardines[i][j]=MuroOCamino();
            }
        }
        filaD=(int)(Math.random()*n);
        columD=(int)(Math.random()*m);
        jardines[filaD][columD]='D';
    }
    private char MuroOCamino(){
        return Math.random()>0.6?'M':'-';//para que haya 60% de espacios libres y 40% de muros aproximadamente
    }
    public void mostrarJardines(){
        System.out.println();
        for(int i=0;i<jardines.length;i++){
            for(int j=0;j<jardines[i].length;j++){
                System.out.print(jardines[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();    
    }
    public void moverDerecha(){
        if(columD+1<jardines[0].length){
            if(jardines[filaD][columD+1]=='-'){
                jardines[filaD][columD+1]='D';
                jardines[filaD][columD]='-';
                columD++;
            }
        }
        mostrarJardines();
    }
    public void moverIzquierda(){
        if(columD-1>=0){
            if(jardines[filaD][columD-1]=='-'){
                jardines[filaD][columD-1]='D';
                jardines[filaD][columD]='-';
                columD--;
            }
        }
        mostrarJardines();
    }
    public void moverAbajo(){
        if(filaD+1<jardines.length){
            if(jardines[filaD+1][columD]=='-'){
                jardines[filaD+1][columD]='D';
                jardines[filaD][columD]='-';
                filaD++;
            }
        }
        mostrarJardines();
    }
    public void moverArriba(){
        if(filaD-1>=0){
            if(jardines[filaD-1][columD]=='-'){
                jardines[filaD-1][columD]='D';
                jardines[filaD][columD]='-';
                filaD--;
            }
        }
        mostrarJardines();
    }
}
