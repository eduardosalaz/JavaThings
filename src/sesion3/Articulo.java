package sesion3;

public class Articulo 
{
	// Clase serializable
	int cve_art;
	String nom_art;
	float pre_art;
	int cat_art;
	
	public Articulo(int cve_art, String nom_art, float pre_art, int cat_art)
	{
	
		this.cve_art = cve_art;
		this.nom_art = nom_art;
		this.pre_art = pre_art;
		this.cat_art = cat_art;
	}
	
	public int getCve()
	{
		return cve_art;
	}
	public void setCve(int cve_art)
	{
		this.cve_art =cve_art;
	}
	public String getNom()
	{
		return nom_art;
	}
	public void setNom(String nom_art)
	{
		this.nom_art = nom_art;
	}
	public float getPre()
	{
		return pre_art;
	}
	public void setPre(float pre_art)
	{
		this.pre_art = pre_art;
	}
	public int getCat()
	{
		return cat_art;
	}
	public void setCat(int cat_art)
	{
		this.cat_art =cat_art;
	}
	
	@Override
	public String toString()
	{
		return cve_art + "\t\t\t" + nom_art + "\t\t\t" + pre_art + "\t\t\t" + cat_art;
		
	}
	
}
