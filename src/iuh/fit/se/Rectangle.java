/*
 * @ (#) Rectangle       1.0        8/21/2024
 * 
 *Copyright (c) 2024 IUH. ALL rights reserved
 */
package iuh.fit.se;


/*
 * @description: mo ta hinh chu nhat
 * @author: nam,tran hoang
 * @version:    1.0
 * @created:    8/21/2024
 */



class Rectangle {

    //Attributes
    private double length;
    private double width;

    //Contructors
    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double l, double w){

        if(l < 0 || w < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");

        length = l;
        width = w;
    }

    //Setters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be granther than 0");
        this.length = length;
    }
    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be granther than 0");
        this.width = width;
    }
    //Methods
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }
}
