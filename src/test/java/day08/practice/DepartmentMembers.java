package day08.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentMembers {

    public static void main(String[] args) {
        String input1 = "HR,Ram,HR,Suresh,HR,John";
        String input2 = "HR,Ram,IT,Suresh,Admin,Basker";
        String input3 = "";
        String input4 = "HR Ram, IT;Suresh, Admin|John";
        String input5 = "HR,Ram,HR,Ram,IT,Suresh,IT,Suresh";
        String input6 = "@dept,#emp,@dept1,#emp1,@dept,#emp2";

        runTest(input1);
        runTest(input2);
        runTest(input3);
        runTest(input4);
        runTest(input5);
        runTest(input6);
    }

    public static void runTest(String input) {
        String[] parts = input.split(",");

        Map<String, List<String>> departmentEmployees = new HashMap<>();

        for (int i = 0; i < parts.length; i += 2) {
            String department = parts[i];
            String employee = parts[i + 1];

            if (departmentEmployees.containsKey(department)) {
                List<String> employees = departmentEmployees.get(department);
                employees.add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployees.put(department, employees);
            }
        }

        System.out.println("Input: " + input);
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(department + ": " + String.join(", ", employees));
        }
        System.out.println();}}
  