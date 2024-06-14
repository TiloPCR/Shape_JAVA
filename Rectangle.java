/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180087_lab4;

/**
 *
 * @author Geenk
 */
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String id, String color, boolean filled, String dateCreated, double width, double height) {
        super(id, color, filled, dateCreated);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void showProfile() {
        System.out.printf("|Rectangle | %s| %s| %5s| %5s| %5s| %5s| %5s| %5s| %5s|\n",
                getId(), getDateCreated(), getColor(), isFilled(), formatDecimal(width), formatDecimal(height), "-", formatDecimal(getArea()), formatDecimal(getPerimeter()));
    }
}
