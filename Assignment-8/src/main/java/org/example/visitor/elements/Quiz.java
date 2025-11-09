package org.example.visitor.elements;

import org.example.visitor.visitors.AssignmentVisitor;

// Represents a Quiz assignment with number of correct answers
public class Quiz implements Assignment {
    private final String title;
    private final int maxScore;
    private final int correctAnswers;

    public Quiz(String title, int maxScore, int correctAnswers) {
        this.title = title;
        this.maxScore = maxScore;
        this.correctAnswers = correctAnswers;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    // Here we “accept” a visitor and call its visit method
    @Override
    public void accept(AssignmentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getMaxScore() {
        return maxScore;
    }
}
