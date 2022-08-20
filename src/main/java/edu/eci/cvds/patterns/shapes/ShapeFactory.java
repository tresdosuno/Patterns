package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.concrete.Hexagon;
import edu.eci.cvds.patterns.concrete.Pentagon;
import edu.eci.cvds.patterns.concrete.Quadrilateral;
import edu.eci.cvds.patterns.concrete.Triangle;

public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Hexagon: return new Hexagon();
            case Pentagon: return new Pentagon();
            case Triangle: return new Triangle();
            case Quadrilateral: return new Quadrilateral();
        }
        return null;
    }
}
