package ClassDiagram;

// Class representing a plane with an ID, model, and year of introduction
public class Plane {
    private String ID;                  // The unique identifier of the plane
    private String model;               // The model of the plane
    private int yearOfIntroductions;    // The year the plane was introduced
}
//        +---------------------------+
//        |           Plane           |
//        +---------------------------+
//        | - ID: String              |
//        | - model: String           |
//        | - yearOfIntroductions: int|
//        +---------------------------+
//        |                           |
//        +---------------------------+
