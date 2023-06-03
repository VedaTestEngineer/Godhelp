package PropertyFilesChapter;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class GenericPropertyClass throws FileNotFoundException, IOException
{
	@Test
	public void data1(String path, String key)
	{
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		String val = p.getProperty(key);
		System.out.println (val);
	}

}
