package org.example.visitor.visitors;

import org.example.visitor.elements.*;

// Creates a short summary report of all assignments
public class SummaryReportVisitor implements AssignmentVisitor {

    @Override
    public void visit(Quiz quiz) {
        System.out.println("[Report] Quiz: " + quiz.getTitle());
    }

    @Override
    public void visit(Lab lab) {
        System.out.println("[Report] Lab: " + lab.getTitle());
    }

    @Override
    public void visit(ProjectWork project) {
        System.out.println("[Report] Project: " + project.getTitle());
    }
}
