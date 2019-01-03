
package barbershopprj;

import ec.edu.espe.barbershopproject.model.Customer;
import ec.edu.espe.barbershopproject.model.Bill;
import ec.edu.espe.barbershopproject.model.Location;
import ec.edu.espe.barbershopproject.model.Employee;
import java.util.Scanner;
import ec.edu.espe.barbershopproject.model.Service;
import ec.edu.espe.BarberShop.files.utils.FileManager;
import ec.edu.espe.barbershopproject.model.BarberShop;
import ec.edu.espe.barbershopproject.model.Distributor;
import ec.edu.espe.barbershopproject.model.Inventory;
import ec.edu.espe.barbershopproject.model.Owner;
import ec.edu.espe.barbershopproject.model.Product;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Bryan Zurita
 * @author Sebastian Zuñiga
 * @author Miquely Calvopiña
 */
public class BarberShopPrj 
{

    /**
     * @param args the command line arguments
     */
    private static Bill payment;
    private static Service services;
    private static Service offers;
    static Scanner input;
    private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException, Exception{
        
        FileManager file = new FileManager();
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        BarberShop barbershop = new BarberShop();
        Customer customer = new Customer();
        Service service = new Service("","",0);
        Inventory inventory = new Inventory();
        Bill bill = new Bill();
        Location location = new Location();
        Product product = new Product("","",0,0);
        Owner owner = new Owner();
        Distributor distributor=new Distributor();
        Console terminal = System.console();
        input=new Scanner(System.in); 
        
        int opc=0;
        int opc2=0;
        int opc3=0;
        int op4=0;
        int opcion;
        int opc5=0;
        int cont=0;
        boolean bandera=false,comprob=false;
        String nameFile;
        String pass;
        String clientFile;
        
            do
            {
                System.out.println("BIENVENIDO AL SISTEMA DE PELUQUERIA DE "+barbershop.fullName);
                System.out.println("1.Desea ingresar como dueño");
                System.out.println("2.Desea ingresar como empleado");
                System.out.println("0.Salir");
                int intent=3;
                do
                {
                    try
                    {
                        System.out.println("Eliga una opcion");
                        opc2 = Integer.parseInt(stdIn.readLine()); 
                        bandera=true;
                    } 
                     catch(NumberFormatException e)
                    {
                     System.out.println("Solo se permite el ingreso de numeros");
                     bandera=false;
                    }
                  }while(bandera != true);
                    
                    switch (opc2)
                    {
                        case 1:
                            /**
                             * This allows the entry of the password by console keeps secret
                             */
                           /* try
                            {
                                while(intent>=0 && comprob==false)
                                {

                                    System.out.println("Ingrese su contraseña:");
                                    pass = new String (terminal.readPassword("Password:"));
                                    BufferedReader br = new BufferedReader (new FileReader ("OwnerPassword.txt"));
                                    String password=br.readLine();
                                    comprob = password.equals(pass);
                                    intent=intent-1;
                                }
                            }
                            catch(NullPointerException e)
                            {
                                System.err.println("No puedo obtener la consola.");
                            }
                            */comprob=true;
                        if (comprob == true)
                        {
                                do
                                {
                                    System.out.println("\tMENU DEL ADMINISTRADOR");
                                    System.out.println("1. Control de empleados");
                                    System.out.println("2. Controlar servicios");
                                    System.out.println("3. Registrar inventario");
                                    System.out.println("4. Revisar inventario");
                                    System.out.println("5. Desea modificar la dirección");
                                    System.out.println("6. Desea verificar la dirección");
                                    System.out.println("7. Entrega de inventario");
                                    System.out.println("0.Salir");  
                                    
                                    do
                                    {
                                        try
                                        {
                                        System.out.println("Eliga una opción");
                                        opc3 = Integer.parseInt(stdIn.readLine()); 
                                        bandera=true;
                                        } 
                                        catch(NumberFormatException e)
                                        {
                                        System.out.println("Solo se permite el ingreso de números");
                                        bandera=false;
                                        }
                                    }while(bandera != true);
                                    
                                    switch (opc3)
                                    {
                                        case 1:
                                            do
                                            {
                                                System.out.println("\tCONTROL DE EMPLEADOS");
                                                System.out.println("1. Ingresar un nuevo empleado");
                                                System.out.println("2. Modificar empleado existente");
                                                System.out.println("3. Imprimir la lista de empleados");
                                                System.out.println("4. Controlar Asistencia");
                                                System.out.println("0. Regresar al menú de Administrador");
                                                
                                                do
                                                {
                                                    try
                                                    {
                                                        System.out.println("Eliga una opción");
                                                        op4 = Integer.parseInt(stdIn.readLine()); 
                                                        bandera=true;
                                                    } 
                                                        catch(NumberFormatException e)
                                                    {
                                                        System.out.println("Solo se permite el ingreso de números");
                                                        bandera=false;
                                                    }
                                                }while(bandera != true);
                                                
                                                switch (op4)
                                                {
                                                    case 1:
                                                        barbershop.newEmployee(employee);
                                                        break;
                                                    case 2:
                                                        System.out.print("Ingrese la persona a buscar y modificar: ");
                                                        String CI= scan.next();
                                                        barbershop.modifyEmployee(employee, CI);
                                                        break;
                                                    case 3:
                                                        barbershop.printEmployee();
                                                        break;
                                                    case 4:
                                                        employee.assist(employee);
                                                        break;
                                                    default:
                                                        if (op4 == 0){
                                                            System.out.println("-----");
                                                        }
                                                        else{
                                                            System.out.println("La opción que ingreso no es la correcta"); 
                                                        }
                                                        break;
                                                    
                                                        
                                                }
                                            }while (op4!=0);
                                         break;
                                        case 2:
                                            
                                            char opc6='s';
                                            int op5=0;
                                            
                                            do
                                            {
                                            System.out.println("\tMENU DE SERVICIOS");
                                            System.out.println("1. Ingresar nuevo servicio");
                                            System.out.println("2. Visualizar servicios existentes");
                                            System.out.println("0. Regresar al menu de administrador");
                                            
                                            do
                                            {
                                                try
                                                {
                                                    System.out.println("Eliga una opción");
                                                    op5 = Integer.parseInt(stdIn.readLine()); 
                                                    bandera=true;
                                                } 
                                                    catch(NumberFormatException e)
                                                {
                                                    System.out.println("Solo se permite el ingreso de números");
                                                    bandera=false;
                                                }
                                            }while(bandera != true);
                                            
                                            switch(op5){
                                                case 1:
                                                    
                                                    do{
                                                        barbershop.newService(service);
                                                        System.out.println("¿Desea ingresar otro servicio? s/n");
                                                        opc6= scan.next().toLowerCase().charAt(0);                         
                                                    }while (opc6!='n');

                                                        System.out.println("=============================================================================");
                                                        System.out.println("*===**===**===*SALIENDO DEL REGISTRO DE SERVICIOS*===**===**===*");
                                                        System.out.println("=============================================================================");
                                                        System.out.println("Los servicios se ha guardado de la siguiente manera:");
                                                        System.out.println("=============================================================================");
                                                        System.out.println("Código; Servicio; Precio");
                                                        System.out.println("=============================================================================");
                                                        ArrayList<Service> listS = new ArrayList<>();
                                                        //listS = file.loadService("Servicios", listS);/////////////////////////////////////////////////////

                                                        for (Service p : listS) {
                                                            System.out.println("" + p.toString(p));                                           
                                                        }
                                                        System.out.println("=============================================================================");
                                                 break;
                                        
                                                case 2:
                                                        barbershop.printService();
                                                    break;
                                                default:
                                                    if (op5 == 0){
                                                        System.out.println("-----");
                                                    }
                                                    else{
                                                        System.out.println("La opción que ingreso no es la correcta"); 
                                                    }
                                                    break;
                                                
                                            }
                                            }while(op5!=0);
                                        break;
                                            
                                        case 3:

                                            Scanner sc = new Scanner (System.in);
                                            FileManager f1=new FileManager();
                                            f1.createFile(new File("Inventory.csv"));
                                            int option='s';
                                            int op=0,i=0;
                                            String name;
                                            float cost;
                                            int quantity;       
                                            Collection <Product> listProduct;
	                                    listProduct = new ArrayList<>();  

                                            System.out.println("=============================================================================");
                                            System.out.println("*===**===**===*BIENVENIDO AL SISTEMA DE INVETARIO*===**===**===*"); 
                                            System.out.println("=============================================================================");
                                            do
                                            {
                                              product=inventory.registerProduct();                                                                                                         
                                              listProduct.add(product);

                                              System.out.println("\n¿Desea ingresar otro producto? s/n");
                                              option = sc.next().toLowerCase().charAt(0);
                                            }while (option != 'n');

                                              System.out.println("=============================================================================");
                                              System.out.println("*===**===**===*SALIENDO DEL REGISTRO DE INVENTARIO*===**===**===*");
                                              System.out.println("=============================================================================");
                                              System.out.println("El inventario se ha guardado de la siguiente manera:");
                                              System.out.println("=============================================================================");
                                              System.out.println("Código; Nombre; Cantidad; Precio");
                                              System.out.println("=============================================================================");
                                             
                                              for(Product p: listProduct){   
                                                  FileManager.writeFile(new File("Inventory"),p.toString(p));                                        
                                              }
                                              file.showContent("Inventory.csv");
                                              sc.nextLine();
                                              sc.nextLine();
                                            break;
                                        case 4:
                                            inventory.printInventory();
                                            break;
                                        case 5:
                                            owner.newLocation(location);
                                        break;
                                        case 6:
                                            owner.printLocation();
                                        break;
                                        case 7:
                                           if(distributor.deliverOrder()==true) 
                                            System.out.println("La entrega se realizara el dia de hoy");
                                           else
                                            System.out.println("La entrega se realizan los dias Miercoles");
                                        default:
                                            if (opc3 == 0){
                                                System.out.println("-----");
                                            }
                                            else{
                                                System.out.println("La opción que ingreso no es la correcta"); 
                                            }
                                    }
                                }while(opc3 != 0);
                            }
                            else
                            {
                                System.out.println("La contaseña ingresada es incorrecta");
                        }
                        break;
                        case 2:    
                        do 
                        {
                            System.out.println("\tMENU DEL EMPLEADO");
                            System.out.println("1.Desea ingresar información de un nuevo cliente");
                            System.out.println("2.Desea modificar información de un cliente");
                            System.out.println("3.Imprimir la lista de clientes");
                            System.out.println("4.Desea imprimir una factura");
                            System.out.println("0.Salir");
                            do
                            {
                                try
                                {
                                    System.out.println("Eliga una opción");
                                    opc = Integer.parseInt(stdIn.readLine()); 
                                    bandera=true;
                                } 
                                catch(NumberFormatException e)
                                {
                                    System.out.println("Solo se permite el ingreso de números");
                                    bandera=false;
                                }
                            }while(bandera != true);
                            
                            switch (opc)
                            {
                                case 1:
                                    barbershop.newCustomer(customer);
                                break;
                                case 2: 
                                    System.out.print("Ingrese la persona a buscar y modificar: ");
                                    String CI= scan.next();
                                    barbershop.modifyCostumer(customer, CI);
                                break;
                                case 3: 
                                    barbershop.printCustomer();
                                break;
                                case 4:
                                    bill.makeBill(employee, customer, service);
                                break;
                                default:
                                if (opc == 0)
                                {
                                    System.out.println("-----");
                                }
                                else
                                {
                                    System.out.println("La opción que ingreso no es la correcta"); 
                                }
                                break;
                            }
                        }while(opc != 0);
                        break;
                        default:
                         if (opc2 == 0)
                         {
                            System.out.println("Gracias por utilizar nuestro sistema");
                         }
                         else
                         {
                            System.out.println("La opción que ingreso no es la correcta"); 
                         }
                        break;
                    }
            }while (opc2 != 0);
    }
}
