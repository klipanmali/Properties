package my.properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class loadProperties {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Properties properties = new Properties();
		File configFile = new File("vrijednosti.properties");
//		Configuration config = new PropertiesConfiguration("vrijednos2.properties");
		try {
//			properties.load(new FileInputStream("D:\\ecl_workspace\\properties\\bin\\vrijednosti.properties"));
			InputStream inStream = new FileInputStream(configFile);
			properties.load(inStream);
			System.out.println(properties.getProperty("grad1"));
			System.out.println(properties.getProperty("grad2"));
			System.out.println(properties.getProperty("grad"));
			String gradovi[] = properties.getProperty("gradovi").split(";");
			System.out.println(gradovi[0]);
			System.out.println(gradovi[3]);
			
			
		} catch (Exception e) {
			System.out.println("Greška");
			System.out.println(e.toString());
			System.exit(0);
		}
		
		
//		try {
//			PropertiesConfiguration config = new PropertiesConfiguration(configFile);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


	}

}
