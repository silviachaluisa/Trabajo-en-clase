public class Autos{
    //atributos
    public String Chevrolet;
    public String Nissan;
    public String Toyota;
   
    public String modelo;
    public String color;
    public String marca;
    public int año;


    //constructor
    public  Autos(String nuevoNombre){
        nombre=nuevoNombre;
    }

    //metodos
    public String getautor(){
        return  autor;
    }
    public  String getgenero(){
        return genero;
    }

    public  String getestilo(){
        return estilo;
    }
    public String getcantante(){
        return cantante;
    }
    public String getnombre(){
        return nombre;
    }

    //Setters
    public void setautor(String newautor){
        this.autor=newautor;
    }
    public  void setgenero(String newgenero){
        this.genero=newgenero;
    }
    public  void setestilo(String newestilo){
        this.estilo=newestilo;
    }
    public void setcantante(String newcantante){
        this.cantante=cantante;
    }


}