package edu.eci.cvds.patterns.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {
    @Override
    public int getNumberOfEdges() {
        return 6;
    }
}
