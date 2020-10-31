import java.util.ArrayList;
public class AlmacenFiguras{
    private ArrayList<Figura> lista;
    public AlmacenFiguras(){
        lista=new ArrayList();
    }
    public String agregarFigura(Figura f){
        if(lista.isEmpty())
            lista.add(f);
        else{
            int finCir=-1,finTri=-1,finCua=-1,indexf=-1;
            String formaf,colorf,formai,colori,colorSig;
            formaf=f.getForma();
            colorf=f.getColor();
            for(int i=0;i<lista.size();i++){//asignamos valores a los ultimos indices de cada figura
                formai=lista.get(i).getForma();
                if(formai.equals("circulo"))
                    finCir=i;
                if(formai.equals("triangulo"))
                    finTri=i;
                if(formai.equals("cuadrado"))
                    finCua=i;
            }
            switch(formaf){
                case "circulo":{
                    if(finCir==-1)
                        indexf=0;
                    else
                        indexf=finCir+1;
                }
                case "triangulo":{
                    if(finTri==-1){
                        if(finCir==-1)
                            indexf=0;
                        else
                            indexf=finCir+1;
                    }else
                        indexf=finTri+1;
                }
                case "cuadrado":{
                    if(finCua==-1){
                        if(finTri==-1)
                            if(finCir==-1)
                                indexf=0;
                            else
                                indexf=finCir+1;
                        else
                            indexf=finTri+1;
                    }else
                        indexf=finCua+1;
                }
                default: return "La forma de la figura es invalida";
            }
            if(indexf==0){
                colori=lista.get(0).getColor();
                if(colorf.equals(colori))
                    return "No puede agregarse la figura porque quedaria junto a otra del mismo color";
                else 
                    lista.add(indexf,f);
            }else{
                if(indexf==lista.size()-1){
                    colori=lista.get(indexf).getColor();
                if(colorf.equals(colori))
                    return "No puede agregarse la figura porque quedaria junto a otra del mismo color";
                else 
                    lista.add(indexf,f);
                } else{
                    colori=lista.get(indexf).getColor();
                    colorSig=lista.get(indexf+1).getColor();
                    if(colorf.equals(colori)||colorf.equals(colorSig))
                        return "No puede agregarse la figura porque quedaria junto a otra del mismo color";
                    else 
                        lista.add(indexf,f);
                }
            
            }
        }
            return "Figura agregada exitosamente";
    }
    public void mostrarListaFiguras(){
        for(Figura f:lista)
            System.out.print(f.getForma()+" "+f.getColor()+"\t");
    }
}
