package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            /* styles.css */\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\theight: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-image img {\n");
      out.write("\twidth: 200px;\n");
      out.write("\theight: 200px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form {\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form h2 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group label {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input[type=\"text\"],\n");
      out.write(".form-group input[type=\"password\"] {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder: 1px solid #ccc;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input[type=\"submit\"] {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tbackground-color: #4CAF50;\n");
      out.write("\tcolor: white;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("\t\t<div class=\"login-image\">\n");
      out.write("\t\t\t<img src=\"https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.getillustrations.com%2Fpacks%2Fplastic-illustrations-scene-builder-pack%2Fscenes%2F_1x%2Faccounts%2520_%2520man%2C%2520workspace%2C%2520desk%2C%2520laptop%2C%2520login%2C%2520user_md.png&tbnid=kJzTpwk10CmbJM&vet=12ahUKEwjp2szzkYr_AhVMhP0HHZL6ADYQMyhIegUIARCYAQ..i&imgrefurl=https%3A%2F%2Fwww.getillustrations.com%2Fsingle-illustration%2Fman-workspace-desk-laptop-login-user&docid=IqtZhrMOlERdZM&w=650&h=650&q=login%20illustration&hl=en&ved=2ahUKEwjp2szzkYr_AhVMhP0HHZL6ADYQMyhIegUIARCYAQ\" alt=\"login image\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t<h2>Login</h2>\n");
      out.write("\t\t\t<form method=\"POST\" action=\"login.php\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"username\">Username</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Enter your username\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"password\">Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Log In\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
