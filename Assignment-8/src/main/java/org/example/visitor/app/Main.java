package org.example.visitor.app;

import org.example.visitor.elements.*;
import org.example.visitor.visitors.*;

import java.util.List;

// Entry point of the program
// Demonstrates the Visitor Pattern in a simple educational scenario
public class Main {
    public static void main(String[] args) {

        // Create a few example assignments
        List<Assignment> assignments = List.of(
                new Quiz("Quiz 1", 10, 8),
                new Lab("Lab 2", 100, true),
                new ProjectWork("Final Project", 100, 3)
        );

        // Create visitors that will perform different operations
        AssignmentVisitor reportVisitor = new SummaryReportVisitor();
        AssignmentVisitor plagiarismVisitor = new PlagiarismCheckVisitor();
        AssignmentVisitor gradeVisitor = new GradeCalcVisitor();

        // Each visitor performs its own action for every assignment
        for (Assignment a : assignments) {
            a.accept(reportVisitor);
            a.accept(plagiarismVisitor);
            a.accept(gradeVisitor);
            System.out.println("----------------------------");
        }
    }
}
