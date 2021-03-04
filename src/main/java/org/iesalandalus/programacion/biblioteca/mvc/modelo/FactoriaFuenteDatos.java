/**
 * 
 */
package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;

/**
 * @author Juanjo
 *
 */
public enum FactoriaFuenteDatos {
	
	MEMORIA {
		@Override
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosMemoria();
		}
	};

	
	FactoriaFuenteDatos() {
		
	}
	
	public abstract IFuenteDatos crear();
	
	
}