/*Refactoriza la clase Vista, renombrándola, 
 *extrayendo su interfaz y colocando las clases y la interfaz en los paquetes adecuados. Realiza un commit.*/

package org.iesalandalus.programacion.biblioteca.mvc.vista;

import org.iesalandalus.programacion.biblioteca.mvc.vista.texto.VistaTexto;

public enum FactoriaVista {
	
	TEXTO{
		
		@Override
		public IVista crear () {
			return new VistaTexto();
		}
	};
	
	FactoriaVista() {
	
	}
	
	public abstract IVista crear ();
}