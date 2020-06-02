package com.nbsl.cv.utils;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

import java.awt.image.BufferedImage;
import java.io.File;
 
public class OCRUtil {
    /**
     * 识别图片信息
     * @param img
     * @return
     */
    public static String getImageMessage(BufferedImage img,String language,boolean hasLanguage){

        String result="end";
        try{
            ITesseract instance = new Tesseract();
            File tessDataFolder = LoadLibs.extractTessResources("tessdata");
           /* if(hasLanguage){
            	 instance.setLanguage(language);
            } */

            //此处输出的路径为 C:\Users\长安\AppData\Local\Temp\tess4j\tessdata，这是错误的路径
           // System.out.println(tessDataFolder.getAbsolutePath());

           // instance.setDatapath(tessDataFolder.getAbsolutePath());

            instance.setDatapath("D:\\project\\idCardCv\\src\\main\\resources");//这才是当前项目中tessdata的真正路径
             //  instance.setDatapath("D:\\godgit\\tesseract\\Tesseract-OCR");
            instance.setTessVariable("digits", "0123456789X");
            instance.setTessVariable("user_defined_dpi", "300");
            instance.setTessVariable("fonts_dir", tessDataFolder.getAbsolutePath()+File.separator+"fonts");
            instance.setLanguage(language);
            result = instance.doOCR(img);
            //System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}