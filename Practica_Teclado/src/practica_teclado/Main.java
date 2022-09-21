package practica_teclado;

public class Main {

    public static void main(String[] args) {
        
        String Nombre ;
        int Edad;
        
        System.out.print("Dime tu Nombre: ");
        Nombre = Teclado.LeeCadena();
        
        System.out.print( "Dime tu Edad: ");
        Edad = Teclado.LeeEntero();
        
        System.out.println( "Hola " + Nombre + ", tienes " + Edad + " años");
    }
    
}
