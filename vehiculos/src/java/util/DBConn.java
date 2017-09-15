package util;

import java.sql.*;



public class DBConn {

  	Connection conn;
	String str_driver;	
	
	
	public DBConn() {
	//	this.str_driver=JNDINames.STRING_DRIVER;		
	}


	public DBConn(String str_driver) {
		this.str_driver	= str_driver;		
	}
	
  	public Connection getConnection() throws SQLException, Exception {

  	        try{
	             //String sc="jdbc:postgresql://"+"127.0.0.1:5432"+"/"+crypt.decrypt(str_driver);
                 String sc="jdbc:oracle:thin:vehiculo/1234@localhost:1521:xe";       
			     DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                 conn = DriverManager.getConnection(sc); 
	        
	        System.out.println("Coneccion Satisfactoria...!!!");
		
			return conn;
						
	    }catch(SQLException e){
    		throw new SQLException("Connect.getConnection "+e.getMessage()+" Intenta de nuevo");
	    }catch(Exception e){
    		throw new Exception("Connect.getConnection "+e.getMessage());
	    }
  	}

	public String close() throws SQLException {
    	try{
       		if(conn!=null) {
       			conn.close(); System.out.println("Cerrar Coneccion...");
       		}
       		return "Close Connection.";
       	}catch(SQLException e){
    		throw new SQLException("Connect.close "+e.getMessage());
    	}
  	}

	public static void main(String[] args) {
		
	  	DBConn sql=new DBConn( );
	  	try{
	  		sql.getConnection();
	  		sql.close();
	  	}catch(SQLException e){		System.out.println("e2:"+ e.getMessage() );
	  	}catch(Exception e){ 		System.out.println("e1:"+e.getMessage() );
	  	}
	  	
	}
}
