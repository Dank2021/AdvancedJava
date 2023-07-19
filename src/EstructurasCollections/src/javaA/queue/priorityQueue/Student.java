package javaA.queue.priorityQueue;

import java.util.List;
import java.util.PriorityQueue;

public class Student implements Comparable<Student>{
        int id;
        String name;
        double cgpa;
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

        @Override
        public int compareTo(Student other) {
        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa);
        } else if (!(this.name.equals(other.name))) {
            return this.name.compareTo(other.name);
        } else {
            return this.id - other.id;
        }
    }

}
