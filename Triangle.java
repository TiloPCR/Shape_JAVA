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
class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String id, String color, boolean filled, String dateCreated, double side1, double side2, double side3) {
        super(id, color, filled, dateCreated);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void showProfile() {
        System.out.printf("|Triangle  | %s| %s| %5s| %5s| %5s| %5s| %5s| %5s| %5s|\n",
                getId(), getDateCreated(), getColor(), isFilled(), formatDecimal(side1), formatDecimal(side2), formatDecimal(side3), formatDecimal(getArea()), formatDecimal(getPerimeter()));
    }
}
