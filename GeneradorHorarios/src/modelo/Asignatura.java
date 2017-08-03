package modelo;
import java.util.ArrayList;

public class Asignatura {
	
	public int id;
	public String nombre;
	public ArrayList<GrupoT> gruposT;
	public ArrayList<GrupoP> gruposP;
	
	public Asignatura(int id, String nombre, ArrayList<GrupoT> gruposT, ArrayList<GrupoP> gruposP) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.gruposT = gruposT;
		this.gruposP = gruposP;
	}

	
}
