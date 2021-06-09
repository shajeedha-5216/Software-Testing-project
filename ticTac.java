package TTT.TicTacToe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ticTac {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("https://selenium-apps.doselect.in/tic-tac-toe/");
		
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[1]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[2]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[5]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[9]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[7]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[4]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[3]")).click();
		System.out.println("X Wins");
		
		
		w.findElement(By.id("reset-game")).click();
		
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[1]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[5]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[9]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[7]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[8]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[3]")).click();
		System.out.println("O Wins");
		
		w.findElement(By.id("reset-game")).click();
		
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[1]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[5]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[9]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[7]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[3]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[2]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[8]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[6]")).click();
		w.findElement(By.xpath("//body/div[1]/ul[1]/li[4]")).click();
		
		w.findElement(By.id("reset-game")).click();
		
		w.close();

	}

}
