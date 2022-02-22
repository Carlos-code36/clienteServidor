/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteservidor;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author compu1
 */
public class DB {
    // - - - - - - - - - - - - - - - - - - - - - -
	// Constantes
	// - - - - - - - - - - - - - - - - - - - - - -
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/vacunas";
	public static final String USUARIO = "root";
	public static final String PASSWORD = "";
	
	// - - - - - - - - - - - - - - - - - - - - - -
	// Atributos
	// - - - - - - - - - - - - - - - - - - - - - -
	private String url;
	private String usuario;
	private String password;
	private Connection conexion;
	
	// - - - - - - - - - - - - - - - - - - - - - -
	// Métodos
	// - - - - - - - - - - - - - - - - - - - - - -
	/**
	* El constructor de la clase FachadaBD
	*/
	public DB(){
	url = URL;
	usuario = USUARIO;
	password = PASSWORD;
	conexion = null;
	}
	
	public Connection conectar() throws SQLException,ClassNotFoundException{
	Class.forName(DRIVER);
	conexion = (Connection) DriverManager.getConnection(url,usuario,password);
	return conexion;
	}
	
	public void desconectar(Connection laConexion) throws SQLException{
	laConexion.close();
	}
                               
    
}
