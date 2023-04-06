package com.example.demo.util;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;

/**
 * 采用AES加密解密
 * @author tfq
 * @datetime 2011-10-13
 */
public class AESUtil {
/*
	public static String iv = "1111111111111111";
    public static byte[] Encrypt(String sSrc, String sKey) throws Exception {  
        if (sKey == null) {  
            System.out.print("Key为空null");  
            return null;  
        }  
        // 判断Key是否为16位  
        if (sKey.length() != 16) {  
            System.out.print("Key长度不是16位");  
            return null;  
        }  
        byte[] raw = sKey.getBytes();  
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");  
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");//"算法/模式/补码方式"  
        IvParameterSpec iv = new IvParameterSpec(AESUtil.iv.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度  
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);  
       
        byte[] srawt = sSrc.getBytes();
        int len = srawt.length;
        */
/* 计算补0后的长度 *//*

        while(len % 16 != 0) len ++;
        byte[] sraw = new byte[len];
        */
/* 在最后补0 *//*

        for (int i = 0; i < len; ++i) {
            if (i < srawt.length) {
                sraw[i] = srawt[i];
            } else {
                sraw[i] = 0;
            }
        }
        byte[] encrypted = cipher.doFinal(sraw);  
  
        return encrypted;//此处使用BASE64做转码功能，同时能起到2次加密的作用。  
    }  
  
    // 解密  
    public static String Decrypt(byte[] encrypted1, String sKey) throws Exception {  
        try {  
            // 判断Key是否正确  
            if (sKey == null) {  
                System.out.print("Key为空null");  
                return null;  
            }  
            // 判断Key是否为16位  
            if (sKey.length() != 16) {  
                System.out.print("Key长度不是16位");  
                return null;  
            }  
            byte[] raw = sKey.getBytes("ASCII");  
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");  
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");  
            IvParameterSpec iv = new IvParameterSpec(AESUtil.iv.getBytes());  
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);  
           // byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密   base64decode
            try {  
                byte[] original = cipher.doFinal(encrypted1);  
                String originalString = new String(original);  
                return originalString.trim();  
            } catch (Exception e) {  
                System.out.println(e.toString());  
                return null;  
            }  
        } catch (Exception ex) {  
            System.out.println(ex.toString());  
            return null;  
        }  
    }

    public static String Decrypt(byte[] encrypted1, byte[] sKey,byte[] iv) {
        try {
            // 判断Key是否正确
            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }
            SecretKeySpec skeySpec = new SecretKeySpec(sKey, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString.trim();
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
*/
/*        String data="g3vmUY+PxstdZnNMVUSWOrPY87BXYJFcUoucr3h0QZdVpK+MFwlQNAxA49zitGsfMSwu8SlQ9k76cCwfservkP9b/spcfIXZYXS13R8WrfXMl0hLr9gcPsZzH3vW1sa1uZB3nlcZjXgteFUxewpW3Yw2OFWB4t3gWjB4dEre6ai/SwUKJcLk7OUFBXYbQL0fk++RVFFirDtLXNcBhxeIP/y3hQeWIBhElAyhVP/N6ZHu5r1MoS0pUzA06kMq/fgG9RbduOA6grcbAdDsYU0wPTsj8Yw28qBT+2NRDZKeuk7GxDRqiks+yi09K0ZDgXtqQTKO6txg+0o0cXTqsPit3fABRqO701RxudePXVR4ovf565aVOpC3vpvCe1PLjFwhg8zUqkxwoTmcyfbl6fpuEN1YMkK1SWseFanllJH7kLkCsFxGz+LRStIDeL2Oieh50I/lEkiJKyzoXvlm6X7ZsXKh+Q4n813rvY4115UtXIUSFvyWbAj2MXUY7ycaVBZxsPd+/lkN2Pf/x8K+EkWeILhgn6TwmO6L5JohOIUzutnnfOlbyemk17DxghVqsU5+ZOLrYeQ5fmJ8w8hOqGthycyVFlUXD0ixr3VT41F5b5zBF1JVnzYlZivH2O7DXK5G+CG3kcfcOeZsvh1g10GLKMugaeqYjy/X0AhEAqB728Kw8yAKYyR45/8HKMlk2Wnf69q3gnYk+CZZfakRfFgSQiieOqoXVPt9SvBHJ0BZLoymN/6UufLaYc+5lZCWNGGYhwrPA2u801GsJhxmesgCvzUqTtCbwtDPneYkQD++m18aumg/ZoldrbimYaEeVGW3aCRYKMnr155qPInSi7HD0IuzHCHW+r6kVCQiTO+BKsSAhjdBy3EPRhR1sWroRCDV70uV0MT/wXESCuoGX3/ZvkE06ded65mBVIy4AWoqvokVghnlV8yLeDyiDQl9fpMJz3kF4R4Z8bQZVV/H4DX3AVXaqGPR+d7He9MgkOwNSBg7DSVMB82pXNZarncj6txZ1Sd5XEZPIEz+aY7mNCMeWKXbGKPG7hca38YhipsPHUJ6HrpcAE9GsSSRQ8quuq5NUarGFv0O+GzWb9WQfnnoFA==";
        String key_=MD5Util.string2MD5("d687M7vKr5iUnNjf8FmJky5DyEWddqdV");
        String body=Decrypt_256(java.util.Base64.getDecoder().decode(data),key_);
        Map<String,String> info_map= WXPayUtil.xmlToMap(body);
        System.out.println(info_map);
        System.out.println(info_map.get("refund_recv_accout"));
        String a="鏀\uE219粯鐢ㄦ埛闆堕挶";
        System.out.println(new String(a.getBytes("GBK"),"utf-8"));*//*

String key="RTY.dweEErteST;t";
String name="李四";
name= new String( name.getBytes("utf-8") , "utf-8");
String str="1400254751,f34193a068413499cd2224bfe11ea0f5eefcf79430098eb6d3bfee7e1913bdd9,00010367,"+name+",00010367,李四";
        System.out.println(base64encode(Encrypt(str,key)));
        String str2="9anvgybsPpsl2XBxyrdY9/gJ7POGT0mGnMVoGACOXcFkdvS+HI5hWl4mWxIBUJBGqM1hu/w7FBUhZeJkE+2GF+mUcH2VQpfU3fliSCIUdauK3QE0kB6YhHxZRV7B6Ll1E0G2ArEbZq9oiC+2OvtlaQ==";
        System.out.println(Decrypt(base64decode(str2),key));
    }
    // 解密
    public static String Decrypt_256(byte[] encrypted1, String sKey) throws Exception {
        try {
            // 判断Key是否正确
            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 32) {
                System.out.print("Key长度不是32位");
                return null;
            }
            Security.addProvider(new BouncyCastleProvider());
            byte[] raw = sKey.getBytes();
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original,"UTF-8");
                return originalString.trim();
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    */
/**将二进制转换成16进制
	 * @param buf 
	 * @return 
	 *//*

	public static String parseByte2HexStr(byte buf[]) {  
	        StringBuffer sb = new StringBuffer();  
	        for (int i = 0; i < buf.length; i++) {  
	                String hex = Integer.toHexString(buf[i] & 0xFF);  
	                if (hex.length() == 1) {  
	                        hex = '0' + hex;  
	                }  
	                sb.append(hex.toUpperCase());  
	        }  
	        return sb.toString();  
	} 
	
	*/
/**将16进制转换为二进制
	 * @param hexStr 
	 * @return 
	 *//*

	public static byte[] parseHexStr2Byte(String hexStr) {
        try {
            if (hexStr.length() < 1)
                    return null;
            byte[] result = new byte[hexStr.length()/2];
            for (int i = 0;i< hexStr.length()/2; i++) {
                    int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
                    int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
                    result[i] = (byte) (high * 16 + low);
            }
            return result;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
	
	*/
/**
     * @param
     * @return 
     *//*

    public static byte[] base64decode(String encoded) {  
        try {
			return Base64.decode(encoded);
		} catch (Base64DecodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            return null;
		}
    }  
  
    */
/**
     * 二进制数据编码为BASE64字符串 
     * 
     * @param bytes 
     * @return 
     * @throws Exception 
     *//*

    public static String base64encode(final byte[] bytes) {
        return new String(Base64.encode(bytes));
    }  
*/
}
