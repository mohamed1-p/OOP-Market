package main;

import java.util.Scanner; 


import menu_impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		MainMenu mainMenu = new MainMenu();
		mainMenu.start();
	
	}

}
