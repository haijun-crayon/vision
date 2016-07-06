/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * 类名称: RegionHelper <br>
 * 类描述: <br>
 *
 * @author haijun.liao
 * @version 1.0.0
 * @since 16/7/6 上午11:09
 */
public class RegionHelper {

    public static void main(String[] args) {
        try {


            String destDir = "/Users/yp-tc-m2811/git/vision/src/main/resources/region";
            File destF = new File(destDir);
            if (!destF.exists()) {
                destF.mkdirs();
            }
            File sfile = new File("/Users/yp-tc-m2811/git/vision/src/main/resources/id_card001.jpg");
            BufferedImage bufferedImage = ImageIO.read(sfile);
            Point p0 = new Point(360, 40);
            Point p1 = new Point(535, 255);

            BufferedImage binaryBufferedImage = getRegion(bufferedImage, -2.0, 0.12, p0, p1);
            ImageIO.write(binaryBufferedImage, "jpg", new File(destDir, "name.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage getRegion(BufferedImage source, double x, double y, Point leftTop, Point rightBottom) {
        double w = rightBottom.getX() - leftTop.getX();
        double px = leftTop.getX() + x * w;
        double py = rightBottom.getY() + y * w;
        return source.getSubimage((int) px, (int) py, (int)(1.7*w), (int)(0.23*w));
    }
}