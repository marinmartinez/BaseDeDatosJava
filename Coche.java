package BasesdeDatos;

public class Coche {
private String model;
private String brand;
private String color;
public String getColor() {
	return color;
}
private int maxSpeed;
private double weight;
private boolean repaired;
private String damage;

public Coche(String model,String color, int maxSpeed, double weight, String damage) {
	super();
	this.model = model;
	this.color=color;
	this.maxSpeed = maxSpeed;
	this.weight = weight;
	this.damage = damage;
	repaired=false;
}




public boolean isRepaired() {
	return repaired;
}




public String getDamage() {
	return damage;
}




public Coche() {
	
	
	
}




public String getModel() {
	return model;
}
public String getBrand() {
	return brand;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public double getWeight() {
	return weight;
}






}
