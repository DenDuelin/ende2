package edu.ncsu.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player nouNom;

	public String getName() {
		return name;
	}

	public Player getNouNom() {
		return nouNom;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setNouNom(Player owner) {
		this.nouNom = owner;
	}
    
    public String toString() {
        return name;
    }
}
