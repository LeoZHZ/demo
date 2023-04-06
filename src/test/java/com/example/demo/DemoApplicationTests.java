package com.example.demo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.ImageFiles;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.dcm4che3.imageio.plugins.dcm.DicomImageReadParam;
import org.fit.pdfdom.PDFDomTree;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;


@SpringBootTest
class DemoApplicationTests {
    private static ImageReader imageReader = ImageIO.getImageReadersByFormatName("DICOM").next();
    /*    public static void toImage(File src, File target) {
            ImageInputStream iis = null;
            BufferedImage bi;
            OutputStream out = null;
            try {
                iis = ImageIO.createImageInputStream(src);
                imageReader.setInput(iis, false);
                bi = imageReader.read(0);
                ImageIO.write(bi, ".jpg", target);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                SafeClose.close(iis);
                SafeClose.close(out);
            }
        }*/
    private static final Random r = new Random();
    private static final String[] prefix2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] prefix = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static String getExamId() {
        String data = UUID.randomUUID().toString();
        CRC32 crc32 = new CRC32();
        crc32.update(data.getBytes());
        String nid = crc32.getValue() + "";
        if (nid.length() > 8) {
            return nid.substring(0, 7);
        } else {

            int len = 8 - nid.length();

            for (int i = 0; i < len; i++) {
                nid = nid + prefix[Math.abs(r.nextInt()) % 9];
            }

            return nid;
        }
    }

    @Test
    void contextLoads() throws IOException {
        //   String dcmPath = "C:\\Users\\fsy\\Desktop\\APPI2023032800079_1.2.276.0.7230010.3.1.2.2510383562.5660.1679974899.36226";
        //    String jpgPath = "C:\\Users\\fsy\\Desktop\\5297_000001_1.2.840.113619.2.370.4.2147483647.1679450867.170583.jpg";
        File folder = new File("C:\\Users\\fsy\\Desktop\\APPI2023032800079_1.2.276.0.7230010.3.1.2.2510383562.5660.1679974899.36226");
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile() && !file.getName().endsWith(".jpg")) {
                File dcmFile = new File(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                reader.setInput(ImageIO.createImageInputStream(dcmFile), true);
                BufferedImage bi = reader.read(0, param);
                File jpgFile = new File(file.getAbsolutePath() + ".jpg");
                ImageIO.write(bi, "jpg", jpgFile);
            }
        }


        // System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        // System.load("H:\\Java\\jdk17.0.2\\bin\\opencv_java400.dll");
        //  toImage(new File( "C:\\Users\\fsy\\Desktop\\APPI2022112300874_1.2.276.0.7230010.3.1.2.2510383562.5660.1679450967.22854\\0000_000000_1.2.840.113619.2.323.84108855909.1679526250.1092"),new File("C:\\Users\\fsy\\Desktop\\APPI2022112300874_1.2.276.0.7230010.3.1.2.2510383562.5660.1679450967.22854\\0000_000000_1.2.840.113619.2.323.84108855909.1679526250.1092.jpg"));

        //     System.out.println(DateUtil.lastMonthDate());

      /*  FsyStudyApplyService fsyStudyApplyService=new FsyStudyApplyService();
        FileConvertedPdfBean fileConvertedPdfBean=new FileConvertedPdfBean();
        fileConvertedPdfBean.setApplyId("APPI2022042000249");
        fileConvertedPdfBean.setFileUrl("D:/FtpRoot/imageLib/000000/image/20220420/SR/APPI2022042000250_1.2.840.113619.2.110.350206.20220420170024/0001_000001_1.2.840.113619.2.110.350206.20220420170616.1.1.12.1,D:/FtpRoot/imageLib/000000/image/20220420/SR/APPI2022042000250_1.2.840.113619.2.110.350206.20220420170024/0001_000002_1.2.840.113619.2.110.350206.20220420170615.1.2.12.1");
        fileConvertedPdfBean.setPdfUrl("");

        fsyStudyApplyService.updateFileConvertedPdfOne(fileConvertedPdfBean);*/
