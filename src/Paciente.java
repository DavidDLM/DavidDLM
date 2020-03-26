/**
 * 
 */

/**
 * @author Usuario Dell
 *
 */
public class Paciente implements Comparable<Paciente> {
	public String nombre;
	public String enfermedad;
	public String clasificacion;
	
	public Paciente(){
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the enfermedad
	 */
	public String getEnfermedad() {
		return enfermedad;
	}

	/**
	 * @param enfermedad the enfermedad to set
	 */
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	/**
	 * @return the clasificacion
	 */
	public String getClasificacion() {
		return clasificacion;
	}

	/**
	 * @param clasificacion the clasificacion to set
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return this.getClasificacion().compareTo(o.getClasificacion());
	}
	
}

