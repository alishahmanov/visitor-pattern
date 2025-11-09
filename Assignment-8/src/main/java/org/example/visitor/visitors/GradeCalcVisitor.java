package org.example.visitor.visitors;

import org.example.visitor.elements.*;

// Calculates grades for different assignments
// Each method shows how scoring logic can differ
public class GradeCalcVisitor implements AssignmentVisitor {

    @Override
    public void visit(Quiz quiz) {
        int score = (int)((double)quiz.getCorrectAnswers() / quiz.getMaxScore() * 100);
        System.out.println("Quiz \"" + quiz.getTitle() + "\" scored: " + score + "%");
    }

    @Override
    public void visit(Lab lab) {
        int score = lab.isCodeCompiled() ? 100 : 60;
        System.out.println("Lab \"" + lab.getTitle() + "\" result: " + score + "%");
    }

    @Override
    public void visit(ProjectWork project) {
        int score = 100 - (project.getTeammates() - 1) * 10;
        if (score < 0) score = 0;
        System.out.println("Project \"" + project.getTitle() + "\" final score: " + score + "%");
    }
}
