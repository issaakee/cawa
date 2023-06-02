package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AjouterLigneFactures_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("          /* Styles généraux */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                color: #333;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                color: #666;\n");
      out.write("                font-size: 18px;\n");
      out.write("                margin-top: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                display: block;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"],\n");
      out.write("            input[type=\"date\"],\n");
      out.write("            input[type=\"number\"],\n");
      out.write("            select {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 8px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Styles spécifiques au formulaire des lignes de la facture */\n");
      out.write("            form {\n");
      out.write("                margin: 0 auto;\n");
      out.write("                margin-top: 40px;\n");
      out.write("                width: 300px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1>Ajouter des lignes de facture</h1>\n");
      out.write("\n");
      out.write("        <h2>Lignes de la facture</h2>\n");
      out.write("        <form action=\"ajouterLigneFactureServlet\" method=\"post\">\n");
      out.write("            <label for=\"ref_article\">Réf. article:</label>\n");
      out.write("            <select id=\"ref_article\" name=\"ref_article\">\n");
      out.write("                <option value=\"\">Sélectionnez une référence d'article</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"numero_facture_ligne\">N° de facture:</label>\n");
      out.write("            <input type=\"text\" id=\"numero_facture_ligne\" name=\"numero_facture_ligne\"><br>\n");
      out.write("\n");
      out.write("            <label for=\"quantite_vendue\">Quantité vendue:</label>\n");
      out.write("            <input type=\"number\" id=\"quantite_vendue\" name=\"quantite_vendue\" required><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Ajouter une ligne\">\n");
      out.write("             </form>\n");
      out.write("    </body>\n");
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
