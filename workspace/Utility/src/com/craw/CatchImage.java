package com.craw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
/*** 
 * javaץȡ����ͼƬ 
 * @author swinglife 
 * 
 */  
public class CatchImage {  
  
    // ��ַ  
    private static final String URL = "http://www.mogujie.com/book/elegant/";  
    // ����  
    private static final String ECODING = "UTF-8";  
    // ��ȡimg��ǩ����  
    private static final String IMGURL_REG = "<[img|IMG].*src=.*>";  
    // ��ȡsrc·��������  
    private static final String IMGSRC_REG = "http://.*[.jpg|.bmp]";  
  
      
    public static void main(String[] args) throws Exception {  
        CatchImage cm = new CatchImage();  
        //���html�ı�����  
        String HTML = cm.getHTML(URL);  
        //��ȡͼƬ��ǩ  
        List<String> imgUrl = cm.getImageUrl(HTML);  
        //��ȡͼƬsrc��ַ  
        List<String> imgSrc = cm.getImageSrc(imgUrl);  
        //����ͼƬ  
        cm.Download(imgSrc);  
    }  
      
      
    /*** 
     * ��ȡHTML���� 
     *  
     * @param url 
     * @return 
     * @throws Exception 
     */  
    private String getHTML(String url) throws Exception {  
        URL uri = new URL(url);  
        URLConnection connection = uri.openConnection();  
        InputStream in = connection.getInputStream();  
        byte[] buf = new byte[2048];  
        int length = 0;  
        StringBuffer sb = new StringBuffer();  
        while ((length = in.read(buf, 0, buf.length)) > 0) {  
            sb.append(new String(buf, ECODING));  
        }  
        in.close();  
        return sb.toString();  
    }  
  
    /*** 
     * ��ȡImageUrl��ַ 
     *  
     * @param HTML 
     * @return 
     */  
    private List<String> getImageUrl(String HTML) {  
        Matcher matcher = Pattern.compile(IMGURL_REG).matcher(HTML);  
        List<String> listImgUrl = new ArrayList<String>();  
        while (matcher.find()) {  
            listImgUrl.add(matcher.group());  
        }  
        return listImgUrl;  
    }  
  
    /*** 
     * ��ȡImageSrc��ַ 
     *  
     * @param listImageUrl 
     * @return 
     */  
    private List<String> getImageSrc(List<String> listImageUrl) {  
        List<String> listImgSrc = new ArrayList<String>();  
        for (String image : listImageUrl) {  
            Matcher matcher = Pattern.compile(IMGSRC_REG).matcher(image);  
            while (matcher.find()) {  
                listImgSrc.add(matcher.group().substring(0, matcher.group().length()));  
            }  
        }  
        return listImgSrc;  
    }  
  
    /*** 
     * ����ͼƬ 
     *  
     * @param listImgSrc 
     */  
    private void Download(List<String> listImgSrc) {  
        try {  
            for (String url : listImgSrc) {  
                String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());  
                URL uri = new URL(url);  
                InputStream in = uri.openStream();  
                String folderName = "img\\";
                FileOutputStream fo = new FileOutputStream(new File(folderName+imageName));  
                byte[] buf = new byte[2048];  
                int length = 0;  
                System.out.println("��ʼ����:" + url);  
                while ((length = in.read(buf, 0, buf.length)) != -1) {  
                    fo.write(buf, 0, length);  
                }  
                in.close();  
                fo.close();  
                System.out.println(imageName + "�������");  
            }  
        } catch (Exception e) {  
        	e.printStackTrace();
            System.out.println("����ʧ��");  
        }  
    }  
}  