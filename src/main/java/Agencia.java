package AeropuertoAyudantia;

import java.util.*;

public class Agencia {

	private Collection<Agente> agentes;
	private Collection<Cliente> clientes;
	private string nombre;

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param nombre
	 * @param identificacion
	 */
	public Agente añadirVendedor(string nombre, int identificacion) {
		// TODO - implement Agencia.añadirVendedor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param identificacion
	 */
	public Agente buscarVendedor(int identificacion) {
		// TODO - implement Agencia.buscarVendedor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param identificacion
	 */
	public Vendedor eliminarVendedor(int identificacion) {
		// TODO - implement Agencia.eliminarVendedor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param identificacion
	 * @param origen
	 * @param destino
	 * @param precioPagar
	 */
	public boolean generarVenta(string nombre, int identificacion, string origen, string destino, int precioPagar) {
		// TODO - implement Agencia.generarVenta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param identificacion
	 * @param correoElectronico
	 */
	public Cliente añadirCliente(string nombre, int identificacion, string correoElectronico) {
		// TODO - implement Agencia.añadirCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param identificacion
	 */
	public Cliente buscarCliente(int identificacion) {
		// TODO - implement Agencia.buscarCliente
		throw new UnsupportedOperationException();
	}

}