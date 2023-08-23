package grafo.aydacencia;

public class DFS {
	private boolean[] visitados;
	private GrafoAdcia grafo;

	public DFS(GrafoAdcia grafo) {
		this.grafo = grafo;
		visitados = new boolean[grafo.maxVerts];
	}

	public void recorridoProfundidad(int vertice) {
		visitados[vertice] = true;
		System.out.print(grafo.tablAdc[vertice].nombreCiudad + " ");

		for (Arco arco : grafo.tablAdc[vertice].lad) {
			if (!visitados[arco.destino]) {
				recorridoProfundidad(arco.destino);
			}
		}
	}

	public void iniciarRecorrido() {
		for (int i = 0; i < grafo.numVerts; i++) {
			if (!visitados[i]) {
				recorridoProfundidad(i);
			}
		}
	}
}


