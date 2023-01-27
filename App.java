package BasesdeDatos;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
	Taller taller=new Taller();
	taller.launch();
     try {
		CocheDAO conexion=new CocheDAO();
		conexion.connect();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
