package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player nouNom;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getNouNom() {
		return nouNom;
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}
	
	@Override
	public abstract void playAction();

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setNouNom(Player owner) {
		this.nouNom = owner;
	}
    
    @Override
	public String toString() {
        return name;
    }
}
