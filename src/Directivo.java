public class Directivo extends Empleado{
    public Directivo(String nombre, String codigo) {
        super(nombre, codigo);
    }
    String profesion;

    //Metodo personalizado
    public void saludoDirectivo(){
        System.out.println("Saludo desde directivo");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
