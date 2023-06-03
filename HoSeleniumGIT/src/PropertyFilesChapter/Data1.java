package PropertyFilesChapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Data1 
{
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		//Step1
		Properties p = new Properties();
		//Step2
		p.load(new FileInputStream ("./src/Test.properties"));
		//Step3
		String val = p.getProperty("name");
		System.out.println (val);
		
	}

}
