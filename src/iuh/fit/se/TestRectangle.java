/*
 * @ (#) TestRectangle.java       1.0        8/21/2024
 *
 *Copyright (c) 2024 IUH. ALL rights reserved
 */
package iuh.fit.se;


/*
 * @description: mo ta hinh chu nhat
 * @author:nam,tran hoang
 * @version:    1.0
 * @created:    8/21/2024
 */

import java.awt.*;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle re1 = new Rectangle(); //Length = 0, width = 0

        System.out.println("Length: " + re1.getLength());
        System.out.println("Width: " + re1.getWidth());

        re1.setLength(10);
        re1.setWidth(3);

        System.out.println("Length: " + re1.getLength());
        System.out.println("Width: " + re1.getWidth());

        Rectangle re2 = new Rectangle(20, 5);
        System.out.println("Area: " + re2.getArea());
        System.out.println("Perimeter: " + re2.getPerimeter());
    }
}