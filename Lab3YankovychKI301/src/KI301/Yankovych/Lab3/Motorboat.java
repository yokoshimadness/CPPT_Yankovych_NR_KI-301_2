package KI301.Yankovych.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

interface wideangle
{
	void StartMotor();
	void StopMotor();
}
public class Motorboat extends RowingBoat implements wideangle
{		private int benz;

	 public Motorboat() throws FileNotFoundException
	 {
		 characteristics = new Characteristics();
		 state = new State();
		 functions = new Functions();
		 f = new PrintWriter(new File("Log1.txt"));
		 benz = 150;
	 }
	 /**
	 * Constructor
	 * @param <code>xlenght</code> boat lenght
	 * @param <code>xwidth</code> boat width
	 * @throws FileNotFoundException
	 */

	 public Motorboat(int xlenght, int xwidth) throws FileNotFoundException
	 {
		 characteristics = new Characteristics(xlenght, xwidth);
		 state = new State();
		 functions = new Functions();
		 f = new PrintWriter(new File("Log1.txt")); 
		 benz = 150;
	 }
	 public void StartMotor() {
		 System.out.println("\nМотор ввімкнено"); f.println("\nМотор ввімкнено");	f.flush();
	 }
	 public void StopMotor() {
		 System.out.println("\nМотор вимкнено"); f.println("\nМотор вимкнено");	f.flush();}
	 public void Set_Benz(int xbenz) {
		 System.out.println("Зміна кількості бенза"); f.println("Зміна кількості бенза");	f.flush();	
		 benz = xbenz;
		}
	 public int getBenz() 
		{System.out.println("Отримання кількості бенза"); f.println("Отримання кількості бенза");	f.flush();	
			return benz;
		}
	 public void BenzWaste() {
		    System.out.println("\nВиклик трати бензина на 50 л.");
		    f.println("\nВиклик трати бензина");
		    System.out.println("Бенз до:" + benz + "л.");
		    f.println("Бенз до:" + benz + "л.");
		    
		    if (benz >= 50) {
		        benz = benz - 50;
		        System.out.println("Бенз після:" + benz + "л.");
		        f.println("Бенз після:" + benz + "л.");
		    } else {
		        System.out.println("Помилка: Недостатньо бензина для виконання.");
		        f.println("Помилка: Недостатньо бензина для виконання.");
		    }
		    
		    f.flush();
		}
	  public void Direction(String xdir) 
	 {	System.out.println("\nВиклик зміни напрямку руху");
	 	f.println("\nВиклик зміни напрямку руху");
	 	System.out.println("Напрямок руху до:" + state.getDirection());
	 	f.println("Напрямок руху до:" + state.getDirection());
		 state.Set_Direction(xdir);
		System.out.println("Напрямок руху після:" + state.getDirection());
		f.println("Напрямок руху після:" + state.getDirection());
		f.flush();
	 }
}
