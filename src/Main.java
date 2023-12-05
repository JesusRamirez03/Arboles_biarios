import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ABB arbol = new ABB();

        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Borrar Arbol");
            System.out.println("2. Mostrar Arbol");
            System.out.println("3. Buscar");
            System.out.println("4. Insertar");
            System.out.println("5. Eliminar");
            System.out.println("6. Modificar");
            System.out.println("7. Creditos");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opcion:");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    arbol = new ABB();
                    System.out.println("Arbol inicializado");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Creditos");
                    System.out.println("Materia: Estructura de datos");
                    System.out.println("Equipo");
                    System.out.println("Jesus Alberto Ramirez Gonzallez || 22170147");
                    System.out.println("||");
                    break;
                case 8:
                    System.out.println("Programa concluido.");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}