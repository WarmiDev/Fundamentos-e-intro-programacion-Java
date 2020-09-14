public class OEPTernario{
    public String verificar(Persona persona){
        String res;
        int edadPersona=persona.getEdad();
        String nombrePersona=persona.getNombre();
        res=persona.getNombre();
        res=edadPersona>=18?res+" esta habilitado":res+" no esta habilitado";
        return res;
    }
}
