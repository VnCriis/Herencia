public class Tecnico extends Operario{
    public Tecnico(String nombre, String codigo) {
        super(nombre, codigo);
    }
    //Metodo personalizado
    public void saludoTecnico(){
        System.out.println("Saludo desde tecnico");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
