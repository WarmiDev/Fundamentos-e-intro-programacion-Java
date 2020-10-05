public class TabernaDeSuenios{
    private Suenio[] taberna;
    private int index=0;
    public TabernaDeSuenios(int tamTaberna){
        taberna=new Suenio[tamTaberna];
    }
    public String buscar(String nom){
        for(int i=0;i<taberna.length && !(taberna[i]==null);i++)
            if(nom==taberna[i].getNombre())
                return "El suenio existe, esta en la posicion "+i+" de la taberna";
            return "El suenio no existe";
    }
    public String almacenar(Suenio suenio){
        if(index<taberna.length){
            taberna[index]=suenio;
            index++;
            return "El suenio ha sido almacenado exitosamente";
            }
        else return "No ha sido posible almacenarlo, la memoria esta llena";
    }
    public String eliminar(int posicion){
        if(posicion<0 || posicion>=taberna.length)
            return "La posicion indicada no existe";
        else    if(taberna[posicion]==null)
                    return "El espacio indicado esta vacio";
                else{
                    for(int i=posicion;i<taberna.length-1;i++)
                        taberna[i]=taberna[i+1];
                    taberna[taberna.length-1]=null;
                    index--;
                    return "El suenio ha sido eliminado exitosamente";
                }
    }
    public String[] verSueniosAlmacenados(){
        String[] datos=new String[taberna.length];
        for(int i=0;i<taberna.length && !(taberna[i]==null);i++)
            datos[i]=taberna[i].getNombre()+": "+taberna[i].getDescripcion();
        return datos;
    }
}
