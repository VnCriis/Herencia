public class subDirectivo extends Directivo{
    public subDirectivo(String nombre, String codigo) {
        super(nombre, codigo);
    }
    public void saludosubDirectivo(){
        System.out.println("Saludo desde subdirectivo");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
