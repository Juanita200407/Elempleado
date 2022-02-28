package mundo;

public class empleado
{
	//-----------------------------------------------------
	//Actributos
	//-----------------------------------------------------
	
	private String nombre; 
	private int    cedula;
	private String direccion;
	private double salarioBase;
	private double porcentajeRetencion;
	//-----------------------------------------------------
	//constructor
	//-----------------------------------------------------
	public empleado( int pCedula, String pNombre, String pDireccion,double pPorcentajeRetenccion, double pSalarioBase) 
    
    {
		cedula= pCedula;
    	nombre= pNombre;
    	direccion= pDireccion;
    	porcentajeRetencion= pPorcentajeRetenccion; 
    	salarioBase= pSalarioBase;
    	
    }
    //-----------------------------------------------------
	//Metodos
	//-----------------------------------------------------
	
	public double calcularDescuento()
	{
		return salarioBase * porcentajeRetencion / 100;
	
	}
	
	
	public double calcularSalarioPorPagar()
	{
		return salarioBase - calcularDescuento(); 
	}
		
	public int getCedula()
	{
		return cedula;
	}
	
	public String getNombre()
	{
		return nombre;
		
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	
	public double getSalarioBase()
	{
		return salarioBase;
	}
	
	public double getPorcentajeRetencion()
	{
		return porcentajeRetencion;
	}
    
	//TODO completar metodo set
	
	public void setCedula(int pCedula)
	{
		cedula=pCedula;
	}
	
	public void setNombre(String pNombre)
	{
		nombre=pNombre;
	}
	
	public void setDireccion(String pDireccion)
	{
		direccion=pDireccion;
	}
	
	public void setPorcetajeRetencion(double pPorcentajeRetenccion)
	{
		porcentajeRetencion=pPorcentajeRetenccion;
	}
	
	public void setSalarioBase(double pSalarioBase)
	{
		salarioBase=pSalarioBase;
	}
}
