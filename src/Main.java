public class Main{
    public static void main (String [] args){
        Empleado E1 = new Empleado("Pedro","0001");
        Operario O1 = new Operario("Jose","002");
        Directivo D1 = new Directivo("Andrea","003");
        O1.saludoOperario();
        O1.saludo();
        D1.saludoDirectivo();
        D1.saludo();
    }
}