public class Juego{
    private Jugador[][] mapa;
    public Juego(){
        mapa=new Jugador[10][15];
    }
    public void agregarJugador(Jugador j){
        int x=j.getPosX();
        int y=j.getPosY();
        if(mapa[x][y]==null){
            mapa[x][y]=j;
        }
    }
    public void caminar(String nomb){
        for(int i=0;i<mapa.length;i++){
            for(int j=0;j<mapa[i].length;j++){
                if(mapa[i][j]!=null){
                    Jugador miJug=mapa[i][j];
                    if(miJug.getNombre().equals(nomb)){  
                        miJug.caminar();
                        int x=miJug.getPosX();
                        int y=miJug.getPosY();
                        if(esValido(y)){
                            mapa[x][y]=miJug;
                            mapa[i][j]=null;
                        }
                        break;
                    }
                }
            }
        }
    }
    private boolean esValido(int y){
        return y>=0&&y<mapa[0].length;
    }
    public void verMapa(){
        for(int i=0;i<mapa.length;i++){
            for(int j=0;j<mapa[i].length;j++){
                if(mapa[i][j]!=null){
                    Jugador miJug=mapa[i][j];
                    System.out.print(miJug.getFicha()+" ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
