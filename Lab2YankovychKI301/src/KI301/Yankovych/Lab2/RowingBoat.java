/**
* lab 2 package
*/
package KI301.Yankovych.Lab2;
import java.io.*;
/**
* Class <code>RowingBoat</code> implements rowing boat
*/
public class RowingBoat {
	 private Characteristics characteristics;
	 private State state;
	 private Functions functions;
	 private PrintWriter f;
	 /**
	 * Constructor
	 * @throws FileNotFoundException
	 */

	 public RowingBoat() throws FileNotFoundException
	 {
		 characteristics = new Characteristics();
		 state = new State();
		 functions = new Functions();
		 f = new PrintWriter(new File("Log.txt"));
	 }
	 /**
	 * Constructor
	 * @param <code>xlenght</code> boat lenght
	 * @param <code>xwidth</code> boat width
	 * @throws FileNotFoundException
	 */

	 public RowingBoat(int xlenght, int xwidth) throws FileNotFoundException
	 {
		 characteristics = new Characteristics(xlenght, xwidth);
		 state = new State();
		 functions = new Functions();
		 f = new PrintWriter(new File("Log.txt")); 
	 }
	  /**
	  * Method sets the lenght equal to width
	  */
	 public void lwequal() 
	 {	System.out.println("Виклик прирівнювання довжини до ширини");
	 	f.println("Виклик прирівнювання довжини до ширини");
	 	System.out.println("Довжина була:" + characteristics.getLenght()+"     Довжина стала:" + characteristics.getWidth());
	 	f.println("Довжина була:" + characteristics.getLenght()+"     Довжина стала:" + characteristics.getWidth());
	 	f.flush();
		 characteristics.Set_Lenght(characteristics.getWidth());
	 }
	 /**
	  * Method sets the width equal to lenght
	  */
	 public void wlequal() 
	 {	System.out.println("\nВиклик прирівнювання ширини до довжини");
	 	f.println("\nВиклик прирівнювання ширини до довжини");
	 	System.out.println("Ширина була:" + characteristics.getWidth()+"     Ширина стала:" + characteristics.getLenght());
	 	f.println("Ширина була:" + characteristics.getWidth()+"     Ширина стала:" + characteristics.getLenght());
	 	f.flush();
		 characteristics.Set_Width(characteristics.getLenght());
	 }
	 /**
	  * Method sets the new color
	  * @param <code>xcolor</code> The color of the boat
	  */
	 public void SetAnotherColor(String xcolor) 
	 {	System.out.println("\nВиклик зміни кольору");
	 	f.println("\nВиклик зміни кольору");
	 	System.out.println("Колір був:" + characteristics.getColor()+"     Колір став:" + xcolor);
	 	f.println("Колір був:" + characteristics.getColor()+"     Колір став:" + xcolor);
	 	f.flush();
		 characteristics.Set_Color(xcolor);
	 }
	 /**
	  * Method substracts the veslo_lenght by 1
	  */
	 public void SubVeslo_lenght() 
	 {	System.out.println("\nВиклик зменшення довжини весла на 1");
	 	f.println("\nВиклик зменшення довжини весла на 1");
	 	System.out.println("Довжина весла до:" + characteristics.getVeslo_Lenght());
	 	f.println("Довжина весла до:" + characteristics.getVeslo_Lenght());
		 int a;
		 a = characteristics.getVeslo_Lenght();
		 a--;
		 characteristics.Set_Veslo_Lenght(a);
		 System.out.println("Довжина весла після:" + characteristics.getVeslo_Lenght());
		 f.println("Довжина весла після:" + characteristics.getVeslo_Lenght());
		 f.flush();
	 }
	 /**
	  * Method adds the veslo_lenght by 1
	  */
	 public void AddVeslo_lenght() 
	 {	System.out.println("\nВиклик збільшення довжини весла на 1");
	 	f.println("\nВиклик зменшення збільшення весла на 1");
	 	System.out.println("Довжина весла до:" + characteristics.getVeslo_Lenght());
	 	f.println("Довжина весла до:" + characteristics.getVeslo_Lenght());
		 int a;
		 a = characteristics.getVeslo_Lenght();
		 a++;
		 characteristics.Set_Veslo_Lenght(a);
		 System.out.println("Довжина весла після:" + characteristics.getVeslo_Lenght());
		 f.println("Довжина весла після:" + characteristics.getVeslo_Lenght());
		 f.flush();
	 }
	 /**
	  * Method changes boat damage status to DAMAGED
	  */
	 public void BimBimBamBam() 
	 {	System.out.println("\nВиклик ламання шлюпки");
	 	f.println("\nВиклик ламання шлюпки");
	 	System.out.println("Шлюпка підбита: " + state.getDamaged());
	 	f.println("Шлюпка підбита: " + state.getDamaged());
		 state.Set_Damaged(true);
		System.out.println("Шлюпка підбита: " + state.getDamaged());
		f.println("Шлюпка підбита: " + state.getDamaged());
		f.flush();
	 }
	 /**
	  * Method changes boat damage status to NO-DAMAGED
	  */
	 public void NoBimBimBamBam() 
	 {	System.out.println("\nВиклик ремонту шлюпки");
	 	f.println("\nВиклик ремонту шлюпки");
	 	System.out.println("Шлюпка підбита: " + state.getDamaged());
	 	f.println("Шлюпка підбита: " + state.getDamaged());
		 state.Set_Damaged(false);
		System.out.println("Шлюпка підбита: " + state.getDamaged());
		f.println("Шлюпка підбита: " + state.getDamaged());
		f.flush();
	 }
	 /**
	  * Method changes boat movement direction
	  * @param <code>xdir</code> Movement direction
	  */
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
	 /**
	  * Method changes boat carrying capacity
	  * @param <code>xweight</code> Carrying capacity
	  */
	 public void WeightChanger(int xweight) 
	 {	System.out.println("\nВиклик зміни ваги");
	 	f.println("\nВиклик зміни ваги");
	 	System.out.println("Вантажність до:" + functions.getWeightcan());
	 	f.println("Вантажність до:" + functions.getWeightcan());
		functions.Set_Weightcan(xweight); 
		System.out.println("Вантажність після:" + functions.getWeightcan());
	 	f.println("Вантажність після:" + functions.getWeightcan());
	 	f.flush();
	 }
	 /**
	  * Method changes boat buoyancy
	  * @param <code>xwater</code> Buoyancy
	  */
	 public void WaterChanger(int xwater) 
	 {	System.out.println("\nВиклик зміни плавучості");
	 	f.println("\nВиклик зміни плавучості");
	 	System.out.println("Плавучість до:" + functions.getWaterspec() + "%");
	 	f.println("Плавучість до:" + functions.getWaterspec() + "%");
		 functions.Set_Waterspec(xwater);
		System.out.println("Плавучість після:" + functions.getWaterspec() + "%");
		f.println("Плавучість після:" + functions.getWaterspec() + "%");
		f.flush();
	 }
	 /**
	  * Method sets Baggage place to false
	  */
	 public void BaggageRemove() 
	 {	System.out.println("\nВиклик усунення місця бля багажу");
	 	f.println("\nВиклик усунення місця бля багажу");
	 	System.out.println("Місце для багажу є:" + functions.getBaggageplace());
	 	f.println("Місце для багажу є:" + functions.getBaggageplace());
	 	functions.Set_Baggageplace(false);
	 	System.out.println("Місце для багажу є:" + functions.getBaggageplace());
		f.println("Місце для багажу є:" + functions.getBaggageplace());
		f.flush();
	 }
	 /**
	  * Method sets Baggage place to true
	  */
	 public void BaggageAdder() 
	 {	System.out.println("\nВиклик додавання місця бля багажу");
	 	f.println("\nВиклик додавання місця бля багажу");
	 	System.out.println("Місце для багажу є:" + functions.getBaggageplace());
	 	f.println("Місце для багажу є:" + functions.getBaggageplace());
	 	functions.Set_Baggageplace(true);
	 	System.out.println("Місце для багажу є:" + functions.getBaggageplace());
		f.println("Місце для багажу є:" + functions.getBaggageplace());
		f.flush();
	 }
	 /**
	  * Method sets max amout of passengers
	  * @param <code>xCount</code> Max amount of passengers
	  */
	 public void PassengersChanger(int xCount) 
	 {System.out.println("\nВиклик зміни кількості місць для пасажирів");
	 	f.println("\nВиклик зміни кількості місць для пасажирів");
	 	System.out.println("Кількість місць до:" + functions.getPassengersCounter());
	 	f.println("Кількість місць до:" + functions.getPassengersCounter());
		 functions.Set_Passengerscounter(xCount);
		 System.out.println("Кількість місць після:" + functions.getPassengersCounter());
		 f.println("Кількість місць після:" + functions.getPassengersCounter());
		 f.flush();
	 }
}
class Characteristics {
	private int lenght;
	private int width;
	private String color;
	private int veslo_lenght;
	/**
	* Constructor
	*/
	public Characteristics() 
	{
		lenght = 15;
		width = 125;
		color = "blue";
		veslo_lenght = 23;
	}
	/**
	* Constructor
	* @param <code>xlenght</code> Boat lenght
	* @param <code>xwidth</code> Boat width
	*/
	public Characteristics(int xlenght,int xwidth) 
	{
		lenght = xlenght;
		width = xwidth;
		color = "Red";
		veslo_lenght = 22;
	}
	/**
	* Method sets boat lenght
	* @param <code>xlenght</code> Boat lenght
	*/
	public void Set_Lenght(int xlenght) 
	{
		lenght = xlenght;
	}
	/**
	* Method sets boat width
	* @param <code>xwidth</code> Boat width
	*/
	public void Set_Width(int xwidth) 
	{
		width = xwidth;
	}
	/**
	* Method sets boat color
	* @param <code>xcolor</code> Boat color
	*/
	public void Set_Color(String xcolor) 
	{
		color = xcolor;
	}
	/**
	* Method sets boat veslo lenght
	* @param <code>xveslo_lenght</code> Boat veslo lenght
	*/
	public void Set_Veslo_Lenght(int xveslo_lenght) 
	{
		veslo_lenght = xveslo_lenght;
	}
	/**
	* Method gets boat lenght
	*/
	public int getLenght() 
	{
		return lenght;
	}
	/**
	* Method gets boat width
	*/
	public int getWidth() 
	{
		return width;
	}
	/**
	* Method gets boat color
	*/
	public String getColor() 
	{
		return color;
	}
	/**
	* Method gets boat veslo lenght
	*/
	public int getVeslo_Lenght() 
	{
		return veslo_lenght;
	}
}
class State {
	private boolean damaged;
	private String direction;
	/**
	* Constructor
	*/
	public State() 
	{
		damaged = false;
		direction = "Прямо";
	}
	/**
	* Method sets boat damage status
	* @param <code>xdamaged</code> Boat damage status
	*/
	public void Set_Damaged(boolean xdamaged) 
	{
		damaged = xdamaged;
	}
	/**
	* Method sets boat movement direction
	* @param <code>xDir</code> Boat movement direction
	*/
	public void Set_Direction(String xDir) {
		direction = xDir;
	}
	/**
	* Method gets boat movement direction
	*/
	public String getDirection() 
	{
		return direction;
	}
	/**
	* Method gets boat damage status
	*/
	public boolean getDamaged() 
	{
		return damaged;
	}
}
class Functions {
	private int weightcan;
	private int waterspec;
	private boolean baggageplace;
	private int passengerscounter;
	/**
	* Constructor
	*/
	public Functions() {
		weightcan = 15;
		waterspec = 15;
		baggageplace = true;
		passengerscounter = 44;
	}
	/**
	  * Method sets boat carrying capacity
	  * @param <code>xweightcan</code> Carrying capacity
	  */
	public void Set_Weightcan(int xweightcan) 
	{
		weightcan = xweightcan;
	}
	/**
	  * Method sets boat buoyancy
	  * @param <code>xwaterspec</code> Buoyancy
	  */
	public void Set_Waterspec(int xwaterspec) 
	{
		waterspec = xwaterspec;
	}
	/**
	* Method sets boat baggace place status 
	* @param <code>xbaggageplace</code> Boat baggage place status
	*/
	public void Set_Baggageplace(boolean xbaggageplace) 
	{
		baggageplace = xbaggageplace;
	}
	/**
	  * Method sets max amout of passengers
	  * @param <code>xpassengerscounter</code> Max amount of passengers
	  */
	public void Set_Passengerscounter(int xpassengerscounter) 
	{
		passengerscounter = xpassengerscounter;
	}
	/**
	  * Method gets boat carrying capacity
	  */
	public int getWeightcan() 
	{
		return weightcan;
	}
	/**
	  * Method gets boat buoyancy
	  */
	public int getWaterspec() 
	{
		return waterspec;
	}
	/**
	* Method gets boat baggace place status 
	*/
	public boolean getBaggageplace() 
	{
		return baggageplace;
	}
	/**
	  * Method gets max amout of passengers
	  */
	public int getPassengersCounter() 
	{
		return passengerscounter;
	}
}
