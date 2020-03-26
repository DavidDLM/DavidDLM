import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author Usuario Dell
 *
 */
public class HeapFactory<E> {
	 public Object getQueue(String tipoQueue){
	      if(tipoQueue == null){
	         return null;
	      }		
	      if(tipoQueue.equalsIgnoreCase("VectorHeap")){
	         return new VectorHeap<String>();
	         
	      } else if(tipoQueue.equalsIgnoreCase("JCF")){
	    	  return new PriorityQueue<String>();
	      }else {
	    	  System.out.println("Ha ocurrido un error inesperado");
	    	  return null;
	      }
	   }
}
