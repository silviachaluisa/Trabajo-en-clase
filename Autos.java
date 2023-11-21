public class Autos{
    //atributos
    public String Modelo;
    public String Año;
    public String Motor;
   
    //constructor
    public  Autos(String nuevomodelo){
        Modelo=nuevomodelo;
    }
    //Getters
    public String getModelo() {
        return Modelo;
    }

    public String getAño() {
        return Año;
    }

    public String getMotor() {
        return Motor;
    }
    //Setters
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setAño(String año) {
        Año = año;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }
}