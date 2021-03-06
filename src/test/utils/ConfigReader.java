package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //reads configuration.properties.file
    //do not memorize
    //copy and paste
    public static String readProperty(String property, String filePath){

        Properties prop = null;
        try{
            FileInputStream fileInput = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fileInput);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }
        return prop.getProperty(property);

}
}