package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.protocol.Resultset;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host= "localhost";
		String port= "3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "Medrio$520");
		
		Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select Location from Employeeinfo where name='deepak'");
		
		while (rs.next())
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=us");
			
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("Location"));
	}
	}

}