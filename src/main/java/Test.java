/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */

/**
 * 类名称: aa <br>
 * 类描述: <br>
 *
 * @author haijun.liao
 * @version 1.0.0
 * @since 16/7/4 下午5:49
 */

import java.io.File;

public class Test {
    public static void main(String[] args) {
        try {

            File testDataDir = new File("testdata1");
            System.out.println(testDataDir.listFiles().length);
            int i = 0;
            for (File file : testDataDir.listFiles()) {
                i++;
                String recognizeText = new OCRHelper().recognizeText(file);
                System.out.print(recognizeText + "\t");

                if (i % 5 == 0) {
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
