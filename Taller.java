package BasesdeDatos;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Taller {
private boolean running;
Scanner keyboard=new Scanner (System.in);
	
public Taller() {
running=true;
}


public void launch() {

System.out.println("TokioTaller v 0.1");
System.out.println("1 Registrar Vehiculo");
System.out.println("2 Ver vehiculos registrados");
System.out.println("3 Registrar reparacion");
System.out.println("4 ver coches Disponibles");
System.out.println("opcion  :");
String choice=keyboard.nextLine();

//do {
switch (choice) {
case "1":
	addCar();
	break;
case "2":
	viewCars();
	
	break;
case "3":
	viewRepairedCars();
	break;
case "4":
	exit();
	break;
	default:}
	System.out.println("Opcion Incorrecta");//}while(running);



	
}
private void addCar() {
System.out.println("Modelo :");
String model=keyboard.nextLine();
System.out.println("Color :");
String color=keyboard.nextLine();
System.out.println("Peso :");
double peso= Double.parseDouble(keyboard.nextLine());
System.out.println("Velocidad Maxima :");
int velocidad=Integer.parseInt(keyboard.nextLine());
System.out.println("Averia ");
String damage=keyboard.nextLine();
System.out.println("que tal");
Coche car= new Coche(model,color, velocidad,peso,damage);
try {
	CocheDAO carDao= new CocheDAO();
	carDao.addCar(car);
} catch (SQLException e) {
	e.printStackTrace();
	// TODO: handle exception
}

	}

	
	

private void viewCars() {
	try {
		CocheDAO cocheDAO=new CocheDAO();
		List<Coche>allCars=cocheDAO.getCars();
	} catch (SQLException e) {
		// TODO: handle exception
	}

	
}

private void repairCar() {
	
	
	
	
}
private void viewRepairedCars() {
	try {
		CocheDAO cocheDao=new CocheDAO();
		List<Coche>repairedCars=cocheDao.getRepairedCars();
	} catch (Exception e) {
		// TODO: handle exception
	}

	
	
	
	
	
}
private void exit() {
running =false;
}


}
