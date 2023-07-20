package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
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
            System.out.println();
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Priorities{
        public List<Student> getStudents(List<String> lineas){

            PriorityQueue<Student> estudiantes = new PriorityQueue();

            for (String linea : lineas) {

                String linea_arr[] = linea.split(" ");
                //ENTER John 3.75 50
                //Student(int id, String name, double cgpa){

                if (linea_arr[0].equalsIgnoreCase("enter")){

                    int id = Integer.parseInt(linea_arr[3]);
                    double cgpa = Double.parseDouble(linea_arr[2]);
                    estudiantes.add(new Student(id, linea_arr[1], cgpa));

                }else if (linea_arr[0].equalsIgnoreCase("served")){
                    estudiantes.poll();
                }

            }
            return estudiantes.stream().toList();
        }
    }

    static class Student implements Comparable<Student>{
        private int id;
        private String name;
        private double cgpa;
        Student(int id, String name, double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        };

        public int getID(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }
        public double getCgpa(){
            return this.cgpa;
        }

        public int compareTo(Student stu){
            if(this.cgpa != stu.getCgpa() ){

                return Double.compare(stu.getCgpa(), this.cgpa);

            }else if (!this.getName().equalsIgnoreCase(stu.getName())){

                return this.getName().compareTo(stu.getName());

            }else {

                return Integer.compare(stu.getID(), this.getID());

            }
        }
    }
}
/*
5
ENTER Violeta 3.75 50
ENTER Roberto 3.75 51
ENTER Eli 3.65 52
SERVED
ENTER Trixie 4.75 53
ENTER Mika 3.7 54
SERVED
*/

