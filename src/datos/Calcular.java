package datos;

import javax.swing.SwingUtilities;
//*clase*
public class Calcular {
	double media=0;
	int tamano=0;
	double xi=0;
	double resulP=0;
	double resulFinal=0;
//}
//*finClase*

	public double calcularMedia(Lista lista){
	
	tamano=lista.getTamano();
	
	Nodo aux=lista.getPrimero();
	if(aux!=null){
	while(aux.getSiguiente()!=null){
		 media+=aux.getValor();
		 aux=aux.getSiguiente();
	}
	media+=aux.getValor();
	}
	return media=media/tamano;
	
	}
//*metodo*
	
  //*finMetodo  
}
