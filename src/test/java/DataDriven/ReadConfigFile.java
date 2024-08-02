package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    public static void main(String[] args) throws IOException {
        Properties prop =new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//TestData//config1.properties");
        prop.load(file);// read data into config file

        String url = prop.getProperty("aapurl");
        String uname = prop.getProperty("username");
        String pass = prop.getProperty("password");

        System.out.println(url);
        System.out.println(uname);
        System.out.println(pass);
    }



}
