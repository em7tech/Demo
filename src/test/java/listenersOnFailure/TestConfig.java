package listenersOnFailure;
public class TestConfig{


	//MAIL CONFIGURATION 
	public static String server="smtp.gmail.com";
	public static String from = "emranshow007@gmail.com";
	public static String password = "alalim6785@";
	public static String[] to ={"techem7.qa@gmail.com","babussalam.qe@gmail.com"};
	public static String subject = "Extent Project Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath=System.getProperty("user.dir")+"\\Reports.zip";
	public static String attachmentName="reports.zip";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "allahalmighty6785";
	public static String mysqlurl = "jdbc:mysql://localhost:1433/emdb";
	
	
	
	
	
	
	
	
	
}
