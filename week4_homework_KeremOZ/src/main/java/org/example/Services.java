package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.lang.Thread;

import static java.lang.System.out;

public class Services implements Runnable{

    public static void main(String[] args) throws InterruptedException {

        List<Student> studentList = new ArrayList<Student>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/student.json");
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonArray jsonArray = parser.parse(fileReader).getAsJsonArray();
            for (int i = 0; i < jsonArray.size(); i++) {

                Student student = gson.fromJson(jsonArray.get(i), Student.class);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bir Hata Meydana Geldi! Hata:" + e);
        }

        for (Student s : studentList) {

            System.out.println("ID: " + s.getId() + " " + s.getName() + " " + s.getSurName() + " " + s.getAge());
            Thread.sleep(3000);
        }
    }

    @Override
    public void run() {

    }
}
