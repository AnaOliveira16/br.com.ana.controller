package br.com.ana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuarioController {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.advantageonlineshopping.com/#/");
		
		driver.findElement(By.xpath("menuUser")).click();

	}

}
