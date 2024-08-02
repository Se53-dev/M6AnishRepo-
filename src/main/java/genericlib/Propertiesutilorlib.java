package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesutilorlib {
public String getDataFromProperties(String data) throws Exception
{
	FileInputStream fis=new FileInputStream(Iconstantutility.propertiespath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String info=pobj.getProperty(data);
	return info;
	
}

}
