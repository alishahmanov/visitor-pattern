package org.example.visitor.elements;

import org.example.visitor.visitors.AssignmentVisitor;

// Represents a Lab assignment
// It can be checked if the student's code compiles or not
public class Lab implements Assignment {
    private final String title;
    private final int maxScore;
    private final boolean codeCompiled;

    public Lab(String title, int maxScore, boolean codeCompiled) {
        this.title = title;
        this.maxScore = maxScore;
        this.codeCompiled = codeCompiled;
    }

    public boolean isCodeCompiled() {
        return codeCompiled;
    }

    // Standard accept method for the Visitor
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
