package edu.ncsu.monopoly;

public class UtilityCell extends Cell {

	public static final String COLOR_GROUP = "UTILITY";
	private static int PRICE;

	public static void setPrice(int price) {
		UtilityCell.PRICE = price;
	}

	public int getPrice() {
		return UtilityCell.PRICE;
	}

	public int getRent(int diceRoll) {
		if(nouNom.numberOfUtil() == 1) {
			return diceRoll * 4;
		} else if (nouNom.numberOfUtil() >= 2) {
			return diceRoll * 10;
		}
		return 0;
	}

	public boolean playAction(String msg) {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(nouNom != currentPlayer) {
				GameMaster.instance().utilRollDice();
				int diceRoll = GameMaster.instance().getUtilDiceRoll();
				currentPlayer.payRentTo(nouNom, getRent(diceRoll));
			}
		}
	}
}
