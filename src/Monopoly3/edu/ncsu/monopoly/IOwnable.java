package Monopoly3.edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getNouNom();

	int getPrice();

	boolean isAvailable();

	void playAction();

	void setAvailable(boolean available);

	void setNouNom(Player owner);

	String toString();

}