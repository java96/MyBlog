package com.zzss.web;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.*;

/**
 * Created by songs on 2015/10/11.
 */
public class ImageTools {

    public static String getImageUrl(File imageFile, String imageName) {

        FileOutputStream out = null;
        FileInputStream in = null;
        ServletContext servletContext = ServletActionContext.getServletContext();
        String dir = servletContext.getRealPath("/files/");

        File file = new File(dir);
        //����ļ��в������򴴽�
        if (!file.exists() && !file.isDirectory()) {
            System.out.println("//������");
            file.mkdir();
        } else {
            System.out.println("//Ŀ¼����");
        }
        try {
            out = new FileOutputStream(dir + imageName);
            in = new FileInputStream(imageFile);

            byte[] buffer = new byte[1024];
            int len = 0;
            try {
                while ((len = in.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (null != in) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return "/files/" + imageName;
    }
}
