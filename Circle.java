/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180087_lab4;

/**
 *
 * @author Trần Quốc Hưng, MSSV: CE180087, IA1803
 */
class Circle extends Shape {

    private double radius;

    public Circle(String id, String color, boolean filled, String dateCreated, double radius) {
        super(id, color, filled, dateCreated);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void showProfile() {
        System.out.printf("|Circle    | %s| %s| %5s| %5s| %5s| %5s| %5s| %5s| %5s|\n",
                getId(), getDateCreated(), getColor(), isFilled(), formatDecimal(radius), "-", "-", formatDecimal(getArea()), formatDecimal(getPerimeter()));
    }
}
