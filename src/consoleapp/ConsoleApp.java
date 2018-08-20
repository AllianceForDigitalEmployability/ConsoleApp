/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleapp;

/**
 *
 * @author George Pasparakis
 */
public class ConsoleApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ConsoleApp().mainMenu();
    }
        
    private void mainMenu() {
		Menu menu = new Menu();
		menu.setTitle("*** My Main Menu ***");
		menu.addItem(new MenuItem("Option A", this, "subMenuA"));
		menu.addItem(new MenuItem("Option B", this, "subMenuB"));
		menu.addItem(new MenuItem("Option C", this, "performOptionC"));
		menu.execute();
    }
	
    public void subMenuA() {
        Menu menu = new Menu();
	menu.setTitle("*** Sub Menu A ***");
	menu.addItem(new MenuItem("Option Aa"));
	menu.addItem(new MenuItem("Option Ab"));
	menu.execute();
    }
	
    /* This menu has no menu items but will still generate a single exit option. */
    public void subMenuB() {
	Menu menu = new Menu();
	menu.setTitle("*** Sub Menu B ***");
	menu.execute();
    }
	
    /* Added a confirmation request here to demonstrate how it could be used. */
    public void performOptionC() {
    	boolean confirm = ConsoleUtils.requestConfirmation();
	if(confirm) 
            System.out.println("\nDo Option C...");
        else 
            System.out.println("\nOption C cancelled!");
        ConsoleUtils.pauseExecution();
    }
}
