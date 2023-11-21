import java.util.Scanner;
//Comentario de prueba
public class main {
    public static void main(String[] args)
    {   
        String modelo;
        Scanner entrada=new Scanner(System.in);
        Autos autos1=new Autos("Chevrolet");
        //System.out.println("Modelo del carro "+autos1.getModelo());
        System.out.println("Ingresa la modelo de tu vehiculo:");
        modelo=entrada.nextLine();
        autos1.setModelo(modelo);
        System.out.println("Ingresa el color de tu vehiculo:");
        String color=entrada.nextLine();
        autos1.setColor(color);
        System.out.println("Ingresa el anio de tu vehiculo:");
        int anio=entrada.nextInt();
        autos1.setAño(anio);
        autos1.valores();
    }
}
