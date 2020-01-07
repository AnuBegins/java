import java.util.*;

public class Project {

    private String name;
    private String description;
    private double initialCost;

//--------------------------CONSTRUCTORS------------------------------------------
    public Project() {
        this("","",0);
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

//------------------------INSTANCE METHODS-------------------------------------------
    public String elevatorPitch() {
        String pitch = name+" ("+initialCost+"): "+description;
      //  System.out.println("| "+pitch+" |");
        return pitch;
    }

// ----------------------Getters and Setters---------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDescription(String desc) {
        description = desc;
    }
    public String getDescription() {
        return description;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    public double getInitialCost() {
        return initialCost;
    }




}