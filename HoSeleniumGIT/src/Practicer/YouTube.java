package Practicer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Raajakumara songs");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='RAAJAKUMARA | BOMBE HELUTAITHE | PUNEETH RAJKUMAR | V HARIKRISHNA | SANTOSH  |HOMBALE FILMS']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='segmented-like-button']//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading yt-spec-button-shape-next--segmented-start ']")).click();
	}

}
