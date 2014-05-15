package datos;


import interfaz.Program1;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


	public class LeerArchivo {
		
		
 
		public Lista lista=new Lista(0);
	    Calcular calcular=new Calcular();
	   
	    File file;
	    
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
				 LeerArchivo inst = new LeerArchivo();
					
				}
			});
		}
		public LeerArchivo(){
			
		Lista list=leerDatos();
		double media=calcular.calcularMedia(list);
		double desv=calcular.calcularDesviacion(list);
		  String nl = System.getProperty("line.separator");

		JOptionPane.showMessageDialog(null,"Desviaci�n:"+""+desv+" "+nl+ "Media:"+" "+media);
		
		
		
		}
		
	   public Lista leerDatos() {
		   
		  JFileChooser jFileChooser1=new  JFileChooser();
		  jFileChooser1.showOpenDialog(null);
		  file=jFileChooser1.getSelectedFile();
	      
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	 
	      try {
	  
	         fr = new FileReader (file);
	         br = new BufferedReader(fr);
	 
	       
	         String linea;
	         while((linea=br.readLine())!=null){
	        		 Nodo primero=new Nodo(Double.parseDouble(linea));
	        		 lista.anadirNodo(primero);

	         }
	         return lista;
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	      	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return null;
	   }}
	


