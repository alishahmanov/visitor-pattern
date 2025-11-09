package org.example.visitor.elements;

import org.example.visitor.visitors.AssignmentVisitor;

// Represents a big final project
// Includes number of teammates working together
public class ProjectWork implements Assignment {
    private final String title;
    private final int maxScore;
    private final int teammates;

    public ProjectWork(String title, int maxScore, int teammates) {
        this.title = title;
        this.maxScore = maxScore;
        this.teammates = teammates;
    }

    public int getTeammates() {
        return teammates;
    }

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
