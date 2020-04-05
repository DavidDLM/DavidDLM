import static org.junit.Assert.*;

import java.util.PriorityQueue;

/**
 * @author Mario de Leon
 *
 */

import org.junit.Test;

public class QueueTest {
	
	VectorHeap<Paciente> heapTest = new VectorHeap<Paciente>();
	PriorityQueue<Paciente> queueTest = new PriorityQueue<Paciente>();
	Paciente paciente1 = new Paciente();
	Paciente paciente2 = new Paciente();
	
	public QueueTest() {
		paciente1.setNombre("Leo");
		paciente1.setEnfermedad("fractura");
		paciente1.setClasificacion("A");
	
		paciente2.setNombre("Karla");
		paciente2.setEnfermedad("dolor");
		paciente2.setClasificacion("B");
		
		heapTest.add(paciente1);
		heapTest.add(paciente2);
		
		queueTest.add(paciente1);
		queueTest.add(paciente2);
		
	}
	
	
	@Test
	public void getFirstTest() {
		assertEquals("Leo", heapTest.getFirst().getNombre());
	}
	
	@Test
	public void getElementTest() {
		assertEquals("Leo", queueTest.element().getNombre());
	}
	
	@Test
	public void removeHeapTest() {
		heapTest.remove();
		assertEquals("Karla", heapTest.getFirst().getNombre());
	}
	
	@Test
	public void removeQueueTest() {
		queueTest.remove();
		assertEquals("Karla", queueTest.element().getNombre());
	}

}
