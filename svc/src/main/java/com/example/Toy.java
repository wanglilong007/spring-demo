package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="toy")
public class Toy {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private Long owner;
    
    @ManyToOne()
    @JoinColumn(name="owner", insertable=false ,updatable=false)
    private Pets pet;
    
    protected Toy() {}


	public Toy(Long id, String name, String type, Long owner, Pets pet) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.pet = pet;
	}




	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", type=" + type + ", owner=" + owner + ", pet=" + pet + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String color) {
		this.type = color;
	}

	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}


}