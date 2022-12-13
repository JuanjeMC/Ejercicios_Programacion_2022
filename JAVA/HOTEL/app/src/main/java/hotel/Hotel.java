package hotel;

import java.util.ArrayList;

public class Hotel{

    //Atributos del hotel
    private String name;
    private String descripcion;
    private String address;
    private String phone;
    private String email;


    ArrayList<Client> clients;
    //Arraylist de la clase cliente para guardar los clientes del hotel.

    //Constructor del hotel
    public Hotel(){
        this.name = "Watermelon Hotel";
        this.descripcion = "The best hotel in the world";
        this.address = "Calle de la piruleta, 69";
        this.phone = "666 666 666";
        this.email = "email";
        this.clients = new ArrayList<Client>();
        //Inicializar el arraylist de clientes.

    }
    //Mostrar cliente.

    public void showClients(){ 
        //Método para mostrar los clientes.

        for (int i = 0; i < clients.size(); i++){ 
            //Bucle para recorrer el arraylist de clientes de la clase hotel.

            System.out.println(clients.get(i).getClient()); 
            //Mostrar el arraylist de clientes, que está en la clase cliente (método getClient).
        }
    }
    //Quitar cliente.

    public void quitClient(String dni){ 
        //Método para quitar un cliente del arraylist de clientes.

        for (int i = 0; i < clients.size(); i++){ 
            //Bucle para recorrer el arraylist de clientes.

            if (clients.get(i).getDNI().equals(dni)){ 
                //Si el DNI del cliente es igual al DNI que se pasa por parámetro...

                clients.remove(i); 
                //Quitar el cliente del arraylist.
            }
        }
    }

    //Promoción para los clientes menores de 30 años, y mayores de 18 años.
    public void promotion(){ 
        for (int i = 0; i < clients.size(); i++){ 
            //Bucle para recorrer el arraylist de clientes
            
            if (Integer.parseInt(clients.get(i).getClient().get(6)) < 30 && Integer.parseInt(clients.get(i).getClient().get(6)) > 18){ 
                //Si la edad del cliente es menor de 30 y mayor de 18...

                System.out.println("The client " + clients.get(i).getClient().get(1) + " " + clients.get(i).getClient().get(2) + " has a 10% discount"); 
                //Mostrar el nombre y el apellido del cliente, y el descuento.
            }
        }
    }
    


    //Añadir un nuevo cliente
    public void addClient(String DNI, String name, String lastName, String adress, String email, String phone, String age, String bornYear){ 
        //Método para añadir un nuevo cliente al arraylist de clientes de la clase hotel.

        Client client = new Client(DNI, name, lastName, adress, email, phone, age, bornYear);
        //Crear un nuevo cliente con los datos que se pasan por parámetro.

        clients.add(client);
        //Añadir el cliente al arraylist de clientes de la clase hotel.
    }
    //Método para mostrar la información del hotel
    public void showHotelInfo(){
        System.out.println("Hotel name: " + this.name);
        System.out.println("Hotel description: " + this.descripcion);
        System.out.println("Hotel address: " + this.address);
        System.out.println("Hotel phone: " + this.phone);
        System.out.println("Hotel email: " + this.email);
    }
    




}
