package sample;

import java.util.ArrayList;

import abstractions.IMenuItem;
import implementations.Menu;
import implementations.MenuItem;

public class ApplicationMenu{
    
    private Menu mainMenu = null;
    public ApplicationMenu()
    {
                 
    }
	private void uiDeleteStudent() {
		System.out.println("Sterge student");
		
	}
    private void uiAddStudent() {
		System.out.println("Adauga student");
	}
    
    public void load()
    {
        
        ArrayList<IMenuItem> menuItems = new ArrayList();
        ArrayList<IMenuItem> showStudentsOptions = new ArrayList();
        
        int shortCut = 1;    
        
         
       IMenuItem currentItem = new MenuItem("Adaugare student", shortCut++, (parameters)->{
           uiAddStudent();
       });       
       menuItems.add(currentItem);
       
       currentItem = new MenuItem("Sterge student", shortCut++, (parameters)->{
    	   	uiDeleteStudent();
       });       
       menuItems.add(currentItem);      
       
       showStudentsOptions.add(new MenuItem("Ordonat crescator", 1, (parameters) -> {
    	System.out.println("Ordonare crescatoare executata");   
       }));
       
       showStudentsOptions.add(new MenuItem("Ordonat decrescator", 2, (parameters) -> {
       	System.out.println("Ordonare descrescatoare executata");   
          }));
       
       
       currentItem = new Menu("Afisaza studenti", shortCut++, showStudentsOptions);       
       menuItems.add(currentItem);
       
       
        
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
    
}
