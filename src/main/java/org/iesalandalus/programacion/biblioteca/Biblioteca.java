package org.iesalandalus.programacion.biblioteca;

import org.iesalandalus.programacion.biblioteca.mvc.controlador.Controlador;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.Modelo;
import org.iesalandalus.programacion.biblioteca.mvc.vista.FactoriaVista;

public class Biblioteca {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		FactoriaVista vista = new FactoriaVista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
	}

}
