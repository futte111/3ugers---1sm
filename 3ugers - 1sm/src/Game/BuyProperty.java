package Game;

import gui_main.GUI;
import gui_fields.GUI_Street;

public class BuyProperty {
	boolean playerCanBuy = false;

	int counterCyan, counterPink, counterGreen, counterGrey, counterRed, counterWhite, counterYellow,
			counterMagenta = 0;
	int numberOffCyan, numberOffPink, numberOffGreen, numberOffGrey, numberOffRed, numberOffWhite, numberOffYellow,
			numberOffMagenta = 0;

	public BuyProperty() {

	}

	boolean[] sameColor = { false, false, false, false, false, false, false, false };

	public String ownerOfFieldName(int field, GUI gui) {
		return ((GUI_Street) gui.getFields()[field]).getOwnerName();

	}

	public void getCyan(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(1, gui).equals(ownerOfFieldName(3, gui))
				&& player.getName().equals(ownerOfFieldName(3, gui))) {
			if (numberOffCyan == 0 && counterCyan <= 3) {
				counterCyan++;
				((GUI_Street) gui.getFields()[1]).setHouses(counterCyan);
				board.changeNumOffBuild(1,1);
				numberOffCyan = 1;
			} else if (numberOffCyan == 1 && counterCyan <=4) {
				((GUI_Street) gui.getFields()[3]).setHouses(counterCyan);
				board.changeNumOffBuild(3,1);
				numberOffCyan = 0;
			}
			int price = board.pirceForHouse(0);
			player.changeBalance(-price);
			player.setHouseValue(price);

		}
	}

	public void getPink(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(6, gui).equals(ownerOfFieldName(8, gui))
				&& ownerOfFieldName(6, gui).equals(ownerOfFieldName(9, gui))
				&& player.getName().equals(ownerOfFieldName(6, gui))) {
			if (numberOffPink == 0 && counterPink <= 3) {
				counterPink++;
				((GUI_Street) gui.getFields()[6]).setHouses(counterPink);
				board.changeNumOffBuild(6,1);
				numberOffPink = 1;
			} else if (numberOffPink == 1 && counterPink <= 4) {
				((GUI_Street) gui.getFields()[8]).setHouses(counterPink);
				board.changeNumOffBuild(8,1);
				numberOffPink = 2;
			} else if (numberOffPink == 2 && counterPink <= 4) {
				((GUI_Street) gui.getFields()[9]).setHouses(counterPink);
				board.changeNumOffBuild(9,1);
				numberOffPink = 0;
			}
			int price = board.pirceForHouse(0);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getGreen(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(11, gui).equals(ownerOfFieldName(13, gui))
				&& ownerOfFieldName(11, gui).equals(ownerOfFieldName(14, gui))
				&& player.getName().equals(ownerOfFieldName(11, gui))) {
			if (numberOffGreen == 0 && counterGreen <= 3) {
				counterGreen++;
				((GUI_Street) gui.getFields()[11]).setHouses(counterGreen);
				board.changeNumOffBuild(11,1);
				numberOffGreen = 1;
			} else if (numberOffGreen == 1 && counterGreen <= 4) {
				((GUI_Street) gui.getFields()[13]).setHouses(counterGreen);
				board.changeNumOffBuild(13,1);
				numberOffGreen = 2;
			} else if (numberOffGreen == 2 && counterGreen <= 4) {
				((GUI_Street) gui.getFields()[14]).setHouses(counterGreen);
				board.changeNumOffBuild(14,1);
				numberOffGreen = 0;
			}
			int price = board.pirceForHouse(1);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getGrey(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(16, gui).equals(ownerOfFieldName(18, gui))
				&& ownerOfFieldName(16, gui).equals(ownerOfFieldName(19, gui))
				&& player.getName().equals(ownerOfFieldName(16, gui))) {
			if (numberOffGrey == 0 && counterGrey <= 3) {
				counterGrey++;
				((GUI_Street) gui.getFields()[16]).setHouses(counterGrey);
				board.changeNumOffBuild(16,1);
				numberOffGrey = 1;
			} else if (numberOffGrey == 1 && counterGrey <= 4) {
				((GUI_Street) gui.getFields()[18]).setHouses(counterGrey);
				board.changeNumOffBuild(18,1);
				numberOffGrey = 2;
			} else if (numberOffGrey == 2 && counterGrey <= 4) {
				((GUI_Street) gui.getFields()[19]).setHouses(counterGrey);
				board.changeNumOffBuild(19,1);
				numberOffGrey = 0;
			}
			int price = board.pirceForHouse(1);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getRed(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(21, gui).equals(ownerOfFieldName(23, gui))
				&& ownerOfFieldName(21, gui).equals(ownerOfFieldName(24, gui))
				&& player.getName().equals(ownerOfFieldName(21, gui))) {
			if (numberOffRed == 0 && counterRed <= 3) {
				counterRed++;
				((GUI_Street) gui.getFields()[21]).setHouses(counterRed);
				board.changeNumOffBuild(21,1);
				numberOffRed = 1;
			} else if (numberOffRed == 1 && counterRed <= 4) {
				((GUI_Street) gui.getFields()[23]).setHouses(counterRed);
				board.changeNumOffBuild(23,1);
				numberOffRed = 2;
			} else if (numberOffRed == 2 && counterRed <= 4) {
				((GUI_Street) gui.getFields()[24]).setHouses(counterRed);
				board.changeNumOffBuild(24,1);
				numberOffRed = 0;
			}
			int price = board.pirceForHouse(2);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getWhite(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(26, gui).equals(ownerOfFieldName(27, gui))
				&& ownerOfFieldName(26, gui).equals(ownerOfFieldName(29, gui))
				&& player.getName().equals(ownerOfFieldName(26, gui))) {
			if (numberOffWhite == 0 && counterWhite <= 3) {
				counterWhite++;
				((GUI_Street) gui.getFields()[26]).setHouses(counterWhite);
				board.changeNumOffBuild(26,1);
				numberOffWhite = 1;
			} else if (numberOffWhite == 1 && counterWhite <= 4) {
				((GUI_Street) gui.getFields()[27]).setHouses(counterWhite);
				board.changeNumOffBuild(27,1);
				numberOffWhite = 2;
			} else if (numberOffWhite == 2 && counterWhite <= 4) {
				((GUI_Street) gui.getFields()[29]).setHouses(counterWhite);
				board.changeNumOffBuild(29,1);
				numberOffWhite = 0;
			}
			int price = board.pirceForHouse(2);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getYellow(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(31, gui).equals(ownerOfFieldName(32, gui))
				&& ownerOfFieldName(31, gui).equals(ownerOfFieldName(34, gui))
				&& player.getName().equals(ownerOfFieldName(31, gui))) {
			if (numberOffYellow == 0 && counterYellow <= 3) {
				counterYellow++;
				((GUI_Street) gui.getFields()[31]).setHouses(counterYellow);
				board.changeNumOffBuild(31,1);
				numberOffYellow = 1;
			} else if (numberOffYellow == 1 && counterYellow <= 4) {
				((GUI_Street) gui.getFields()[32]).setHouses(counterYellow);
				board.changeNumOffBuild(32,1);
				numberOffYellow = 2;
			} else if (numberOffYellow == 2 && counterYellow <= 4) {
				((GUI_Street) gui.getFields()[34]).setHouses(counterYellow);
				board.changeNumOffBuild(34,1);
				numberOffYellow = 0;
			}
			int price = board.pirceForHouse(3);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}

	public void getMagenta(GUI gui, Player player, GameBoard board) {
		if (ownerOfFieldName(37, gui).equals(ownerOfFieldName(39, gui))
				&& player.getName().equals(ownerOfFieldName(37, gui)) && counterMagenta < 4) {
			if (numberOffMagenta == 0 && counterMagenta <= 3) {
				counterMagenta++;
				((GUI_Street) gui.getFields()[37]).setHouses(counterMagenta);
				board.changeNumOffBuild(37,1);
				numberOffMagenta = 1;
			} else if (numberOffMagenta == 1 && counterMagenta <= 4) {
				((GUI_Street) gui.getFields()[39]).setHouses(counterMagenta);
				board.changeNumOffBuild(39,1);
				numberOffMagenta = 0;
			}
			int price = board.pirceForHouse(3);
			player.changeBalance(-price);
			player.setHouseValue(price);
		}
	}
	
	public void buildHouse(GUI gui, int field) {
		((GUI_Street) gui.getFields()[field]).setHouses(1);

	}

	public void choiceOfArea(String choice, GUI gui, Player player, GameBoard board) {
		switch (choice) {
		case "Cyan":
			getCyan(gui, player, board);
			break;
		case "Pink":
			getPink(gui, player, board);
			break;
		case "Grøn":
			getGreen(gui, player, board);
			break;
		case "Grå":
			getGrey(gui, player, board);
			break;
		case "Rød":
			getRed(gui, player, board);
			break;
		case "Hvid":
			getWhite(gui, player, board);
			break;
		case "Gul":
			getYellow(gui, player, board);
			break;
		case "Lilla":
			getMagenta(gui, player, board);
			break;
		}
	}

}