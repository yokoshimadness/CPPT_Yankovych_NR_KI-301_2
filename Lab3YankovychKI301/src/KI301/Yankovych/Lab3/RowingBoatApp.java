package KI301.Yankovych.Lab3;
import static java.lang.System.out;
import java.io.*;
/**
* Rowing Boat Application class implements main method for 
* RowingBoat class abilities demonstration 
*/
public class RowingBoatApp {
	/**
	* @param args
	* @throws FileNotFoundException
	*/
	public static void main(String[] args)  throws FileNotFoundException {
		Motorboat rowingboat = new Motorboat(22,33);
		rowingboat.lwequal();
		//rowingboat.wlequal();
		rowingboat.SetAnotherColor("Yellow");
		rowingboat.SubVeslo_lenght();
		rowingboat.AddVeslo_lenght();
		rowingboat.BimBimBamBam();
		rowingboat.NoBimBimBamBam();
		rowingboat.Direction("Назад");
		rowingboat.WeightChanger(44);
		rowingboat.WaterChanger(13);
		rowingboat.BaggageRemove();
		rowingboat.BaggageAdder();
		rowingboat.PassengersChanger(52);
		rowingboat.StartMotor();
		rowingboat.StopMotor();
		rowingboat.BenzWaste();
	}
}
