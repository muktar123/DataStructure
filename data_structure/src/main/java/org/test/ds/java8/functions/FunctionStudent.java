package org.test.functions;

import org.test.data.Student;
import org.test.data.StudentDataBase;
import org.test.prdicate.StudentPredicateExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudent {

    static Function<List<Student>, Map<String, Double>> listMapFunction =(students -> {
        Map<String, Double> studMap = new HashMap();
        
        students.forEach((student -> {
            if(StudentPredicateExample.p1.test(student)) //import predicate class reusability
            studMap.put(student.getName(), student.getGpa());
        }));
            return studMap;
    });

    public static void main(String[] args) {
        System.out.println(listMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
