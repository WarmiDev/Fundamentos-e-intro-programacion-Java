public class Alhandal{
    public int[] calcularCantMon(){
        boolean cond=false;
        int[] res=new int[3];
        for(int d=0;d<3;d++){
           for(int c=0;c<6;c++){
               for(int u=0;u<29;u++){
                   if((10*d+8*c+6*u==68)&&(10*d+5*c+u==28)){
                       res[0]=d;
                       res[1]=c;
                       res[2]=u;
                   }
               }
           }
        }
        return res;
    }
}
