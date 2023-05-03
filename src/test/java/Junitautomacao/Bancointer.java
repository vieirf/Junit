package Junitautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class Bancointer {


	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
    // comando para apontar o driver do navegador
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//comando para indicar o meu drive instanciado
	driver = new ChromeDriver();
	// comando para maximizar a tela 
    driver.manage().window().maximize();
	// comando para indicar o site a ser aberto
	driver.get("https://www.4devs.com.br/gerador_de_pessoas");
	// comando para indicar elemento a ter interação
	driver.findElement(By.id("bt_gerar_pessoa")).click();
	Thread.sleep(5000);
	String nome;
    nome = driver.findElement(By.id("nome")).getText();
    System.out.println(nome);
  
    String cpf;
    cpf = driver.findElement(By.id("cpf")).getText();
    System.out.println(cpf);
    
    String telefone;
    telefone = driver.findElement(By.id("telefone_fixo")).getText();
    System.out.println(telefone);
    
    String email;
    email = driver.findElement(By.id("email")).getText();
    System.out.println(email);
    
    String nascimento;
    nascimento = driver.findElement(By.id("data_nasc")).getText();
    System.out.println(nascimento);
    
    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//comando para indicar o meu drive instanciado
	driver = new ChromeDriver();
	// comando para maximizar a tela 
    driver.manage().window().maximize();
	// comando para indicar o site a ser aberto
	driver.get("https://www.bancointer.com.br/");
	// comando para indicar elemento a ter interação
	driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("nome")).sendKeys(nome);
	driver.findElement(By.id("celular")).sendKeys(telefone);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("cpf")).sendKeys(cpf);
	driver.findElement(By.id("dataNascimento")).sendKeys(nascimento);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
	driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
	Thread.sleep(5000);
	
	
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void ValidacaodoTextoFormulario() throws InterruptedException {
		String texto;
		Thread.sleep(5000);
		texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div.col-12.text-center.py-4.pt-lg-0 > h2")).getText();
		System.out.println(texto);
    assertEquals("Abra agora sua Conta Digital", texto);
	}

}
