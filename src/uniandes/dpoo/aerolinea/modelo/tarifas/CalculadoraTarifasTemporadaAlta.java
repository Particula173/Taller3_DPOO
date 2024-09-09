package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas 
{
	protected final int COSTO_POR_KM = 1000;
	
	public CalculadoraTarifasTemporadaAlta()
	{
		
	}

	@Override
	public int calcularCostoBase​(Vuelo vuelo,Cliente cliente)
	{
		Ruta ruta  = vuelo.getRuta();
		int distancia = super.calcularDistanciaVuelo​(ruta);
		return this.COSTO_POR_KM * distancia;
	}
	@Override
	public double calcularPorcentajeDescuento​(Cliente cliente)
	{
		//No hay descuentos para esta tipo de temporada.
		return 0.0;
	}
}