//https://www.fangsheyun.com:8443/imagecloud/exam/qer_img
        // System.out.println(interfaceUtil2("http://112.74.53.210:28180/getApplyFiles.php?wrId=00001949&wrClinicKey=KhbbKPom6xdTq57p&applyId=APPI2021111700114"));

      /*  try {

            File file1 = new File("E:\\cs\\1\\1.pdf");
            PDDocument pdDocument1 = PDDocument.load(file1);
            File file2 = new File("E:\\cs\\1\\2.pdf");
            PDDocument pdDocument2 = PDDocument.load(file2);
            PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();
            pdfMergerUtility.setDestinationFileName("E:\\cs\\1\\4.pdf");
            pdfMergerUtility.addSource(file1);
            pdfMergerUtility.addSource(file2);
            //Merging the two documents
            pdfMergerUtility.mergeDocuments();


            System.out.println("Documents merged");
            //Closing the documents
            pdDocument1.close();
            pdDocument2.close();
        } catch (IOException e) {
            System.out.println("存在非PDF文档，" + e.toString());
        }*/

    }

    /*
        读取pdf文字
         */
   /* @Test
    public void readPdfTextTest() throws IOException {
        byte[] bytes = getBytes("E:\\APPI2022011300101.pdf");
        //加载PDF文档
        PDDocument document = PDDocument.load(bytes);
        readText(document);
    }*/
    /*
        pdf转换html
         */
    @Test
    public void pdfToHtmlTest() {
        String outputPath = "E:\\HashMap.html";
        byte[] bytes = getBytes("E:\\APPI2022011300101.pdf");
//        try() 写在()里面会自动关闭流
        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath)), "UTF-8"));) {
            //加载PDF文档
            PDDocument document = PDDocument.load(bytes);
            PDFDomTree pdfDomTree = new PDFDomTree();
            pdfDomTree.writeText(document, out);
            String text = pdfDomTree.getText(document);
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    将文件转换为byte数组
     */
    private byte[] getBytes(String filePath) {
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    public void readText(PDDocument document) throws IOException {
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(document);
        System.out.println(text);
    }

    public static String cmd(String cmd) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /*  public static void getPdfFiintext(String fileName) throws IOException {
          PdfDocument doc = new PdfDocument();
  //加载PDF文件
          doc.loadFromFile("C:\\Users\\Administrator\\Desktop\\APPI2022011300101.pdf");

  //创建StringBuilder实例
          StringBuilder sb = new StringBuilder();

          PdfPageBase page;
  //遍历PDF页面，获取每个页面的文本并添加到StringBuilder对象
          for (int i = 0; i < doc.getPages().getCount(); i++) {
              page = doc.getPages().get(i);
              sb.append(page.extractText(true));
          }
          FileWriter writer;
          try {
              //将StringBuilder对象中的文本写入到文本文件
              writer = new FileWriter("C:\\Users\\Administrator\\Desktop\\ExtractText.txt");
              writer.write(sb.toString());
              writer.flush();
          } catch (IOException e) {
              e.printStackTrace();
          }

          doc.close();

      }
  */
    public static int interfaceUtil2(String path) {
        String str = "";
        int size = 0;
        try {
            URL url = new URL(path);
            //打开和url之间的连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            PrintWriter out = null;
            /**设置URLConnection的参数和普通的请求属性****start***/
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");

            /**设置URLConnection的参数和普通的请求属性****end***/

            //设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
            //最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servint，
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

            while ((str = br.readLine()) != null) {
                str = new String(str.getBytes(), StandardCharsets.UTF_8);//解决中文乱码问题
                JSONObject jsonObject = JSON.parseObject(str);
                List<ImageFiles> imageFiles = (List<ImageFiles>) jsonObject.get("imageFiles");
                size = imageFiles.size();
            }
            //关闭流
            is.close();
            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return size;
    }

    public String JSONTokener(String in) {
        // consume an optional byte order mark (BOM) if it exists
        if (in != null && in.startsWith("\ufeff")) {
            in = in.substring(1);
        }
        return in;
    }


}
