package datos;
//*clase*
public class Lista {

	public Nodo primero=null;
	public Nodo ultimo=null;
	public int tamano=0;
	
	public Lista(int tamano) {
	
		this.tamano = tamano;
	}
	public int getTamano(){
		return tamano;
	}
	public Nodo getPrimero() {
		return primero;
	}
	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}
	public Nodo getUltimo() {
		return ultimo;
	}
	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}
	
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
      public void anadirNodo(Nodo nuevo){
   	 if(primero==null){
   		 
		primero=nuevo;
		primero.setSiguiente(null);
		ultimo=primero;
		tamano++;
   	 }else{
   		 ultimo.setSiguiente(nuevo);
   		 ultimo=nuevo;
   		 nuevo.setSiguiente(null);
   		 tamano++;
   	 }
   	 setTamano(tamano);
	}
	public void eliminarNodo(Nodo nodo){
		Nodo aux=nodo.getSiguiente();
		
		
		
		
	}
	
	
	
}
