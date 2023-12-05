public class Main{
    public static void main (String [] args){
        Empleado E1 = new Empleado("Pedro","0001");
        Operario O1 = new Operario("Jose","002");

        Directivo D1 = new Directivo("Andrea","003");
        Oficial Of1 = new Oficial("Ana","004");
        Tecnico T1 = new Tecnico("Darwin","005");
        subDirectivo sD1= new  subDirectivo("Carlos","006");
        subOficial sO1= new subOficial("Karla","007");
        subsubOficial ssO1= new subsubOficial("Sandra","008");
        O1.saludoOperario();
        O1.saludo();
        D1.saludoDirectivo();
        D1.saludo();
        Of1.saludoOficial();
        Of1.saludo();
        T1.saludoTecnico();
        T1.saludo();
        sD1.saludosubDirectivo();
        sD1.saludo();
        sO1.saludoOficial();
        sO1.saludo();
        ssO1.saludosubsubOficial();
        ssO1.saludo();
    }
}