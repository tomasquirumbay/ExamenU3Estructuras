package grafo.aydacencia;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número máximo de vértices en el grafo: ");
    int maxVertices = scanner.nextInt();
    GrafoAdcia grafo = new GrafoAdcia(maxVertices);

    boolean salir = false;
   
    while (!salir) {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar vértice");
        System.out.println("2. Realizar recorrido en profundidad");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre de la ciudad: ");
                String nombreCiudad = scanner.next();
                VerticeAdy vertice = new VerticeAdy(nombreCiudad);
                grafo.agregarVertice(vertice);
                System.out.println("Vértice agregado: " + vertice.toString());
                break;


            case 2:
                System.out.print("Ingrese el vértice de inicio para el recorrido: ");
                int verticeInicio = scanner.nextInt();
                DFS dfs = new DFS(grafo);
                dfs.recorridoProfundidad(verticeInicio);
                break;

            case 3:
                salir = true;
                break;

            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
    }

    System.out.println("¡Hasta luego!");
    scanner.close();
	}
}