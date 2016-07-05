/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */

import org.junit.Test;

/**
 * 类名称: DynamicTest <br>
 * 类描述: <br>
 *
 * @author haijun.liao
 * @version 1.0.0
 * @since 16/7/4 下午2:32
 */
public class DynamicTest {
    @Test
    public void test() {
        int[] min = new int[20];
        min[0] = 0;
        int[] v = {1, 3, 5};
        int totle = min.length - 1;
        int n = v.length;
        for (int i = 1; i <= totle; i++) {
            for (int j = 0; j < n; j++) {
                if (v[j] <= i && (min[i - v[j]] + 1 < min[i] || min[i] == 0)) {
                    min[i] = min[i - v[j]] + 1;
                }
            }
        }
        for (int i = 0; i < totle; i++) {
            System.out.println(i+"元:"+min[i]);
        }
    }
}