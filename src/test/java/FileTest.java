/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 类名称: FileTest <br>
 * 类描述: <br>
 *
 * @author haijun.liao
 * @version 1.0.0
 * @since 16/7/5 下午1:18
 */
public class FileTest {

    @org.junit.Test
    public void test() throws Exception {
        FileReader fr = new FileReader("/Users/yp-tc-m2811/temp/swagger/src/test/resources/aa.txt");
        BufferedReader br = new BufferedReader(fr);
        String str2 = br.readLine();
        String str3 = "";
        while (str2 != null) {
            str3 += str2;
            str2 = br.readLine();
        }
        br.close();
        fr.close();
        FileWriter fw = new FileWriter("/Users/yp-tc-m2811/temp/swagger/src/test/resources/bb.txt");
        FileWriter fw1 = new FileWriter("/Users/yp-tc-m2811/temp/swagger/src/test/resources/chi_sim2.words_list");
        FileWriter fw2 = new FileWriter("/Users/yp-tc-m2811/temp/swagger/src/test/resources/chi_sim2.frequent_words_list");
        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        sb2.append(" ");
        for(int i=0;i<str3.length();i++){
            sb.append(str3.charAt(i)+"\r\n");
            sb2.append(str3.charAt(i)+" ");
        }
        fw.write(sb2.toString());
        fw.flush();
        fw.close();
        fw1.write(sb.toString());
        fw1.flush();
        fw1.close();
        fw2.write(sb.toString());
        fw2.flush();
        fw2.close();
    }
}