package fr.combattant.app;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Combattant")
public class Combattant {
	@Id
	private int id; 
	@Column(name = "name")
	private String name; 
	@Column(name = "jiu-jitsu")
	private int bjj; 
	@Column(name = "boxing")
	private int boxing; 
	@Column(name = "wrestling")
	private int wrestling;
	
	public Combattant() {
		
	}
	public Combattant(int id, String name, int bjj, int boxing, int wrestling) {
		super();
		this.id = id;
		this.name = name;
		this.bjj = bjj;
		this.boxing = boxing;
		this.wrestling = wrestling;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBjj() {
		return bjj;
	}
	public void setBjj(int bjj) {
		this.bjj = bjj;
	}
	public int getBoxing() {
		return boxing;
	}
	public void setBoxing(int boxing) {
		this.boxing = boxing;
	}
	public int getWrestling() {
		return wrestling;
	}
	public void setWrestling(int wrestling) {
		this.wrestling = wrestling;
	} 
	
	
	
	
	
}
