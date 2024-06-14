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
class Square extends Shape {

    private double side;

    public Square(String id, String color, boolean filled, String dateCreated, double side) {
        super(id, color, filled, dateCreated);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void showProfile() {
        System.out.printf("|Square    | %s| %s| %5s| %5s| %5s| %5s| %5s| %5s| %5s|\n",
                getId(), getDateCreated(), getColor(), isFilled(), formatDecimal(side), "-", "-", formatDecimal(getArea()), formatDecimal(getPerimeter()));
    }
}
