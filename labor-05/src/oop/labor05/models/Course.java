package oop.labor05.models;

public class Course {
    private final String name;
    private final String description;
    private final int numhours;

    public Course(String name, String description, int numhours) {
        this.name = name;
        this.description = description;
        this.numhours = numhours;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumhours() {
        return numhours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numhours=" + numhours +
                '}';
    }

}
