package BasesdeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CocheDAO {
private Connection connection;
	
public CocheDAO() throws SQLException{
	
connect();
	
	
}
	
	
	
	
	
	
public void addCar(Coche car) throws SQLException {
String sql="INSERT INTO Cars(model,color,max_speed,weight,repaired,damage) VALUES "+
	"(?,?,?,?,?,?)";
PreparedStatement statement=connection.prepareStatement(sql);
statement.setString(1,car.getModel());
statement.setString(2,car.getColor());
statement.setInt(3,car.getMaxSpeed());
statement.setDouble(4, car.getWeight());
statement.setBoolean(5, car.isRepaired());
statement.setString(6, car.getDamage());
statement.executeUpdate();
}
public void connect() {
String url = "jdbc:sqlite:taller.db";

try {
	connection= DriverManager.getConnection(url);
	System.out.println("la conexion funciona");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
public void disconnect() {
try {
	connection.close();
	System.out.println("Desconectado de la base de datos correctamente");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	
}
public List<Coche>   getCars(){
	return null;
	
	
}
public void repairCar(Coche car) {
	
}
public List<Coche>getRepairedCars(){
	return null;
	
	
	
	
}





}
