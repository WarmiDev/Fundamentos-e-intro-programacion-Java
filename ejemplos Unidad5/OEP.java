public class OEP{
    public String verificar(Persona persona){
        String res;
        int edadPersona=persona.getEdad();
        String nombrePersona=persona.getNombre();
        if(edadPersona>=18)
            res=persona.getNombre()+" esta habilitado";
        else 
            res=persona.getNombre()+" no esta habilitado";
        return res;
    }
}
