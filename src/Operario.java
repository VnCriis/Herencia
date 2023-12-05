public class Operario extends  Empleado{
    public Operario(String nombre, String codigo) {
        super(nombre, codigo);
    }
    //Metodo personalizado
    public void saludoOperario(){
        System.out.println("Saludo desde operario");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
