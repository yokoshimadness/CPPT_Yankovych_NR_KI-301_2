package KI301.Yankovych.Lab6;
import java.util.*;


/**
 * Class Lab6YankovychKI301 realize example program to lab6
 * @author Yankovych Nazariy
 * @version 1.2
 * @since version 1.0
 */

public class Lab6YankovychKI301 {
    public static void main(String[] args) throws Exception {
        Jar <? super Data> jar = new Jar <Data> ();
        jar.AddData(new Tomato("Completely Red" , false , 155));
        jar.AddData(new Cucumber("Completely Green" , 178));
        jar.AddData(new Tomato("Half Yellow" , false , 130));
        jar.AddData(new Cucumber("Dark Green" , 230));
        jar.AddData(new Tomato("Black" , true , 161));
        Data res1 = jar.findMin();
        System.out.println("The smallest by mass: ");
        res1.print();
    }
}
/**
 * Parameterized class <code>Jar</code> implements jar
 */
class Jar<T extends Data>{
    private ArrayList<T> arr;
    public Jar() {
        arr = new ArrayList<T>();
    }
    /**
     * Method finds the largest element by mass
     * @return max
     */
    public T findMin()
    {
if(!arr.isEmpty()){
    T min = arr.get(0);
    for (int i = 1;i<arr.size();i++){
        if(arr.get(i).compareTo(min)<0)
        	min = arr.get(i);
    }
    return min;
}
return null;
    }
public void AddData(T data){
    arr.add(data);
    System.out.println("Element added: ");
    data.print();
}
public void DeleteData(int i){
    arr.remove(i);
}  
}
/**
 * Interface <code>Data</code> implements data
 */
interface Data extends Comparable<Data>
{
public int getMass();
public void print();
}
/**
 * Class <code>Tomato</code> implements tomato
 */
class Tomato implements Data{
    private String color;
    private boolean putridity;
    private int weight;
    /**
     * Constructor
     * @param <code>color_t</code> the color of tomato
     * @param <code>putridity_t</code> putridity of tomato
     * @param <code>weight_t</code> the weight of tomato
     */
    public Tomato(String color_t, boolean putridity_t, int weight_t){
color = color_t;
putridity=putridity_t;
weight=weight_t;
    }
    /**
     * Method return color of tomato
     * @return color
     */
    public String getColor(){
        return color;
    }
    /**
     * Method set color for tomato
     * @param <code>color_s</code> color of tomato
     */
    public void setColor(String color_s){
color=color_s;
    }
/**
 * Method return putridity of tomato
 * @return putridity
 */
public boolean getPutridity(){
    return putridity;
}
/**
 * Method set putridity for tomato
 * @param <code>putridity_s</code> putridity for tomato
 */
public void setPutridity(boolean putridity_s){
    putridity = putridity_s;
}
/**
 * Method return weight of tomato
 * @return weight
 */
public int getMass(){
return weight;
}
/**
 * Method compare objects type Data
 * @param <code>p</code> the weight of object
 */
public int compareTo(Data p){
    Integer h = weight;
    return h.compareTo(p.getMass());
}
/**
 * Method print information about tomato
 */
public void print(){
    System.out.println("Type: Tomato, Color: " + color + ", Putridity: " + putridity + ", Weight: " + weight + " grams\n"); 

    
}
}
/**
 * class <code>Cucumber</code> implements Cucumber
 */
class Cucumber implements Data{
    private String cucumberColor;
    private int cucumberWeight;
    /**
     * Constructor
     * @param <code>cucumberColor_s</code> cucumber color
     * @param <code>cucumberWeight_s</code> cucumber weight
     */
    public Cucumber(String cucumberColor_s,int cucumberWeight_s){
        cucumberColor = cucumberColor_s;
        cucumberWeight=cucumberWeight_s;
    }
/**
 * Method return color of Cucumber
 * @return cucumberColor
 */
    public String getCucColor(){
        return cucumberColor;
    }
    /**
     * Method set Cucumber color
     * @param <code>cucumberColor_s</code> the color of Cucumber
     */
    public void setCucColor(String cucumberColor_s){
cucumberColor=cucumberColor_s;
    }
    /**
     * Method return weight of Cucumber
     * @return cucumberWeight
     */
    public int getMass(){
return cucumberWeight;
    }
    /**
     * Method set Cucumber weight
     * @param <code>cucumberWeight_t</code> the Cucumber weight
     */
    public void setMass(int cucumberWeight_t){
        cucumberWeight = cucumberWeight_t;
    }
    /**
     * Method compare objects type Data
     * @param <code>p</code> the weight of object
     */
public int compareTo(Data p){
    Integer h = cucumberWeight;
    return h.compareTo(p.getMass());
}
/**
 * Method print information about Cucumber
 */
public void print(){
    System.out.println("Type: Cucumber, Color: " + cucumberColor + ", Weight: " + cucumberWeight + " grams\n"); 
}
}

