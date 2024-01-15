


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("******* BIENVENIDO A HELADOS FROZEN ************ \n");

        Scanner leerDato = new Scanner(System.in) ;


          int cantHeladosVendidos;
          int simple = 1;
          int doble = 2;
          int especial = 3;
          int opcion;
          int precioSimple = 4000;
          int precioDoble = 7000;
          int precioEspecial = 12000;
          int totalVendido;
        String nombreCliente;


        System.out.print("Ingresa tu nombre por favor: ");
        nombreCliente = leerDato.nextLine();

        System.out.println("\nBienvenid@ "+ nombreCliente + " Elige la opcion para ver la cantidad vendida:\n");

        System.out.println(" 1.Helado Simple. \n 2.Helado Doble \n 3.Helado Especial.\n");
        opcion = leerDato.nextInt();


        if(opcion == 1){

            System.out.println("***** Has elegido Helado Simple *****\n");

            System.out.println("Cuantos helados se vendieron: ");
           int cantSimple = leerDato.nextInt();

           totalVendido = cantSimple * precioSimple;

            System.out.print("La cantidad de helados vendidas es "+ cantSimple + " en total es: $ "+ totalVendido );


        }else if(opcion == 2){

            System.out.println("***** Has elegido Helado Doble *****\n");
            System.out.println("Cuantos helados se vendieron: ");
            int cantDoble = leerDato.nextInt();

            totalVendido = cantDoble * precioSimple;

            System.out.print("La cantidad de helados vendidas es "+ cantDoble + " en total es $ "+ totalVendido );


        }else{

            System.out.println("***** Has elegido Helado Especial *****\n");
            System.out.println("Cuantos helados se vendieron: ");
            int cantEspecial = leerDato.nextInt();

            totalVendido = cantEspecial * precioSimple;

            System.out.print("La cantidad de helados vendidas es "+ cantEspecial + " en total es $ "+ totalVendido );


        }




    }
}