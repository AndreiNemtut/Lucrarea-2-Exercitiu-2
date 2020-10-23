package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int studentsNumber;
        studentsNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number of students:"));
        Student[] studentInfo = new Student[studentsNumber + 1];
        for(int i = 1; i <= studentsNumber; i++) {
            studentInfo[i] = new Student();
            studentInfo[i].setName(JOptionPane.showInputDialog(null, "Student #" + i + "\nInput his/her name:"));
            studentInfo[i].setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Student #" + i + "\nInput his/her age:")));
        }
        for(int i = 1; i <= studentsNumber; i++) {
            JOptionPane.showMessageDialog(null, studentInfo[i].toString());
        }
    }
}
