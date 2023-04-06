package com.example.demo.util;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HttpRequestUtils {

    /**
     * 调用对方接口方法
     *
     * @param path 对方或第三方提供的路径
     * @param data 向对方或第三方发送的数据，大多数情况下给对方发送JSON数据让对方解析
     * @return
     */
    public static String interfaceUtil(String path, String applyId, String status, String data) {
        try {
            System.out.println("path:" + path);
            String encode = URLEncoder.encode(applyId);
            URL url = new URL(path + encode + status);
            System.out.println("url:" + url);

            //打开和url之间的连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            PrintWriter out = null;

            /**设置URLConnection的参数和普通的请求属性****start***/

            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");

            /**设置URLConnection的参数和普通的请求属性****end***/

            //设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
            //最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
            //post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setRequestMethod("GET");//GET和POST必须全大写
            /**GET方法请求*****start*/
            /**
             * 如果只是发送GET方式请求，使用connet方法建立和远程资源之间的实际连接即可；
             * 如果发送POST方式的请求，需要获取URLConnection实例对应的输出流来发送请求参数。
             * */
            conn.connect();

            /**GET方法请求*****end*/

            /***POST方法请求****start*/

            /*out = new PrintWriter(conn.getOutputStream());//获取URLConnection对象对应的输出流

            out.print(data);//发送请求参数即数据

            out.flush();//缓冲数据
            */
            /***POST方法请求****end*/

            //获取URLConnection对象对应的输入流
            InputStream is = conn.getInputStream();
            //构造一个字符流缓存
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = "";
            while ((str = br.readLine()) != null) {
                str = new String(str.getBytes(), "UTF-8");//解决中文乱码问题
                System.out.println(str);
            }
            //关闭流
            is.close();
            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
        return "完整结束";
    }



    public static void main(String[] args) throws UnsupportedEncodingException {

/*		Charset charset = Charset.forName("UTF-8");// 设置编码
		JSONObject j = new JSONObject();
		j.put("filePath", "1");
		String path = "D:/FtpRoot/ImageLib/image/00001089/20180320/CT/5D18002857_1.3.12.2.1107.5.1.4.120980.30000018031400194300600000761";
		String url = "http://localhost:8080/fsyExamApplySyn/syn/upl_img";
		uplodaFile(url, path, j);*/
        //	upload2("http://120.76.213.51:8086/pacs/testUpload", "D:\\dicomServiceFTP\\1.2.840.86.755.86226839.811.40350", new JSONObject());
        //	uplodaFile("http://120.76.213.51:8086/pacs/testUpload", "D:\\dicomServiceFTP\\1.2.840.86.755.86226839.811.40350", new JSONObject());


        String filepath = "D:\\\\dicomServiceFTP\\\\1.2.840.86.755.86226839.811.40350";
        String urlStr = "http://120.76.213.51:8086/pacs/testUpload";
       // JSONObject ret = formUpload(urlStr, filepath, new JSONObject());
      //  System.out.println(ret.toString());
    }

}