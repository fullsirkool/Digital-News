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
      out.write("                        M??a xu??n v???a ?????n hoa v??? tr??n nh???ng b??n tay\n");
      out.write("                        V?? em v???a ?????n thay m??u ??o m???i v?? anh\n");
      out.write("                        Nguy???n cho ng??y th??ng ??m ?????m nh?? nh???ng s???m mai\n");
      out.write("                        Nh???ng nh???c nh???n ch???m quen\n");
      out.write("                        V???n trong ng???n m???t em ??ang nh??n v??? anh.\n");
      out.write("                        V?? anh l???i nh??? nh???ng gi??? em ?????ng ch??? tr??ng\n");
      out.write("                        M???t m??nh l???ng l??? ?????t l???nh trong m??a v?? anh\n");
      out.write("                        T??nh y??u t??m th???y nguy??n v???n sau ????m b??o gi??ng\n");
      out.write("                        Gi???a hoang t??n l??ng qu??n\n");
      out.write("                        N??i cu???i ???????ng c?? em ri??ng ch??? ?????i anh.\n");
      out.write("                        Nh?? ch??a t???ng c?? nh???ng ph??t l??a xa\n");
      out.write("                        Gi???u g????ng m???t tr??n vai anh kh??c ??a\n");
      out.write("                        Nh???ng con ???????ng anh ??i r???i c??ng ????a anh v??? b??n em.\n");
      out.write("                        Nh?? anh ???????c s???ng gi??y ph??t ?????u ti??n\n");
      out.write("                        C?? em t???n ?????n nh???ng gi??y cu???i c??ng\n");
      out.write("                        Su???t cu???c ?????i em kh??ng qu??n ch??n t??nh d??nh h???t cho anh.\n");
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
