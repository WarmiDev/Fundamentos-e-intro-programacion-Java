public class LetrasVocales{
    private char letra;
    private int[] vocales={65,69,73,79,85,97,101,105,111,117};
    public LetrasVocales(char letra){
        this.letra=letra;
    }
    public int distanciaVocalMasProxima(){
        int dist=58;
        for(int i=0;i<10;i++)
            if(Math.abs(letra-vocales[i])<dist)
                dist=Math.abs(letra-vocales[i]);
        if(dist==0){
            switch(letra){
                case 65:dist=4;break;
                case 69:dist=4;break;
                case 73:dist=4;break;
                case 79:dist=6;break;
                case 85:dist=6;break;
                case 97:dist=4;break;
                case 101:dist=4;break;
                case 105:dist=4;break;
                case 111:dist=6;break;
                case 117:dist=6;break;
            }
        }
        return dist-1;
    }
}
