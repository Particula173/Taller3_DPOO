package uniandes.dpoo.aerolinea.modelo;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import java.util.HashMap;
public class Vuelo {

	private Ruta ruta;
	private String fecha;
	private Avion avion;
	private Map<String, Tiquete> tiquetes ;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion)
	{
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
		this.tiquetes = new HashMap<>();
		
	}
	
	public Ruta getRuta()
	{
		return this.ruta;
	}
	
	public String getFecha()
	{
		return this.fecha;
	}
	
	public Avion getAvion()
	{
		return this.avion;
	}
	
	public Map<String, Tiquete> getTiquetes()
	{
		return this.tiquetes;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException
	{
		int costoTotal = calculadora.calcularTarifa(this, cliente) * cantidad;
		int capacidad = this.avion.getCapacidad();
		if (capacidad < cantidad)
		{
			throw new VueloSobrevendidoException(this);
		}
		for (int i = 0; i < cantidad; i++) {
	        Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, calculadora.calcularTarifa(this, cliente));
	        this.tiquetes.put(tiquete.getCodigo(), tiquete);
	        GeneradorTiquetes.registrarTiquete(tiquete);
	    }
	    return costoTotal;
	}
	
	public boolean equals(Object obj)
	{
		return false;
	}
}