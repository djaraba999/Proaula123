import java.util.Scanner;

public class Proyectodeaula {

    public static void main(String[] args){
      
             
    Scanner entrada = new Scanner(System.in);
    int[] productos = new int[5];

    productos[0] = 10;
    productos[1] = 10;
    productos[2] = 10;
    productos[3] = 10;
    productos[4] = 10;


    System.out.println("SELECCIONE SU TIPO DE USUSARIO");
    System.out.println("1 ADMINISTRADOR");
    System.out.println("2 EMPLEADO");
    System.out.println("3 CLIENTE");
    
    int tipo = entrada.nextInt();


    switch (tipo) {

        case 1:

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("MENU");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Eliminar productos");
            System.out.println("3. Ingresar y/o eliminar empleados");
            System.out.println("4. Regresar");

            System.out.println("Digite una opcion");
            int opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("1. hi");
                System.out.println("1. hi");
                System.out.println("1. hi");
                System.out.println("1. hi");
                
                    break;
                case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("1. hi");
                    break;
                case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("hi");
                    break;
                 case 4:
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.println("nose");
                    break;
                default:
                System.out.println("No se que poner aqui");
                    break;
            

        }
        
            break;
        case 2:
            System.out.print("\033[H\033[2J");
             System.out.flush();
             System.out.println("MENU");
             System.out.println("1. Registrarse");
             System.out.println("2. vender");
            break;

        case 3:  
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("MENU");
            System.out.println("1. Seleccione producto");
            System.out.println("Digite una opcion");

            int op = entrada.nextInt();

            switch (op) {
                case 1:
                    for(int i=0; i<5; i++){
                        System.out.println(productos[i]);

                    }
                    break;
            
                default:
                System.out.println("No se que poner aqui");
                    break;
            }

            break;           
    
        default:
            System.out.println("Seleccione una opcion (please)");
            break;
    }
        
    }
  
}