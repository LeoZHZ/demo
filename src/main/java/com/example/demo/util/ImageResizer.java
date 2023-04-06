package com.example.demo.util;
import org.dcm4che3.imageio.plugins.dcm.DicomImageReadParam;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.*;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
public class ImageResizer {
    public static byte[] resizeImage(File file, int width, int height) throws IOException {
        ImageInputStream iis = ImageIO.createImageInputStream(file);
        Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);
        ImageReader reader = readers.next();
        DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
        reader.setInput(iis, true);
        BufferedImage bi = reader.read(0, param);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(bi, 0, 0, width, height, null);
        g.dispose();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageWriteParam writeParam = writer.getDefaultWriteParam();
        writeParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        writeParam.setCompressionQuality(0.75f);
        ImageOutputStream outputStream = ImageIO.createImageOutputStream(baos);
        writer.setOutput(outputStream);
        writer.write(null, new IIOImage(resizedImage, null, null), writeParam);
        outputStream.close();
        writer.dispose();
        return baos.toByteArray();
    }
}
