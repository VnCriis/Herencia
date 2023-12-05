public class Operario extends  Empleado{
    String apodo;

    public Operario(String nombre, String codigo) {
        super(nombre, codigo);
    }

    public Operario(String nombre, String codigo, String apodo) {
        super(nombre, codigo);
        this.apodo = apodo;
    }

    //Metodo personalizado
    public void saludoOperario(){
        System.out.println("Saludo desde operario");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
        System.out.println("Mi apodo es:");
        System.out.println((this.getApodo()));
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public void imprimirApodo(){
        System.out.println(this.apodo);
    }
}
