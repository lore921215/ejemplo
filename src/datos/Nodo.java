package datos;

public class Nodo {
	
 public Nodo siguiente;
 public double valor;
 
public Nodo(double valor) {
	
	this.valor = valor;
}

public Nodo getSiguiente() {
	return siguiente;
}

public void setSiguiente(Nodo siguiente) {
	this.siguiente = siguiente;
}


public double getValor() {
	return valor;
}

public void setValor(float valor) {
	this.valor = valor;
}


 
 
}
