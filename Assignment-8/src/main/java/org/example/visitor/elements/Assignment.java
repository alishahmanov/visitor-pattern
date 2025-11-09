package org.example.visitor.elements;

import org.example.visitor.visitors.AssignmentVisitor;

// Base interface for all types of assignments
// Each assignment must accept a visitor and provide basic info
public interface Assignment {
    void accept(AssignmentVisitor visitor);
    String getTitle();
    int getMaxScore();
}
