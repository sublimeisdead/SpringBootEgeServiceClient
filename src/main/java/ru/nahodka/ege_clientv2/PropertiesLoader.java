package ru.nahodka.ege_clientv2;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    public static volatile PropertiesLoader instance;
    private static Object mutex = new Object();

    private PropertiesLoader() {
    }

    public static PropertiesLoader getInstance() {
        PropertiesLoader result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new PropertiesLoader();

            }

        }
        return result;

    }

  public static Properties getProperties() throws IOException {
      Properties properties=new Properties();
      properties.load(PropertiesLoader.class.getClassLoader().getResourceAsStream("config.properties"));
      return properties;
  }

    public static InputStream getFile() throws IOException {
        String source="smb://192.168.1.77/ege_service_copy/config.properties";
        NtlmPasswordAuthentication auth=new NtlmPasswordAuthentication("192.168.1.77","russkih@n-k.ru","HTD%^$78fa");
        SmbFile file=new SmbFile(source,auth);
        InputStream in = null;
        if (file.exists()) {
            in = file.getInputStream();
        }

        ByteArrayOutputStream result=new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        in.close();
        result.close();


        return in;
    }


}
