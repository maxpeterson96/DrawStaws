import java.util.Random;
import java.util.ArrayList;

class Student{

    String name;
    int[] problems;
    int index;

    Student(String name){
        this.name = name;
        problems = new int[2];
        index = 0;
    }

    public void addProblemNum(Integer number){
        problems[index] = number + 1;
        index++;
    }

    public String toString(){
        return name+" will do problems "+problems[0]+" and "+problems[1];
    }
}

public class Draw {

    public static void main(String[] args) {

        Random rand = new Random();
        Integer randomNum;
        ArrayList<Integer> randomProblemsNumbers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        String[] names = {"Max","Klaudia","Sela","Lara"};
        int index = 0;

        for (String name: names){
            Student newStudent = new Student(name);
            students.add(newStudent);
        }

        while (randomProblemsNumbers.size() < 8){
            randomNum = rand.nextInt(8);
            if (!randomProblemsNumbers.contains(randomNum)){
                randomProblemsNumbers.add(randomNum);
            }
        }

        while (index < 8){
            for (Student student: students){
                student.addProblemNum(randomProblemsNumbers.get(index));
                index++;
            }
        }

        for (Student student: students){
            System.out.println(student);
        }
    }
}
