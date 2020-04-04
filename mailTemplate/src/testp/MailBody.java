/**
 * 
 */
package testp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Anupam Biswas
 * 2020-04-04 18:52:06.228
 */

@WebServlet("/mail")
public class MailBody extends HttpServlet{
	@Override
	   protected void doGet(HttpServletRequest request,
	                        HttpServletResponse response)
	                        throws ServletException, IOException {

	       PrintWriter pr = response.getWriter();
	       StringBuffer sb = new StringBuffer();
	       sb.append("<!DOCTYPE html>\n" + 
	       		"<html>\n" + 
	       		"<head>\n" + 
	       		"<meta charset=\"UTF-8\">\n" + 
	       		"<title>Insert title here</title>\n" + 
	       		"<style type=\"text/css\">\n" + 
	       		"body {\n" + 
	       		"	margin: 0 !important;\n" + 
	       		"	padding: 0 !important;\n" + 
	       		"	-webkit-text-size-adjust: 100% !important;\n" + 
	       		"	-ms-text-size-adjust: 100% !important;\n" + 
	       		"	-webkit-font-smoothing: antialiased !important;\n" + 
	       		"}\n" + 
	       		"table.report {\n" + 
	       		"  font-family: 'Arial';\n" + 
	       		"  margin: 25px auto;\n" + 
	       		"  border-collapse: collapse;\n" + 
	       		"  border: 1px solid #eee;\n" + 
	       		"  border-bottom: 2px solid #cfd4d4;\n" + 
	       		"  box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1), 0px 10px 20px rgba(0, 0, 0, 0.05), 0px 20px 20px rgba(0, 0, 0, 0.05), 0px 30px 20px rgba(0, 0, 0, 0.05);\n" + 
	       		"}\n" + 
	       		"\n" + 
	       		"\n" + 
	       		"table th.report, table td.report{\n" + 
	       		"  color: #999;\n" + 
	       		"  border: 1px solid #eee;\n" + 
	       		"  padding: 12px 35px;\n" + 
	       		"  border-collapse: collapse;\n" + 
	       		"}\n" + 
	       		"\n" + 
	       		"table th.report{\n" + 
	       		"  background: #cfd4d4;\n" + 
	       		"  color: #171515;\n" + 
	       		"  text-transform: uppercase;\n" + 
	       		"  font-size: 12px;\n" + 
	       		"}\n" + 
	       		"\n" + 
	       		"</style>\n" + 
	       		"</head>\n" + 
	       		"<body>\n" + 
	       		"<table>\n" + 
	       		"	<tbody>\n" + 
	       		"    <tr>\n" + 
	       		"      <td>\n" + 
	       		"      <table>\n" + 
	       		"      	<tbody>\n" + 
	       		"      		<tr><td>&nbsp;</td></tr>\n" + 
	       		"      		<tr><td>Hi Team,</td></tr>    		\n" + 
	       		"    		<tr><td>&nbsp;</td></tr>\n" + 
	       		"     		<tr>\n" + 
	       		"      			<td>Please Find the Status for Today</td>\n" + 
	       		"    		</tr>\n" + 
	       		"      	</tbody>\n" + 
	       		"      </table>\n" + 
	       		"	</td>\n" + 
	       		"    </tr>\n" + 
	       		"     <tr>\n" + 
	       		"      <td>\n" + 
	       		"      <table class=\"report\">\n" + 
	       		"		  <thead>\n" + 
	       		"		    <tr>\n" + 
	       		"		      <th class=\"report\">Header</th>\n" + 
	       		"		      <th class=\"report\">Header</th>\n" + 
	       		"		      <th class=\"report\">Header</th>\n" + 
	       		"		      <th class=\"report\">Header</th>\n" + 
	       		"		    </tr>\n" + 
	       		"		  </thead>\n" + 
	       		"		  <tbody>\n" + 
	       		"		    <tr>\n" + 
	       		"		      <td class=\"report\">Item</td>\n" + 
	       		"		      <td class=\"report\">Item</td>\n" + 
	       		"		      <td class=\"report\">Item</td>\n" + 
	       		"		      <td class=\"report\">Item</td>\n" + 
	       		"		    </tr>\n" + 
	       		"		  </tbody>\n" + 
	       		"		</table>\n" + 
	       		"      </td>\n" + 
	       		"    </tr>\n" + 
	       		"    <tr><td>&nbsp;</td></tr>\n" + 
	       		"    <tr><td>&nbsp;</td></tr>\n" + 
	       		"    <tr>\n" + 
	       		"    	<td>\n" + 
	       		"    		<table>\n" + 
	       		"    			<tbody>\n" + 
	       		"		      		<tr>\n" + 
	       		"		      			<td>Thanks,</td>\n" + 
	       		"		    		</tr>\n" + 
	       		"		     		<tr>\n" + 
	       		"		      			<td>Ami</td>\n" + 
	       		"		    		</tr>\n" + 
	       		"		      	</tbody>\n" + 
	       		"    		</table>\n" + 
	       		"    	</td>\n" + 
	       		"    </tr>\n" + 
	       		"  </tbody>\n" + 
	       		"</table>\n" + 
	       		"\n" + 
	       		"</body>\n" + 
	       		"</html>");
	       pr.print(sb);

	   }
}
