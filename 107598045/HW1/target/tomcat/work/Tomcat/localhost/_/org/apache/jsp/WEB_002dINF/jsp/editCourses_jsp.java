/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-27 10:27:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editCourses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>修改課程</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"large ui inverted violet button\" onclick=\"location.href = '/listAllCourses'\">返回課程列表</button>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"ui grid\" align=\"center\">    ");
      out.write("\r\n");
      out.write("    <div class=\"two wide column\"></div>    ");
      out.write("\r\n");
      out.write("    <div class=\"twelve wide column\">\r\n");
      out.write("        <form name=\"\" action=\"editCourses\" method=\"POST\">\r\n");
      out.write("            <table class=\"ui center aligned seven teal table\" border=\"2\">  ");
      out.write("\r\n");
      out.write("                <input type=\"hidden\" class=\"form-control\" id=\"course_id\" name=\"course_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"必填欄位\" readonly=\"readonly\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>課程名稱</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <i class=\"attention icon\"></i>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"course_name\" name=\"course_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>課程說明</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"course_detail\" name=\"course_detail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_detail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>適合對象</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"course_suit_people\" name=\"course_suit_people\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_suit_people}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>定價</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <label for=\"course_price\" class=\"ui label\">NT</label>\r\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"course_price\" name=\"course_price\" size=\"15\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" min=\"0\" step=\"1\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>注意事項</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"course_notes\" name=\"course_notes\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_notes}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>備註</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div class=\"ui input\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"course_remark\" name=\"course_remark\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course_remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <input type=\"submit\" class=\"ui inverted green button\" onclick=\"{ if(confirm('確定修改嗎?')){ return true; }return false; }\" value=\"修改確定\" />\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
