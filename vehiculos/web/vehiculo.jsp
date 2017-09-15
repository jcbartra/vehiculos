<%@ page import="negocio.*,entidad.*"%>
<%@ page import= "java.util.ArrayList"%> 
<%
    marca m=new marca();
    tipo_moneda tm=new tipo_moneda();
    
    n_marcas nm=new n_marcas();
    n_tipo_moneda ntm=new n_tipo_moneda();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <form name="form1" method="post" action="">
      <table border="1" align="center">
        <tr>
          <td colspan="4">REGISTRO DE VEHÍCULOS</td>
        </tr>
        <tr>
          <td>MODELO</td>
          <td>&nbsp;</td>
          <td colspan="2"><input type="text" name="t_modelo" id="t_modelo"></td>
        </tr>
        <tr>
          <td>MARCA</td>
          <td>&nbsp;</td>
          <td colspan="2"><select name="l_marca" id="l_marca">
            <option>SELECCIONAR</option>
            <%
                nm.setM(m);
                ArrayList lm=nm.buscar_marcas();
                for(int x=0; x<lm.size(); x++)
                {
                    marca mc=(marca) lm.get(x);
                    
            %> 
            <option value="<%=mc.getMarca_id()%>"><%=mc.getMarca()%></option>
            <%        
                }
            %>
          </select></td>
        </tr>
        <tr>
          <td>PLACA</td>
          <td>&nbsp;</td>
          <td colspan="2"><input type="text" name="t_placa" id="t_placa"></td>
        </tr>
        <tr>
          <td>PRECIO</td>
          <td>&nbsp;</td>
          <td colspan="2"><select name="l_moneda" id="l_moneda">
            <option>SELECCIONAR</option>
            <%
                ntm.setTm(tm);
                ArrayList lmd=ntm.buscar_moneda();
                for(int z=0; z<lmd.size(); z++)
                {
                    tipo_moneda tmd=(tipo_moneda) lmd.get(z);
            %> 
            <option value="<%=tmd.getTipo_moneda_id()%>"><%=tmd.getSimbolo()%></option>
            <%        
                }
            %>
          </select></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td colspan="2"><input type="text" name="t_precio" id="t_precio"></td>
        </tr>
        <tr>
          <td>AIRE<BR />
            ACONDICIONADO</td>
          <td>&nbsp;</td>
          <td colspan="2"><table border="0" align="center">
            <tr>
              <td>SI
                <input type="radio" name="r_aire" id="radio" value="radio"></td>
              <td><input type="radio" name="r_aire" id="radio2" value="radio">
                NO</td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td>CARACTERÍSTICAS</td>
          <td>&nbsp;</td>
          <td>LUNA<BR />
            POLARIZ.</td>
          <td><input type="checkbox" name="c_luna" id="c_luna"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>GPS</td>
          <td><input type="checkbox" name="c_gps" id="c_gps"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>SONIDO</td>
          <td><input type="checkbox" name="c_sonido" id="c_sonido"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="3" align="center"><input type="submit" name="action" id="action" value="Enviar"></td>
        </tr>
      </table>
    </form>
</body>
</html>
