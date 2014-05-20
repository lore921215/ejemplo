package datos;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

// *clase*
public class LeerArchivo {

	Contador contador;
	ArrayList<Parte> partes=new ArrayList<>();
	Parte parte;
	int tamañoTotal = 0;
	int numPartes=0;

	// *metodo*
	public LeerArchivo() {
		contador = new Contador();
	}
	// *finMetodo*

	// *metodo*
	public ArrayList<Parte> leerDatos(String ruta) {
		try {
			if(ruta!=null){
				
				//ArrayList<String>archivos=obtenerClase(ruta);
				
				//for (int i = 0; i < archivos.size(); i++) {
					
				//}
				File file2= new File(ruta);

				File files[]=file2.listFiles();
				
				for (int i = 0; i < files.length; i++) {
					
					boolean esParte=contador.esParte(files[i]);

					if(esParte==true){
					parte = new Parte();
					parte.setNombre(files[i].getName());
					parte.setNumeroItems(contador.contarMetodos(files[i]));
					parte.setTamañoParte(contador.TamañoParte(files[i]));
					tamañoTotal += contador.TamañoParte(files[i]);
					partes.add(parte);
				}
					}
	            return partes;

			}


		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null,"El directorio no existe");
		}
		return null;
	}
	// *finMetodo*
	
	

	// *metodo*
	public int getTamañoTotal() {
		return tamañoTotal;
	}
	// *finMetodo*

	// *metodo*
	public void setTamañoTotal(int tamañoTotal) {
		this.tamañoTotal = tamañoTotal;
	}
	// *finMetodo*
}
// *finClase*