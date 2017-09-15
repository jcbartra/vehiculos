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
public class n_marcas {
    
    DBConn tran=null;
    Connection conn=null;
    String qry;//almacena la transacción
    public static int val;//definir si la transacción tuvo éxito
    
    marca m=new marca();

    public n_marcas() {
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

    public marca getM() {
        return m;
    }

    public void setM(marca m) {
        this.m = m;
    }
    
            
            
     public ArrayList buscar_marcas()
     {
         ArrayList consulta=new ArrayList();
        try
        {
           int i=0;
           conn=tran.getConnection();
           conn.setAutoCommit(false);
           qry="select id,marca from tip_marca";
           PreparedStatement ps= conn.prepareStatement(qry);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
                   {
                       marca mc=new marca();
                       mc.setMarca_id(rs.getString("id"));
                       mc.setMarca(rs.getString("marca"));
                       consulta.add(mc);
                   }
           rs.close();
           ps.close();
           conn.close(); 
           /*
           for(int n=0;n<consulta.size();n++){
                   auto aus= (auto) consulta.get(n);
           }*/
        }
         catch(SQLException e){
                     try{
                    conn.rollback();
                    setMError(e.getMessage()+"<br>Transaction is being rolled back");
                    }
                    catch(SQLException e2)
                    {
                        setMError(e.getMessage());
                    }
              }
             catch(Exception e){
                    System.out.println(e.getMessage());
                    setMError(e.getMessage());
             }
             finally{
                    try{if(conn!=null) conn.close();}
                    catch(SQLException e){setMError(e.getMessage());}
             }
        return consulta;
     }
    
}
