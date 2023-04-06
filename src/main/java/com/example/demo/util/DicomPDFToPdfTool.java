package com.example.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * wkhtmltopdf 工具
 */
public class DicomPDFToPdfTool {

    public static boolean execCommand(String cmd, String params) {
        /**
         * Linux下调用程序就要改成下面的格式 Process proc =Runtime.getRuntime().exec("./exefile");
         * Windows下调用系统命令 String [] cmd={"cmd","/C","copy exe1 exe2"}; Process proc
         * =Runtime.getRuntime().exec(cmd);
         */
        Process process = null;
        BufferedReader br = null;
//         BufferedReader errReader = null;
        try {
            String[] cmds = {"cmd.exe", "/C", cmd + " " + params};
            ProcessBuilder processb = new ProcessBuilder(cmds);
            processb.redirectErrorStream(true);
            /////////////////////////
            process = processb.start();// .getRuntime().exec(cmd);
//             process.waitFor(3600, TimeUnit.SECONDS);
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb.toString());
            process.waitFor(60, TimeUnit.SECONDS);

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                process.destroy();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}