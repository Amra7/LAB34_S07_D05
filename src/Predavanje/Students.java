package Predavanje;

import java.util.Random;

public class Students {
	
	private String[] names = new String []{
			"Sanela",
			"Jesenko",
			"Davor",
			"Sanela",
			"Adnan",
			"Gordan",
			"Haris K",
			"Mirza",
			"Nermin",
			"Vedad",
			"Emina",
			"Nedim",
			"Hikmet",
			"Mustafa",
			"Edib",
			"Nermin G",
			"Neldin",
			"Haris",
			"Nedzad",
			"Gorjan",
			"Amra"
				
		};
	
	public String getRandomStudent() {
		Random r = new Random();
		return names[r.nextInt(names.length)];
	}
}
