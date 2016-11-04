package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="pets")
public class Pets {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String color;
    private Long owner;
    
    @ManyToOne()
    @JoinColumn(name="owner", insertable=false ,updatable=false)
    private User user;
    
    @OneToMany(mappedBy = "pet")
    private List<Toy> toys;
    
    protected Pets() {}

	public Pets(String name, String color, Long owner) {
		super();
		this.name = name;
		this.color = color;
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "Pets [id=" + id + ", name=" + name + ", color=" + color + ", owner=" + owner + "]";
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}



	public List<Toy> getToys() {
		return toys;
	}



	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}


}