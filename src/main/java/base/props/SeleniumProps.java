package base.props;

import base.SeleniumActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SeleniumProps {

    public static String getProperty(String fileName, String key){
        // Cargo el archivo de properties de esta manera para arrojar una excepción si no se puede cargar
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream("environment/"+fileName+".properties");
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo cargar el archivo driver.properties");
        }

        String value = props.getProperty(key);

        return value;
    }

}
