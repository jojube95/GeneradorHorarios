package modelo;


public class GrupoT {
	public String nombre;
	public int ini1;
	public int fin1;
	public int ini2;
	public int fin2;
	
	public GrupoT(String nombre, int ini1, int fin1, int ini2, int fin2){
		this.nombre = nombre;
		this.ini1 = ini1;
		this.fin1 = fin1;
		this.ini2 = ini2;
		this.fin2 = fin2;
	}
	
	public GrupoT(String nombre, int ini1, int fin1){
		this.nombre = nombre;
		this.ini1 = ini1;
		this.fin1 = fin1;
		this.ini2 = 0;
		this.fin2 = 0;
	}
	
	public boolean isUna(GrupoT grupoT){
		if(grupoT.ini2 == 0 && grupoT.fin2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
}
