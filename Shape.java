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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Shape {

    private String id;
    private String color;
    private boolean filled;
    private String dateCreated;

    public Shape(String id, String color, boolean filled, String dateCreated) {
        this.id = id;
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void showProfile();

    protected String formatDecimal(double value) {
        return String.format("%.1f", value);
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}
