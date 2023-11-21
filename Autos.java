public class Autos{
    //atributos
    public String Modelo;
    public String Año;
    public String Motor;
   
<<<<<<< HEAD
    public String modelo;
    public String color;
    public String marca;
    public int año;


=======
>>>>>>> 04e86a74334ebe53b08f2857ee5a5f912b520ff4
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