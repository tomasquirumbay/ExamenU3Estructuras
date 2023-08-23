package grafo.aydacencia;

import java.util.ArrayList;
import java.util.Stack;

public class GrafoAdcia {
	
	int numVerts;
	static int maxVerts = 20;
	VerticeAdy[] tablAdc;

	public GrafoAdcia(int mx) {
		tablAdc = new VerticeAdy[mx];
		numVerts = 0;
		maxVerts = mx;
	}

	// Agregar la m�todo que permite agregar un nuevo v�rtice
	/*
	 * A�ade un nuevo v�rtice a la lista directorio. Si el v�rtice ya est� en la
	 * tabla no hace nada, devuelve control; si es nuevo, se asigna a continuaci�n
	 * del �ltimo.
	 */

	public void agregarVertice(VerticeAdy vertice) {
		if (numVerts < maxVerts) {
			tablAdc[numVerts++] = vertice;
		}
	}

	// Agregar m�todo que permite agregar un nuevo arco
	/*
	 * Esta operaci�n da entrada a un arco del grafo. El m�todo tiene como entrada
	 * el v�rtice origen y el v�rtice destino. El m�todo adyacente() determina si la
	 * arista ya est� en la lista de adyacencia, y, por �ltimo, el Arco se inserta
	 * en la lista de adyacencia del nodo origen. La inserci�n se hace como primer
	 * nodo para que el tiempo sea constante, O(1). Otra versi�n del m�todo recibe,
	 * directamente, los n�meros de v�rtices que forman los extremos del arco. ara
	 * a�adir una arista en un grafo valorado, se debe asignar el factor de peso al
	 * crear el Arco.
	 */

	public void agregarArco(int origen, int destino, double peso) {
		if (origen >= 0 && origen < numVerts && destino >= 0 && destino < numVerts) {
			Arco nuevoArco = new Arco(destino, peso);
			tablAdc[origen].lad.add(nuevoArco);
		}
	}

	// Agregar un m�todo que determina si dos v�rtices son adyacentes
	/*
	 * La operaci�n determina si dos v�rtices, v1 y v2, forman un arco. En
	 * definitiva, si el v�rtice v2 est� en la lista de adyacencia de v1. El m�todo
	 * buscarLista() devuelve la direcci�n del nodo que contiene al arco, si no est�
	 * devuelve null.
	 */

	public boolean sonAdyacentes(int v1, int v2) {
		if (v1 >= 0 && v1 < numVerts && v2 >= 0 && v2 < numVerts) {
			for (Arco arco : tablAdc[v1].lad) {
				if (arco.destino == v2) {
					return true;
				}
			}
		}
		return false;
	}
}
