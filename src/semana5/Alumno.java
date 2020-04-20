package semana5;

import java.util.Objects;

public class Alumno 
{
	int mat_alu;
	String nom_alu;
	float prom_alu;
	public Alumno(int mat_alu, String nom_alu, float prom_alu)
	{
		this.mat_alu = mat_alu;
		this.nom_alu = nom_alu;
		this.prom_alu = prom_alu;
	}
	public int getMat()
	{
		return mat_alu;
	}
	public void setMat(int mat_alu)
	{
		this.mat_alu = mat_alu;
	}
	public String getNom()
	{
		return nom_alu;
	}
	public void setNom(String nom_alu)
	{
		this.nom_alu = nom_alu;
	}
	public float getProm()
	{
		return prom_alu;
	}
	public void setProm(float prom_alu)
	{
		this.prom_alu = prom_alu;
	}
	@Override
	public String toString()
	{
		return mat_alu + nom_alu + prom_alu;
	}
	@Override
	public boolean equals (Object object)
	{
	    boolean result = false;
	    if (object == null || object.getClass() != getClass()) {
	        result = false;
	    } else {
	        Alumno alum = (Alumno) object;
	        if (this.nom_alu.equals(alum.getNom()) && this.mat_alu == (alum.getMat())   && this.prom_alu ==(alum.getProm())) 
	        		{
	            result = true;
	        }
	    }
	    return result;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(mat_alu, nom_alu, prom_alu);
	}
	}

