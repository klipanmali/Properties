package my.systemproperties;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;


public class systemPropertiesStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			File file = new File("systemproperties.properties");
			FileOutputStream fos = new FileOutputStream(file);
			Properties properties = System.getProperties();
			properties.store(fos, "comment");
			fos.close();
			System.out.println("done");
		}catch(Exception e){
			
		}

	}

}
