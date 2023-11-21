public class Autos{
    //atributos
    public String Modelo;
    public int Año;
    public String Color;

    //constructor
    public  Autos(String nuevomodelo){
        Modelo=nuevomodelo;
    }
    //Getters
    public String getModelo() {
        return Modelo;
    }

    public int getAño() {
        return Año;
    }

    public String getColor() {
        return Color;
    }
    //Setters
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setAño(int año) {
        Año = año;
    }

    public void setColor(String color) {
        Color = color;
    }

    // Imprimir todos los valores
    public void valores()
    {
        System.out.println("El modelo del auto es "+this.getModelo());
        System.out.println("Es del año "+this.getAño());
        System.out.println("Y es de color "+this.getColor());
    }
    
}