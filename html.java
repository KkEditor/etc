package db_view;
import javax.swing.*;
public class html {
	
	public static JLabel ret() {
		JLabel s =new JLabel("<html><table>\r\n" + 
				"<tr>\r\n" + 
				"	<td><b>Add User\r\n" + 
				"	</b></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Username:</td>\r\n" + 
				"<td><input type=\"text\" /></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Password:</td>\r\n" + 
				"<td><input type=\"text\" /></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Email:</td>\r\n" + 
				"<td><input type=\"text\" /></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Fullname:</td>\r\n" + 
				"<td><input type=\"text\" /></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Role</td>\r\n" + 
				"<td><input type=\"text\" /></td>\r\n" + 
				"</tr>\r\n" +  
				"<tr><td>Dieu chinh gia</td></tr>\r\n" + 
				"<tr><td>Xe may:</td><td><input type=\"text\" /></td></tr>\r\n" + 
				"<tr><td>O to:</td><td><input type=\"text\" /></td></tr>\r\n" + 
				"</table>\r\n"+
				"</html>");
		return s;
		}
	public static void main(String[] args) {
		String link = "<a href=\"http://abcd.efg.com\" target=\"_blank\">http://abcd.efg.com</a>";
		System.out.print(link);
		System.out.println(ret());
	}
	
}
