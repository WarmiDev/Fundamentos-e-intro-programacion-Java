public class Gato{
    private int edad;
    private double peso;
    private String nombre;
    
    public Gato(int edad, double peso, String nom){
        this.edad = edad;
        this.peso = peso;
        nombre = nom;
    }
    
    public double getPeso(){
        return peso;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setPeso(double valor){
        peso = valor;
    }
    public boolean equals(Gato otro){
        return edad==otro.getEdad() && nombre.equals(otro.getNombre()) && peso==otro.getPeso();
    }
}