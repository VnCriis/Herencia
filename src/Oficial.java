public class Oficial extends Operario{
    public Oficial(String nombre, String codigo) {
        super(nombre, codigo);
    }
    //Metodo personalizado
    public void saludoOficial(){
        System.out.println("Saludo desde oficial");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
