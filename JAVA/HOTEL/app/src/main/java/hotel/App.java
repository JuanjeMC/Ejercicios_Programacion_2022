/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hotel;
import java.util.Scanner;


public class App {
//Create a main method
    public static void main(String[] args) {

        //Variables para el cliente.
        String dni, name, lastName, adress, email, phone, age, bornYear;

        //Crear scanner para leer los datos del cliente.
        Scanner teclado = new Scanner(System.in);

        int select;

        //Create a hotel object
        Hotel hotel = new Hotel();   

        System.out.println("Welcome to Watermelon Gestor 1.0");
        //Create menu for the hotel manager.
        do{
            System.out.println("Select an option: ");
            System.out.println("1. Add a new client");
            System.out.println("2. Show all clients");
            System.out.println("3. Delete a client");
            System.out.println("4. Create a promotion");
            System.out.println("5. Show Hotel info");
            System.out.println("6. Close the program");

            select = teclado.nextInt();

            if (select == 1){
                System.out.println("Add DNI of the client: ");
                dni = teclado.next();
                System.out.println("Add name of the client: ");
                name = teclado.next();
                System.out.println("Add last name of the client: ");
                lastName = teclado.next();
                System.out.println("Add adress of the client: ");
                adress = teclado.next();
                System.out.println("Add email of the client: ");
                email = teclado.next();
                System.out.println("Add phone of the client: ");
                phone = teclado.next();
                System.out.println("Add age of the client: ");
                age = teclado.next();
                System.out.println("Add born year of the client: ");
                bornYear = teclado.next();
                //Añadir el cliente.
                hotel.addClient(dni, name, lastName, adress, email, phone, age, bornYear);
                System.out.println("Client added");
            }else if (select == 2){
                //Mostrar los clientes.
                hotel.showClients();

            }else if (select == 3){
                //Quitar cliente.
                System.out.println("Add DNI of the client: ");
                dni = teclado.next();
                hotel.quitClient(dni); 
                //Quitar el cliente con el DNI que se ha introducido.

            }else if (select == 5){
                //Show hotel info
                hotel.showHotelInfo();
            }else if (select == 4){
                //Promoción basada en la edad del cliente.
                hotel.promotion();
                
            }


        }while(select != 6);
    }
}


















