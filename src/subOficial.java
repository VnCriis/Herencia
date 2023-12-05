public class subOficial extends Oficial{
    public subOficial(String nombre, String codigo) {
        super(nombre, codigo);
    }
    public void saludosubOficial(){
        System.out.println("Saludo desde subOficial");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
