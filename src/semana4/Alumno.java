package semana4;

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
		return mat_alu + "\t\t" + nom_alu + "\t\t" + prom_alu;
	}
}
