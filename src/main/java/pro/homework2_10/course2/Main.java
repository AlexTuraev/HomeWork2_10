package pro.homework2_10.course2;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Employee p = new Employee("I", "d", "f", 5, 700000);

        EmployeeBook book = new EmployeeBook();
        book.addNewEmployee("иванов", "иван", "иванович", 3, 50000f);
        book.addNewEmployee("Пончиков", "Иван", "Иванович", 3, 50000f);
        book.addNewEmployee("сидоров", "Олег", "Иванович", 1, 50000f);
        book.addNewEmployee("Михайлова", "Ольга", "Ивановна", 2, 50000f);
        book.addNewEmployee("Иванов", "Иван", "Иванович", 5, 50000f);
        book.addNewEmployee("Еленова", "Елена", "Ивановна", 5, 50000f);
        book.addNewEmployee("Евгеньева", "Евгения", "Петровна", 5, 50000f);
        book.addNewEmployee("Крапивина", "Юлия", "Михайловна", 5, 50000f);

        System.out.println(book.getFullNames());
    }
}