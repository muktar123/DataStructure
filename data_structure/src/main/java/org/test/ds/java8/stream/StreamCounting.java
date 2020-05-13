package org.test.stream;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.test.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class StreamCounting {
    public static long count(){
        return StudentDataBase.getAllStudents().stream().collect(counting());

    }
    public static void main(String[] args) {
        System.out.println(count());
    }

}
