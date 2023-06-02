package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            .container{\n");
      out.write("                display: grid ;\n");
      out.write("                grid-template-columns: 15% 75% ;\n");
      out.write("                grid-auto-rows: 50px 500px ;\n");
      out.write("                grid-row-gap : 4px;\n");
      out.write("                grid-column-gap:4px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .box{\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            .item2 {\n");
      out.write("                background-color: dodgerblue;\n");
      out.write("                grid-column-start:1;\n");
      out.write("                grid-column-end:2;\n");
      out.write("                grid-row-start:1;\n");
      out.write("                grid-row-end:3;\n");
      out.write("                text-align: center;\n");
      out.write("                padding-top: 70px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .item2 a{\n");
      out.write("            margin-top:  40px; /* Add right margin between words */\n");
      out.write("        }\n");
      out.write("            .item1{\n");
      out.write("                background-color: tomato;\n");
      out.write("                grid-column-start:2;\n");
      out.write("                grid-column-end:3;\n");
      out.write("                height: 50px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction:row;\n");
      out.write("                align-items: center; /* Align items vertically in the center */\n");
      out.write("                justify-content: space-between; /* Move items to the ends of the container */\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid white;\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .item1 a:not(:last-child){\n");
      out.write("            margin-right: 10px; /* Add right margin between words */\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            .item3{\n");
      out.write("                background-color: blueviolet;  \n");
      out.write("                grid-column-start:2;\n");
      out.write("                grid-column-end:3;\n");
      out.write("                margin-top:3px;\n");
      out.write("              \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box item1\">\n");
      out.write("                <a href=\"#\"style=\"color: white;\">clients </a>\n");
      out.write("                \n");
      out.write("                <a> |</a>\n");
      out.write("                <a href=\"#\"style=\"color: white;\">articles </a>\n");
      out.write("               \n");
      out.write("                <a> |</a>\n");
      out.write("               <a href=\"#\" style=\"color: white;\"> factures </a>\n");
      out.write("               <a href=\"#\" style=\"color: white;\"> se deconecter</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box item2\">\n");
      out.write("                <a href=\"#\" style=\"color: white;\"> ajouter client </a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\">ajouter article </a>\n");
      out.write("                <a href=\"#\" style=\"color: white;\"> ajouter facture </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box item3\">content</div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ajouterClient.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
