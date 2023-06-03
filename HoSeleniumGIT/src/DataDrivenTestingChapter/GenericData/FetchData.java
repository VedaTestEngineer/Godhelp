package DataDrivenTestingChapter.GenericData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String value1 = GenericDataFetch.getData("Sheet1", 1, 0);
		System.out.println (value1);

	}

}
