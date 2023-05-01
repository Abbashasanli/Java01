package homeworks.lesson22;

import java.util.Arrays;

public class ImmutabilityApp {
    public static void main(String[] args) {
        final int a = 5;
        final int[] num = new int[]{4, 5,};
        System.out.println(Arrays.toString(num));
        num[0]=8;
        System.out.println(Arrays.toString(num));
        Student student = new Student(24, new double[]{34, 90});
        int age= student.getAge();
        System.out.println(age);
        age=100;
        System.out.println(age);
        System.out.println(student.getAge());

        System.out.println(student.getAge());
      double[]grades= student.getGrades();
        System.out.println(grades[0]);
        System.out.println(student.getGrades()[0]);
      grades[0]=100;
        System.out.println(grades[0]);
        System.out.println(student.getGrades()[0]);
        System.out.println(Arrays.toString(grades.clone()));



    }


}

