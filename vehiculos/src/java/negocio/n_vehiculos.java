/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import entidad.*;
import util.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author JcBartra
 */
public class n_vehiculos {
    
    DBConn tran=null;
    Connection conn=null;
    String qry;//almacena la transacción
    public static int val;//definir si la transacción tuvo éxito

    public n_vehiculos() {
        tran=new DBConn();
    }
    
        //sesiones para que genere error
            private String MError= new String();
            public void setMError(String mensaje)
            {MError=mensaje;}
            public String getMError()
            {
           return MError;
            }
    
}
