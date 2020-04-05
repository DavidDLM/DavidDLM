import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario de Leon
 * @version 04/04/2020
 */
public class Hospital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = (new File("")).getAbsolutePath()+File.separator+"src"+File.separator+"pacientes.txt";
		//System.out.println("path: "+path);
		
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      System.out.println("***Hospital virtual***");
	      
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (path);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	           
	         System.out.println("Metodo a proceder:\n1.VectorHeap(PQueueImpletentation) \n2.PriorityQueue(JavaCollectionsFramework) ");
	         Scanner scan = new Scanner(System.in);  
	         String metodo = scan.nextLine();
	         
	         if(metodo.equals("1")) {
	        	 
	        	 VectorHeap<Paciente> heapPacientes = new VectorHeap<Paciente>();
	        	 	        	 
	        	 String linea;
	        	 while((linea=br.readLine())!=null) {
	        		 String partes[] = linea.split(",",3);
	        		 Paciente paciente = new Paciente();
	        		 if(partes.length >= 3) {
	        			 String k = partes[0];
	        			 //k = k.replaceFirst("\\p{P}","");
	        			 //k = k.replaceFirst(" ","");
	        			 paciente.setNombre(k);
	        			 //System.out.println(k);
	        			 
	        			 String v = partes[1];
	        			 //v = v.replaceFirst("\\p{P}","");
	        			 v = v.replaceFirst(" ","");
	        			 paciente.setEnfermedad(v);
	        			 //System.out.println(v);
	        			 
	        			 String w = partes[2];
	        			 //w = w.replaceFirst("\\p{P}","");
	        			 w = w.replaceFirst(" ","");
	        			 paciente.setClasificacion(w);
	        			 //System.out.println(w);
	        			 
	        			 heapPacientes.add(paciente);
	        		
			        	}
	        	 }
	        	 
	        	 int contador = heapPacientes.size();	        	 
	        	
	        	 while(contador > 0) {
	        		 System.out.println("En proceso: ");
	        		 System.out.println("");
	        		 System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
	        		 System.out.println("");
	        		 System.out.println("Ahora: **** " + heapPacientes.getFirst().getNombre() + " *****");
	        		 System.out.println("Enfermedad/Estado: **** " + heapPacientes.getFirst().getEnfermedad() + " *****");
	        		 System.out.println("Prioridad: **** " + heapPacientes.getFirst().getClasificacion() + " *****");
	        		 System.out.println("");
	        		 System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
	        		 
	        		 Scanner s = new Scanner(System.in);
	        		 System.out.println("\nAtender paciente siguiente? s/n");
	        		 String ss = s.nextLine();
	        		 if(ss.equals("s")) {
	        			 heapPacientes.remove();
	        			 contador = contador-1;	        			 
	        		 }else if(ss.equals("n")) {
	        			 System.out.println("Aun no se procedera al siguiente paciente.");
	        		 }else {
	        			 System.out.println("Opcion no valida.");
	        		 }
	        		
	        	 
	        	 }
	        	
	        	 System.out.println("---- Lista de pacientes terminada. Todos han sido atendidos. ----");
	        	 
	         }else if(metodo.equals("2")) {
	        	 
	        	 PriorityQueue<Paciente> queuePacientes = new PriorityQueue<Paciente>();
	        	 
	        	 String linea;
	        	 while((linea=br.readLine())!=null) {
	        		 String partes[] = linea.split(",",3);
	        		 Paciente paciente = new Paciente();
	        		 if(partes.length >= 3) {
	        			 String k = partes[0];
	        			 //k = k.replaceFirst("\\p{P}","");
	        			 //k = k.replaceFirst(" ","");
	        			 paciente.setNombre(k);
	        			 //System.out.println(k);
	        			 
	        			 String v = partes[1];
	        			 //v = v.replaceFirst("\\p{P}","");
	        			 v = v.replaceFirst(" ","");
	        			 paciente.setEnfermedad(v);
	        			 //System.out.println(v);
	        			 
	        			 String w = partes[2];
	        			 //w = w.replaceFirst("\\p{P}","");
	        			 w = w.replaceFirst(" ","");
	        			 paciente.setClasificacion(w);
	        			 //System.out.println(w);
	        			 
	        			 queuePacientes.add(paciente);
	        		
			        	}
	        	 }
	        	 
	        	 int contador = queuePacientes.size();	        	 
		        	
	        	 while(contador > 0) {
	        		 System.out.println("En proceso: ");
	        		 System.out.println("");
	        		 System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
	        		 System.out.println("");
	        		 System.out.println("Ahora: **** " + queuePacientes.element().getNombre() + " *****");
	        		 System.out.println("Enfermedad/Estado: **** " + queuePacientes.element().getEnfermedad() + " *****");
	        		 System.out.println("Prioridad: **** " + queuePacientes.element().getClasificacion() + " *****");
	        		 System.out.println("");
	        		 System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
	        		 
	        		 Scanner s = new Scanner(System.in);
	        		 System.out.println("\nAtender paciente siguiente? s/n");
	        		 String ss = s.nextLine();
	        		 if(ss.equals("s")) {
	        			 queuePacientes.remove();
	        			 contador = contador-1;	        			 
	        		 }else if(ss.equals("n")) {
	        			 System.out.println("Aun no se procedera al siguiente paciente.");
	        		 }else {
	        			 System.out.println("Opcion no valida.");
	        		 }
	        	 
	        	 }
	        	 
	        	 System.out.println("---- Lista de pacientes terminada. Todos han sido atendidos. ----");
	        	 
	        	 
	         }else {
	        	 System.out.println("Opcion invalida");
	         }
	         
	         
	         
	      }catch(Exception e){
	    	 System.out.println("Ha ocurrido un error. Verifique que el archivo con datos de pacientes exista y/o que no este vacio.");
	         //e.printStackTrace();
	         
	         
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}

}
