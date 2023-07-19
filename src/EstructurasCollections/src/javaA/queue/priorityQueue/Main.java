package javaA.queue.priorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {

        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

    static private class Priorities {
        public List<Student> getStudents(List<String> events){
            PriorityQueue<Student> listado = new PriorityQueue();
            Student estudiante;

            for (String linea :
                    events) {
                if (linea.charAt(0) == 'E') {
                    String linea_arr[] = linea.split(" ");
                    estudiante =  new Student(Integer.parseInt(linea_arr[3]), linea_arr[1], Double.parseDouble(linea_arr[2]));
                    listado.add(estudiante);
                }
                else if (linea.charAt(0) == 'S') {
                    listado.poll();
                }
            }
            return listado.stream().toList();
        }
    }

}
