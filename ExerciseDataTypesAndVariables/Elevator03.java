package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int sum = 0;

//       if (capacity >= persons) {
//           sum = 1;
//       } else {
//           int course = persons / capacity;
//           if (persons % capacity == 0) {
//               sum = course;
//           } else {
//               sum = course + 1;
//           }
//       }
       int courses = (int) Math.ceil((double) persons / capacity);

        System.out.println(courses);
    }
}
