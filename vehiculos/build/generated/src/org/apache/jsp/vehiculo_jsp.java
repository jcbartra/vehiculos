package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import negocio.*;
import entidad.*;
import java.util.ArrayList;

public final class vehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");

    marca m=new marca();
    tipo_moneda tm=new tipo_moneda();
    
    n_marcas nm=new n_marcas();
    n_tipo_moneda ntm=new n_tipo_moneda();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("      <table border=\"1\" align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"4\">REGISTRO DE VEHÍCULOS</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>MODELO</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><input type=\"text\" name=\"t_modelo\" id=\"t_modelo\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>MARCA</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><select name=\"l_marca\" id=\"l_marca\">\n");
      out.write("            <option>SELECCIONAR</option>\n");
      out.write("            ");

                nm.setM(m);
                ArrayList lm=nm.buscar_marcas();
                for(int x=0; x<lm.size(); x++)
                {
                    marca mc=(marca) lm.get(x);
                    
            
      out.write(" \n");
      out.write("            <option value=\"");
      out.print(mc.getMarca_id());
      out.write('"');
      out.write('>');
      out.print(mc.getMarca());
      out.write("</option>\n");
      out.write("            ");
        
                }
            
      out.write("\n");
      out.write("          </select></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>PLACA</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><input type=\"text\" name=\"t_placa\" id=\"t_placa\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>PRECIO</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><select name=\"l_moneda\" id=\"l_moneda\">\n");
      out.write("            <option>SELECCIONAR</option>\n");
      out.write("            ");

                ntm.setTm(tm);
                ArrayList lmd=ntm.buscar_moneda();
                for(int z=0; z<lmd.size(); z++)
                {
                    tipo_moneda tmd=(tipo_moneda) lmd.get(z);
            
      out.write(" \n");
      out.write("            <option value=\"");
      out.print(tmd.getTipo_moneda_id());
      out.write('"');
      out.write('>');
      out.print(tmd.getSimbolo());
      out.write("</option>\n");
      out.write("            ");
        
                }
            
      out.write("\n");
      out.write("          </select></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><input type=\"text\" name=\"t_precio\" id=\"t_precio\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>AIRE<BR />\n");
      out.write("            ACONDICIONADO</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><table border=\"0\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("              <td>SI\n");
      out.write("                <input type=\"radio\" name=\"r_aire\" id=\"radio\" value=\"radio\"></td>\n");
      out.write("              <td><input type=\"radio\" name=\"r_aire\" id=\"radio2\" value=\"radio\">\n");
      out.write("                NO</td>\n");
      out.write("            </tr>\n");
      out.write("          </table></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>CARACTERÍSTICAS</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>LUNA<BR />\n");
      out.write("            POLARIZ.</td>\n");
      out.write("          <td><input type=\"checkbox\" name=\"c_luna\" id=\"c_luna\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>GPS</td>\n");
      out.write("          <td><input type=\"checkbox\" name=\"c_gps\" id=\"c_gps\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>SONIDO</td>\n");
      out.write("          <td><input type=\"checkbox\" name=\"c_sonido\" id=\"c_sonido\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"3\" align=\"center\"><input type=\"submit\" name=\"action\" id=\"action\" value=\"Enviar\"></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
