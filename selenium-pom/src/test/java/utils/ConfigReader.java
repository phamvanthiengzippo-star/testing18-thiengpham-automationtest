package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    // static block: chay 1 lan duy nhat khi class duoc goi lan dau
    static {
    // lay file trong resources => getResourceAsStream()
        try (InputStream in = ConfigReader.class.getResourceAsStream("/config.properties")){
            properties.load(in);
        }catch (Exception e){
            throw new RuntimeException("khong doc duoc file config.properties", e);
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }
}
