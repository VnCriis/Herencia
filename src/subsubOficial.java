public class subsubOficial extends subOficial{
    public subsubOficial(String nombre, String codigo) {
        super(nombre, codigo);
    }
    public void saludosubsubOficial(){
        System.out.println("Saludo desde subsubOficial");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
