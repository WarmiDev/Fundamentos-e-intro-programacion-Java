public class VorticesEnElMar{
    private int[] alturas;
    private int min,max,imin,imax;
    public VorticesEnElMar(int[] alturas){
        this.alturas=alturas;
        min=alturas[0];
        max=alturas[0];
        imin=0;
        imax=0;
    }
    public String hallarVortice(){
        String res="El vortice esta formado por los nuemeros ";
        for(int i=1;i<alturas.length;i++){
            if(alturas[i]<min){
                min=alturas[i];
                imin=i;
            }
            if(alturas[i]>max){
                max=alturas[i];
                imax=i;
            }
        }
        int[] vortice=new int[Math.abs(imax-imin)+1];
        if(imin<imax)
            for(int i=0;i<vortice.length;i++)
                vortice[i]=alturas[imin+i];
        if(imin>imax)
            for(int i=0;i<vortice.length;i++)
                vortice[i]=alturas[imax+i];
        res+=vortice[0];        
        for(int i=1;i<vortice.length;i++)   
            res+=", "+vortice[i];
        return res;
    }
}
