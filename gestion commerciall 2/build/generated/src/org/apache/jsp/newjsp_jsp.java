package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .container{\r\n");
      out.write("                display: grid ;\r\n");
      out.write("                grid-template-columns: 150px 999px  ;\r\n");
      out.write("                grid-auto-rows: 70px 600px ;\r\n");
      out.write("                grid-row-gap : 4px;\r\n");
      out.write("                grid-column-gap:4px;\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .box{\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("            .item2 {\r\n");
      out.write("                background-color: slateblue;\r\n");
      out.write("                grid-column-start:1;\r\n");
      out.write("                grid-column-end:2;\r\n");
      out.write("                grid-row-start:1;\r\n");
      out.write("                grid-row-end:3;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding-top: 70px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                border: 1px solid white;\r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            .item2 a{\r\n");
      out.write("            margin-top:  40px; /* Add right margin between words */\r\n");
      out.write("        }\r\n");
      out.write("            .item1{\r\n");
      out.write("                background-color: inactivecaptiontext;\r\n");
      out.write("                grid-column-start:2;\r\n");
      out.write("                grid-column-end:3;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-direction:row;\r\n");
      out.write("                align-items: center; /* Align items vertically in the center */\r\n");
      out.write("                justify-content: space-between; /* Move items to the ends of the container */\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                border: 1px solid white;\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            .item1 a:not(:last-child){\r\n");
      out.write("            margin-right: 5px; /* Add right margin between words */\r\n");
      out.write("        }\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("            .item3{\r\n");
      out.write("                background-color: beige;  \r\n");
      out.write("                grid-column-start:2;\r\n");
      out.write("                grid-column-end:3;\r\n");
      out.write("                margin-top:3px;\r\n");
      out.write("              \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"box item1\">\r\n");
      out.write("                <a href=\"#\" style=\"color: white;\">clients </a>\r\n");
      out.write("                \r\n");
      out.write("                <a> |</a>\r\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('afficherClients')\">articles </a>\r\n");
      out.write("               \r\n");
      out.write("                <a> |</a>\r\n");
      out.write("               <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('afficherArticles')\"> factures </a>\r\n");
      out.write("               <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('afficherFactures')\"> se deconecter</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box item2\">\r\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterClient')\" > ajouter client </a>\r\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterArticle')\">ajouter article </a>\r\n");
      out.write("                <a href=\"#\" style=\"color: white;\" onclick=\"chargerContenu('ajouterFacture')\"> ajouter facture </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box item3\" id=\"content\">\r\n");
      out.write("           \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           <script>\r\n");
      out.write("   function chargerContenu(formulaire) {\r\n");
      out.write("            var xhr = new XMLHttpRequest();\r\n");
      out.write("            xhr.onreadystatechange = function() {\r\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\r\n");
      out.write("                    var contentElement = document.getElementById(\"content\");\r\n");
      out.write("                    contentElement.innerHTML = xhr.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            xhr.open(\"GET\", formulaire + \".jsp\", true);\r\n");
      out.write("            xhr.send();\r\n");
      out.write("        }\r\n");
      out.write("       </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
