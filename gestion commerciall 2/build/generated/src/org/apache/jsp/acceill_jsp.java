package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acceill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <style>\n");
      out.write("            .container{\n");
      out.write("                display: grid ;\n");
      out.write("                grid-template-columns: 150px 1050px;\n");
      out.write("                grid-auto-rows: 70px 500px;\n");
      out.write("                grid-row-gap : 4px;\n");
      out.write("                grid-column-gap: 4px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .box{\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("                \n");
      out.write("            .item2 {\n");
      out.write("                background-color: cornflowerblue;\n");
      out.write("                grid-column-start:1;\n");
      out.write("                grid-column-end:2;\n");
      out.write("                grid-row-start:1;\n");
      out.write("                grid-row-end:3;\n");
      out.write("                text-align: center;\n");
      out.write("                padding-top: 70px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                border: 1px solid white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item2 a {\n");
      out.write("                margin-top:  40px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item1 {\n");
      out.write("                background-color: chocolate;\n");
      out.write("                grid-column-start:2;\n");
      out.write("                grid-column-end:3;\n");
      out.write("                height: 50px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item1 a:not(:last-child) {\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item1 .link.active {\n");
      out.write("                border: 2px solid white;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                animation: borderAnimation 0.5s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes borderAnimation {\n");
      out.write("                0% {\n");
      out.write("                    transform: scale(1);\n");
      out.write("                }\n");
      out.write("                50% {\n");
      out.write("                    transform: scale(1.2);\n");
      out.write("                }\n");
      out.write("                100% {\n");
      out.write("                    transform: scale(1);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .item3 {\n");
      out.write("                background-color: azure;\n");
      out.write("                grid-column-start:2;\n");
      out.write("                grid-column-end:3;\n");
      out.write("                margin-top:3px;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            function chargerContenu(page) {\n");
      out.write("                var xhttp = new XMLHttpRequest();\n");
      out.write("                xhttp.onreadystatechange = function() {\n");
      out.write("                    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("                        document.getElementById(\"content\").innerHTML = this.responseText;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhttp.open(\"GET\", page + \".html\", true);\n");
      out.write("                xhttp.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function chargerContenuServlet(servlet) {\n");
      out.write("                var xhttp = new XMLHttpRequest();\n");
      out.write("                xhttp.onreadystatechange = function() {\n");
      out.write("                    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("                        document.querySelector('.item3').innerHTML = this.responseText;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhttp.open(\"GET\", servlet, true);\n");
      out.write("                xhttp.send();\n");
      out.write("\n");
      out.write("                // Ajouter la classe active au lien cliqué\n");
      out.write("                var links = document.querySelectorAll('.item1 .link');\n");
      out.write("                links.forEach(function(link) {\n");
      out.write("                    link.classList.remove('active');\n");
      out.write("                });\n");
      out.write("                event.target.classList.add('active');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box item1\">\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenuServlet('ClientsServlet')\" class=\"link\">clients</a>\n");
      out.write("                <a>|</a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenuServlet('ArticlesServlet')\" class=\"link\">articles</a>\n");
      out.write("                <a>|</a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenuServlet('FacturesServlet')\" class=\"link\">factures</a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\">se deconecter</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box item2\">\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterClient')\">ajouter client</a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterArticle')\">ajouter article</a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterFacturee')\">ajouter facture</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box item3\" id=\"content\">\n");
      out.write("            ");

               session = request.getSession();
             Boolean deletionSuccess = (Boolean) session.getAttribute("deletionSuccess");
            if (deletionSuccess != null && deletionSuccess) { 
      out.write("\n");
      out.write("          <h2>Client supprimé avec succès</h2>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
