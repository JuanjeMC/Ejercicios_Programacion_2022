package hotel;

import java.util.ArrayList;

public class Client{
    //Atributos del cliente.
    private String DNI;
    private String name;
    private String lastName;
    private String adress;
    private String email;
    private String phone;
    private String age;
    private String bornYear;


    //Constructor.
    public Client(String DNI, String name, String lastName, String adress, String email, String phone, String age, String bornYear){
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.bornYear = bornYear;
    }

    //Arraylist de la clase cliente.
    public ArrayList<String> getClient() { 
        //Método para mostrar los datos del cliente
        //en el arraylist de la clase hotel.

        ArrayList<String> elements = new ArrayList<String>(); 
        //Arraylist de la clase cliente para guardar los datos del cliente 
        //y mostrarlos en el método showClients de la clase hotel.

        elements.add(DNI); 
        //Añadir los datos del cliente al arraylist de la clase cliente.
        //para mostrarlos en el método showClients de la clase hotel.

        elements.add(name); 
        elements.add(lastName);
        elements.add(adress);
        elements.add(email);
        elements.add(phone);
        elements.add(age);
        elements.add(bornYear);


        return elements; 
        //Devolver el arraylist con los datos del cliente.
    }

    //Getters
    public String getDNI(){
        return this.DNI;
    }

}