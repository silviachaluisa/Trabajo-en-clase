public class Autos{
    //atributos
    public String Modelo;
    public int Año;
    public String Motor;
    public String color;
   
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

    public String getMotor() {
        return Motor;
    }
    //Setters
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setAño(int año) {
        Año = año;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }
}