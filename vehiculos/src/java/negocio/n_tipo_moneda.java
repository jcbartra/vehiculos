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
public class n_tipo_moneda {
    
    DBConn tran=null;
    Connection conn=null;
    String qry;//almacena la transacción
    public static int val;//definir si la transacción tuvo éxito
    
    tipo_moneda tm=new tipo_moneda();

    public n_tipo_moneda() {
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

    public tipo_moneda getTm() {
        return tm;
    }

    public void setTm(tipo_moneda tm) {
        this.tm = tm;
    }
    
    
    public ArrayList buscar_moneda()
     {
         ArrayList consulta=new ArrayList();
        try
        {
           int i=0;
           conn=tran.getConnection();
           conn.setAutoCommit(false);
           qry="select id,simbolo from moneda";
           PreparedStatement ps= conn.prepareStatement(qry);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
                   {
                       tipo_moneda tmd=new tipo_moneda();
                       tmd.setTipo_moneda_id(rs.getString("id"));
                       tmd.setSimbolo(rs.getString("simbolo"));
                       consulta.add(tmd);
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
