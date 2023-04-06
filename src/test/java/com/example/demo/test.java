package com.example.demo;

import com.example.demo.util.DateUtil;
import org.dcm4che3.imageio.plugins.dcm.DicomImageReadParam;
import org.springframework.boot.test.context.SpringBootTest;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

@SpringBootTest
public class test {
    public static void main(String[] args) throws Exception {
        System.out.println("测试" + DateUtil.NowDate());
        File folder = new File("C:\\Users\\fsy\\Desktop\\APPI2023032800079_1.2.276.0.7230010.3.1.2.2510383562.5660.1679974899.36226");
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile() && !file.getName().endsWith(".jpg")) {
/*                File dcmFile = new File(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                reader.setInput(ImageIO.createImageInputStream(dcmFile), true);
                BufferedImage bi = reader.read(0, param);
                File jpgFile = new File(file.getAbsolutePath() + ".jpg");
                ImageIO.write(bi, "jpg", jpgFile);*/
                byte[] images;
                //  To set the width and height of the generated image, you can modify the code block as follows:
             /*   File dcmFile = new File(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                reader.setInput(ImageIO.createImageInputStream(dcmFile), true);
                BufferedImage bi = reader.read(0, param);
                int width = 512; // set the desired width here
                int height =512; // set the desired height here
                BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(bi, 0, 0, width, height, null);
                g.dispose();
                File jpgFile = new File(file.getAbsolutePath() + ".jpg");
                ImageIO.write(resizedImage, "jpg", jpgFile);*/
/*

                In this modified code block, we first read in the image as before.Then, we set the desired width
                and height of the output image (in this example, both are set to 500).We create a new BufferedImage
                with the desired dimensions, and then use a Graphics2D object to draw the original image onto the
                new image with the desired dimensions.Finally, we write the resized image to a file as before.
*/
              /*  File dcmFile = new File(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                reader.setInput(ImageIO.createImageInputStream(dcmFile), true);
                BufferedImage bi = reader.read(0, param);
                int width = 512; // set the desired width here
                int height = 512; // set the desired height here
                BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(bi, 0, 0, width, height, null);
                g.dispose();
                File jpgFile = new File(file.getAbsolutePath() + ".jpg");

// Set the quality to 0.75
                ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
                ImageWriteParam writeParam = writer.getDefaultWriteParam();
                writeParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                writeParam.setCompressionQuality(0.15f);

                ImageOutputStream outputStream = ImageIO.createImageOutputStream(jpgFile);
                writer.setOutput(outputStream);
                writer.write(null, new IIOImage(resizedImage, null, null), writeParam);
                outputStream.close();
                writer.dispose();*/
                //    System.out.println(ImageResizer.resizeImage(file, 512, 512));
             /*   Path dcmPath = Paths.get(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                try (InputStream inputStream = Files.newInputStream(dcmPath)) {
                    reader.setInput(ImageIO.createImageInputStream(inputStream), true);
                    BufferedImage bi = reader.read(0, param);
                    int width = 512; // set the desired width here
                    int height = 512; // set the desired height here
                    BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(bi, 0, 0, width, height, null);
                    g.dispose();
                    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        ImageIO.write(resizedImage, "jpg", baos);
                        byte[] imageBytes = baos.toByteArray();
                        try (OutputStream outputStream = new FileOutputStream(file.getAbsolutePath() + ".jpg")) {
                            outputStream.write(imageBytes);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
*/
              Path dcmPath = Paths.get(file.getAbsolutePath());
                Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = readers.next();
                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                try (InputStream inputStream = Files.newInputStream(dcmPath)) {
                    reader.setInput(ImageIO.createImageInputStream(inputStream), true);
                    BufferedImage bi = reader.read(0, param);
                    int width = 512; // set the desired width here
                    int height = 512; // set the desired height here
                    BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(bi, 0, 0, width, height, null);
                    g.dispose();
                    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        ImageIO.write(resizedImage, "jpeg", baos);
                        byte[] imageBytes = baos.toByteArray();
                        try (OutputStream outputStream = new FileOutputStream(replaceLast(dcmPath.toString(), "\\", "jpeg\\")+".jpeg")) {
                            outputStream.write(imageBytes);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("测试结束" + DateUtil.NowDate());
    }

    public static String replaceLast(String str, String regex, String replacement) {
        int lastIndex = str.lastIndexOf(regex);
        if (lastIndex == -1) {
            return str;
        } else {
            return str.substring(0, lastIndex) + replacement + str.substring(lastIndex + regex.length());
        }
    }
}
