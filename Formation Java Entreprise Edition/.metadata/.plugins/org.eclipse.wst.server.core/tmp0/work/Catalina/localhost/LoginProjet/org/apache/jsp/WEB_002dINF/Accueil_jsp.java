/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-08-02 10:58:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dz.LoginProjet.bean.Inscription;

public final class Accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		Inscription s = (Inscription) request.getAttribute("ids");
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.print("<br>");
      out.write("\r\n");
      out.write("\t<b style=\"text-align: center;\"> ");
      out.print("Bonjour ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids.civilite}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.print(" ");
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.print(" ");
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.print("<br>");
      out.write(' ');

 	String message = (String) request.getAttribute("m");
 	if (message != null)
 		out.print(message);
 
      out.write("\r\n");
      out.write("\t</b>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("Téléphone: ");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print("Prérequis: ");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids.question}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');

		String message2 = (String) request.getAttribute("msg");
		if (message2 != null)

			out.print(message2);
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("Les papiers necessaires sont: photos d'identite/Photocopie piece didentite/Extrait de naissance");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("Le prix de la formation est : 800 DA");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print("<br>");
      out.print("<br>");
      out.write("\r\n");
      out.write("\t<b style=\"font-weight: bold;\"> ");
      out.print("Pour plus dinformations appelez le 034 19 40 46");
      out.write("\r\n");
      out.write("\t</b>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
