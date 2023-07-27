package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFiles {

	public static void main(String[] args) throws Throwable {
		
		//The FileInputStream class of the java.io package can be used to read data (in bytes) from files.
        //It extends the InputStream abstract class.
		//Create the FileInputStream Obj with the file address as an input
		//the argument name is nothing but the relative path of the file
		
		FileInputStream fis = new FileInputStream("./src/test/resources/actitimedata.properties");
		
		//Create an Properties Object of Java
		/*The properties object contains key and value pair both as a string. The java.util.Properties class is the subclass 
		 * of Hashtable.It can be used to get property value based on the property key. The Properties class provides methods to get data 
		from the properties file and store data into the properties file. Moreover, it can be used to get the properties of
		 a system
		*/
		Properties pobj = new Properties();
		
		//load all the input stream obj to the pobj obj
		pobj.load(fis);   
		
		//call the getProperty() from the Properties Class Object reference
		
		String value = pobj.getProperty("url");//public String getProperty(String key)	It returns value based on the key
		System.out.println(value);
		
	}


}
