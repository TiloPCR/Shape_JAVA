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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class ShapeManagement {

    // List to store all shape objects
    private static ArrayList<Shape> shapes = new ArrayList<>();
    // Scanner object for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main loop to keep the application running until the user chooses to quit
        while (true) {
            // Display the menu options to the user
            showMenu();
            // Read user input for menu choice
            int choice = Integer.parseInt(scanner.nextLine());
            // Execute different actions based on user choice
            switch (choice) {
                case 1:
                    // Add a new Circle
                    addCircle();
                    break;
                case 2:
                    // Add a new Triangle
                    addTriangle();
                    break;
                case 3:
                    // Add a new Rectangle
                    addRectangle();
                    break;
                case 4:
                    // Add a new Square
                    addSquare();
                    break;
                case 5:
                    // Show all shapes
                    showShapes();
                    break;
                case 6:
                    // Show the shape with the largest area
                    showLargestShape();
                    break;
                case 7:
                    // Sort shapes by area in ascending order
                    sortShapesByArea();
                    break;
                case 8:
                    // Search for a shape by ID
                    searchShape();
                    break;
                case 9:
                    // Quit the application
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.exit(0);
                default:
                    // Invalid choice message
                    System.out.println("The function of application must be from 1 to 9!");
            }
        }
    }

    // Method to display the menu options to the user
    private static void showMenu() {
        System.out.println("-----SHAPE MANAGEMENT------");
        System.out.println("1. Add new Circle");
        System.out.println("2. Add new Triangle");
        System.out.println("3. Add new Rectangle");
        System.out.println("4. Add new Square");
        System.out.println("5. Show all shapes");
        System.out.println("6. Show biggest area shape.");
        System.out.println("7. Sort ascending by shapes area");
        System.out.println("8. Search a shape.");
        System.out.println("9. Quit");
        System.out.print("Please select a function: ");
    }

    // Method to get the current date formatted as MM/dd/yy
    private static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }

    // Method to add a new Circle to the list
    private static void addCircle() {
        System.out.println("----- Add new Circle -----");
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        // Check if the ID already exists in the list
        if (isIdExist(id)) {
            System.out.println("This " + id + " is already exists!");
            return;
        }
        System.out.print("Input color: ");
        String color = scanner.nextLine();
        System.out.print("Input filled (true/false): ");
        boolean filled = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Input radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        // Create a new Circle object and add it to the list
        shapes.add(new Circle(id, color, filled, getCurrentDate(), radius));
        System.out.println("Circle created and added to list of shapes successful!");
    }

    // Method to add a new Triangle to the list
    private static void addTriangle() {
        System.out.println("----- Add new Triangle -----");
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        // Check if the ID already exists in the list
        if (isIdExist(id)) {
            System.out.println("This " + id + " is already exists!");
            return;
        }
        System.out.print("Input color: ");
        String color = scanner.nextLine();
        System.out.print("Input filled (true/false): ");
        boolean filled = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Input side 1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input side 2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input side 3: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        // Create a new Triangle object and add it to the list
        shapes.add(new Triangle(id, color, filled, getCurrentDate(), side1, side2, side3));
        System.out.println("Triangle created and added to list of shapes successful!");
    }

    // Method to add a new Rectangle to the list
    private static void addRectangle() {
        System.out.println("----- Add new Rectangle -----");
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        // Check if the ID already exists in the list
        if (isIdExist(id)) {
            System.out.println("This " + id + " is already exists!");
            return;
        }
        System.out.print("Input color: ");
        String color = scanner.nextLine();
        System.out.print("Input filled (true/false): ");
        boolean filled = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Input width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Input height: ");
        double height = Double.parseDouble(scanner.nextLine());
        // Create a new Rectangle object and add it to the list
        shapes.add(new Rectangle(id, color, filled, getCurrentDate(), width, height));
        System.out.println("Rectangle created and added to list of shapes successful!");
    }

    // Method to add a new Square to the list
    private static void addSquare() {
        System.out.println("----- Add new Square -----");
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        // Check if the ID already exists in the list
        if (isIdExist(id)) {
            System.out.println("This " + id + " is already exists!");
            return;
        }
        System.out.print("Input color: ");
        String color = scanner.nextLine();
        System.out.print("Input filled (true/false): ");
        boolean filled = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Input edge: ");
        double edge = Double.parseDouble(scanner.nextLine());
        // Create a new Square object and add it to the list
        shapes.add(new Square(id, color, filled, getCurrentDate(), edge));
        System.out.println("Square created and added to list of shapes successful!");
    }

    // Method to display all shapes in the list
    private static void showShapes() {
        System.out.println("----- List of Shapes -----");
        for (Shape shape : shapes) {
            shape.showProfile();
        }
    }

    // Method to find and display the shape with the largest area
    private static void showLargestShape() {
        System.out.println("----- Show biggest area shape -----");
        // Check if the list is empty
        if (shapes.isEmpty()) {
            System.out.println("There are no shapes to display.");
            return;
        }
        // Find the shape with the maximum area
        Shape maxAreaShape = shapes.stream()
                .max(Comparator.comparingDouble(Shape::getArea))
                .orElse(null);
        if (maxAreaShape != null) {
            maxAreaShape.showProfile();
        }
    }

    // Method to sort shapes by area in ascending order and display them
    private static void sortShapesByArea() {
        shapes.sort(Comparator.comparingDouble(Shape::getArea));
        showShapes();
    }

    // Method to search for a shape by its ID
    private static void searchShape() {
        System.out.println("----- Search shape by ID -----");
        System.out.print("Input ID to find: ");
        String id = scanner.nextLine();
        // Find the shape with the specified ID
        Shape foundShape = shapes.stream()
                .filter(shape -> shape.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (foundShape != null) {
            foundShape.showProfile();
        } else {
            System.out.println("Not found.");
        }
    }

    // Method to check if a shape with the specified ID already exists in the list
    private static boolean isIdExist(String id) {
        return shapes.stream().anyMatch(shape -> shape.getId().equals(id));
    }
}
