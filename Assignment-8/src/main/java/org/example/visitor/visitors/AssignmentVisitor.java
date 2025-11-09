package org.example.visitor.visitors;

import org.example.visitor.elements.*;

// Visitor interface — defines visit methods for each type of assignment
public interface AssignmentVisitor {
    void visit(Quiz quiz);
    void visit(Lab lab);
    void visit(ProjectWork project);
}
