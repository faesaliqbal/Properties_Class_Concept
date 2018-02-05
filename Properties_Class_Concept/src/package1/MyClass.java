package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyClass {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/faisaliqbal/Documents/EclipseWork/JavaConcepts/Properties_Class_Concept/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println("url is: "+prop.getProperty("url"));
		System.out.println("username is: "+prop.getProperty("username"));
		System.out.println("password is: "+prop.getProperty("password"));
		System.out.println("code is: "+prop.getProperty("code"));
		
		//Some other useful methods
		System.out.println(prop.contains("faisaliqbal")); //Tests if some key maps into the specified value in this hashtable. Note that this method is identical in functionality to containsValue.
		System.out.println(prop.containsKey("username")); //Tests if the specified object is a key in this hashtable.
		System.out.println(prop.containsValue("faisaliqbal")); //Returns true if this hashtable maps one or more keys to this value.
		//and many more
	}

}
