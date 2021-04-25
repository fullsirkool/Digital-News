package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <div class=\"tittle\">\n");
      out.write("                        Marketing security ABC XYZ\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"image\">\n");
      out.write("                        <img src=\"data images/i1.jpg\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        Mùa xuân vừa đến hoa về trên những bàn tay\n");
      out.write("                        Và em vừa đến thay màu áo mới vì anh\n");
      out.write("                        Nguyện cho ngày tháng êm đềm như những sớm mai\n");
      out.write("                        Những nhọc nhằn chớm quen\n");
      out.write("                        Vẫn trong ngần mắt em đang nhìn về anh.\n");
      out.write("                        Và anh lại nhớ những giờ em đứng chờ trông\n");
      out.write("                        Một mình lặng lẽ ướt lạnh trong mưa vì anh\n");
      out.write("                        Tình yêu tìm thấy nguyên vẹn sau đêm bão giông\n");
      out.write("                        Giữa hoang tàn lãng quên\n");
      out.write("                        Nơi cuối đường có em riêng chờ đợi anh.\n");
      out.write("                        Như chưa từng có những phút lìa xa\n");
      out.write("                        Giấu gương mặt trên vai anh khóc òa\n");
      out.write("                        Những con đường anh đi rồi cũng đưa anh về bên em.\n");
      out.write("                        Như anh được sống giây phút đầu tiên\n");
      out.write("                        Có em tận đến những giây cuối cùng\n");
      out.write("                        Suốt cuộc đời em không quên chân tình dành hết cho anh.\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"signature\">\n");
      out.write("                        <div class=\"icon1\"></div>\n");
      out.write("                        <div class=\"icon2\"></div>\n");
      out.write("                        By author | Date\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Right.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
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
