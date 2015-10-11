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
        //如果文件夹不存在则创建
        if (!file.exists() && !file.isDirectory()) {
            System.out.println("//不存在");
            file.mkdir();
        } else {
            System.out.println("//目录存在");
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
