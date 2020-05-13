package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Optional;

public class ReduceStudentExample {

    public static Optional<Student> getHeighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                /*.reduce((s1,s2)-> {
                    if(s1.getGpa()>s2.getGpa()){
                        return s1;
                    }else{
                        return s2;
                    }
                });
                OR
                */
        .reduce((s1,s2)-> s1.getGpa()>s2.getGpa() ? s1 :s2);
    }

    public static void main(String[] args) {
        Optional<Student> studentdetails =getHeighestGpaStudent();
        if(studentdetails.isPresent())
            System.out.println(studentdetails.get());
    }
}
