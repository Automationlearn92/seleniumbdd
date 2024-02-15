package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }
    
    public static String getUserName() {
        return properties.getProperty("userName");
    }
    
    public static String getPassword() {
        return properties.getProperty("Password");
    }

    public static String getChromeDriverPath() {
        return properties.getProperty("edgedriverpath");
    }
    
    public static String getUrl() {
        return properties.getProperty("url");
    }

    // Add other methods for configuration values
}
