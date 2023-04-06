package com.example.demo.util;


import net.sf.json.JSONObject;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * 回写报告
 * com.pacs.util
 * WriteBackReportUtil
 *
 * @author leo
 * @Description
 * @date 2021/7/29 17:12
 */
public class WriteBackReportUtil {

    public static void Base64Converter(String encodedBytes, String tempPath) {
        // BASE64Decoder decoder = new BASE64Decoder();

        byte[] decodedBytes;
        try {
            decodedBytes = Base64.getDecoder().decode(encodedBytes); // decoder.decodeBuffer(encodedBytes);
            File file = new File(tempPath);
            FileOutputStream fop = new FileOutputStream(file);
            fop.write(decodedBytes);
            fop.flush();
            fop.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    static public void statusWriteBack(String status, String applyId) {
       /* String st = "SC";//SC	登记
        switch (status) {
            case "30": {//登记信息
                st = "SC";
                break;
            }
            case "60": {//收到影像<=>检查完成
                st = "CM";
                break;
            }
            case "80": {//审核报告 <=>报告
                st = "RP";
                break;
            }
            case "90": {//发布报告 <=>报告
                st = "RP";
                break;
            }
            case "00": {//取消检查
                st = "CSC";
                break;
            }
        }*/
        //调用回写报告接口
        HttpRequestUtils.interfaceUtil("http://10.63.0.41:18080/api/st/", applyId, "/" + status, null);
        HttpRequestUtils.interfaceUtil("http://10.63.0.41:18080/api/rpt/", applyId, "", null);

        System.out.println("状态回写:" + status);
    }
}
