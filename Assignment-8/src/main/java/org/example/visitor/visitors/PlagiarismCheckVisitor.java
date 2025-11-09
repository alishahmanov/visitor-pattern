package org.example.visitor.visitors;

import org.example.visitor.elements.*;

// Checks each assignment for plagiarism
// Just prints some simulated messages for simplicity
public class PlagiarismCheckVisitor implements AssignmentVisitor {

    @Override
    public void visit(Quiz quiz) {
        System.out.println("Checking plagiarism for Quiz: " + quiz.getTitle() + " ... Passed ✅");
    }

    @Override
    public void visit(Lab lab) {
        System.out.println("Checking plagiarism for Lab: " + lab.getTitle() + " ... Passed ✅");
    }

    @Override
    public void visit(ProjectWork project) {
        System.out.println("Checking plagiarism for Project: " + project.getTitle() + " ... Possible duplicate ⚠️");
    }
}
