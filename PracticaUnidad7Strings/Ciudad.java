public class Ciudad{
    private String calle;
    private int contBaches;
    public Ciudad(String calle){
        this.calle=calle;
        contBaches=0;
    }
    public void contarBaches(){
        char c,csig;
        for(int i=0;i<calle.length()-1;i++){
            c=calle.charAt(i);
            csig=calle.charAt(i+1);
            if(c=='0'&&csig!='0')
                contBaches++;
        }
        //analizamos la ultima posicion
        c=calle.charAt(calle.length()-1);
        if(c=='0')
            contBaches++;
        System.out.println(calle);    
        System.out.println("La cantidad de baches es: "+contBaches);
    }
}