public abstract class Shape {
    private String shapeName = "";

    //constructors
    public Shape(){}
    public Shape(String shapename){
        this.shapeName = shapename;
    }

    // Accessors
    public  String getShapeName(){return shapeName;}

    // Modifiers
    public void setShapeName(String shapeName) {this.shapeName = shapeName;}



    @Override
    /** An overrided method to get information about shape
     * @return String represents to info about shape*/
    public String toString() {
        return "Shape" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }

    /** An abstract method to compute area of the shape*/
    public abstract double computeArea();

    /** An abstract method to compute perimeter of the shape*/
    public abstract double computePerimeter();

    /** An abstract method to compute area of the shape*/
    public abstract void readShapeData();
}
