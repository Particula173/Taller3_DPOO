package uniandes.dpoo.aerolinea.modelo;
/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horaSalida;
	private String horaLLegada;
	private String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLLegada, String codigoRuta )
	{
		this.horaSalida = horaSalida;
		this.horaLLegada = horaLLegada;
		this.codigoRuta = codigoRuta;
		this.origen = origen;
		this.destino = destino;
	}

	public String getCodigoRuta()
	{
		return this.codigoRuta;
	}

	public Aeropuerto getOrigen()
	{
		return this.origen;
	}
	
	public Aeropuerto getDestino()
	{
		return this.destino;
	}
	
	public String getHoraSalida ()
	{
		return this.horaLLegada;
	}
	
	public String getHoraLLegada()
	{
		return this.horaLLegada;
	}
	
	public int  getDuracion()
	{
		int llegada = Integer.parseInt(this.horaLLegada);
        int salida = Integer.parseInt(this.horaSalida);
        int llegadaHoras = llegada / 100;
        int salidaHoras = salida / 100;
        int llegadaMinutos = llegada % 100;
        int salidaMinutos = salida % 100;
        int duracionHoras = llegadaHoras - salidaHoras;
        int duracionMinutos = llegadaMinutos - salidaMinutos;
        return duracionHoras * 60 + duracionMinutos;
	}
    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}