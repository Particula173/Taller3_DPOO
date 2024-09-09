package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private Cliente cliente;
	private Vuelo vuelo;
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa)
	{
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	
	public Vuelo getVuelo()
	{
		return this.vuelo;
	}
	
	public String getCodigo()
	{
		return this.codigo;
	}
	
	public int getTarifa()
	{
		return this.tarifa;
	}
	
	public void marcarComoUsado()
	{
		this.usado = true;
	}
	
	public boolean esUsado() 
	{
		return this.usado;
	}
}