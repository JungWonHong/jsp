/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-08-03 15:05:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.semi.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PMemberJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<script src=\"./js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"./js/pmjoin.js\" charset=\"euc-kr\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function openConfirmPid(PMemeberJoinform){\r\n");
      out.write("   var id=PMemeberJoinform.p_id.value;\r\n");
      out.write("   var url=\"./MemberIdCheckAction.com?p_id=\" + PMemeberJoinform.p_id.value;\r\n");
      out.write("   \r\n");
      out.write("   if(id.length ==0){\r\n");
      out.write("      alert(\"아이디를 입력하세요.\");\r\n");
      out.write("      PMemeberJoinform.e_id.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   open(url, \"comfirm\", \"toobar=no, location=no, status=no, menubar=no,\" +\r\n");
      out.write("         \"scrollbar=no, resizable=no, width=400, height=200\");\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"./css/top.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"./css/board.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("input[type=text] {\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 1px solid silver;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=password] {\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 1px solid silver;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: 'Lato', sans-serif;\r\n");
      out.write("\tbackground: #353535;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {text-align:left;}\r\n");
      out.write("\r\n");
      out.write("tr, table td {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button] {\r\n");
      out.write("\tbackground-color: #F7CA18;\r\n");
      out.write("\toutline: 1;\r\n");
      out.write("\tborder: 1px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tmargin: 2px;\r\n");
      out.write("}\r\n");
      out.write("/* \r\n");
      out.write("table {\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("}\r\n");
      out.write(" */\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>개인 회원 로그인</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "JoinHeader.jsp", out, false);
      out.write("\r\n");
      out.write("<form name = \"PMemeberJoinform\" action = \"pjoinProcess.com\" method = \"post\">\r\n");
      out.write("<h2>개인 회원</h2>\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>이름</td>\r\n");
      out.write("    <td><input type = \"text\" name = \"p_name\" id=\"p_name\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td>나이</td>\r\n");
      out.write("    <td><input type = \"text\" name = \"p_age\" id=\"p_age\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>ID</td>\r\n");
      out.write("    <td><input type = \"text\" name = \"p_id\" id=\"p_id\">\r\n");
      out.write("    <input type = \"button\" name = \"confirm_id\" id=\"confirm_id\" value = \"ID중복검사\"\r\n");
      out.write("    onclick = \"openConfirmPid(this.form)\">\r\n");
      out.write("    <input type = \"hidden\" value=\"idDuplication\" value = \"idUncheck\">\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>P/W</td>\r\n");
      out.write("    <td><input type = \"password\" name = \"p_pw\" id=\"p_pw\" placeholder=\"8자리 이상\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>P/W CHECK</td>\r\n");
      out.write("    <td><input type = \"password\" name = \"pw_check\" id=\"pw_check\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>휴대폰번호</td>\r\n");
      out.write("    <td><input type = \"text\" name = \"p_hp\" id=\"p_hp\"> -\r\n");
      out.write("        <input type = \"text\" name = \"p_hp2\" id=\"p_hp2\"> -\r\n");
      out.write("        <input type = \"text\" name = \"p_hp3\" id=\"p_hp3\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>email</td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input type='text' name=\"p_email\" id=\"p_email\">@\r\n");
      out.write("      <input type='text' name=\"email_dns\" id=\"email_dns\">\r\n");
      out.write("              <select name=\"emailaddr\" id=\"emailaddr\">\r\n");
      out.write("                 <option value=\"\">직접입력</option>\r\n");
      out.write("                 <option value=\"daum.net\">daum.net</option>\r\n");
      out.write("                 <option value=\"empal.com\">empal.com</option>\r\n");
      out.write("                 <option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("                 <option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("                 <option value=\"msn.com\">msn.com</option>\r\n");
      out.write("                 <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("                 <option value=\"nate.com\">nate.com</option>\r\n");
      out.write("              </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td colspan = \"2\" align = center>\r\n");
      out.write("      <a id=\"pjoin\" href = \"javascript:PMemeberJoinform.submit()\">회원가입</a>\r\n");
      out.write("      &nbsp;&nbsp;\r\n");
      out.write("      <a href = \"javascript:PMemeberJoinform.reset()\">다시작성</a>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Footer.jsp", out, false);
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
