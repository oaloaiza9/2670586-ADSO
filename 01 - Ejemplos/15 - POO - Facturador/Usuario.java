public class Usuario{

	private String cedula;
	private String nombres;
	private String direccion;
	private String rol;

	public Usuario(String cedula, String nombres, String direccion, String rol){
		this.cedula = cedula;
		this.nombres = nombres;
		this.direccion = direccion;
		this.rol = rol;
	}

	public String getCedula(){
		return this.cedula;
	}
	public String getNombres(){
		return this.nombres;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public String getRol(){
		return this.rol;
	}

	public void setCedula(String cedula){
		this.cedula = cedula;
	}
	public void setNombres(String nombres){
		this.nombres = nombres;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public void setRol(String rol){
		this.rol = rol;
	}

}