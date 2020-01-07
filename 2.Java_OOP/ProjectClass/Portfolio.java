import java.util.*;

public class Portfolio {

    private ArrayList<Project> projects = new ArrayList<Project>();

// ------------------ CONSTRUCTORS ------------------------------

    public Portfolio() {
        Project project = new Project();
        projects.add(project);
    }


// ----------------------Getters and Setters---------------------------------

	public ArrayList<Project> getPortfolioProjects() {
		return projects;
	}

//------------------------INSTANCE METHODS-------------------------------------------

    public ArrayList<Project> addProjectToPortfolio(Project project) {
        projects.add(project);
        return projects;
    }

	public double getPortfolioCost() {
		double cost = 0;
		for (Project project : projects) {
			cost += project.getInitialCost();
		}
		return cost;
	}

	public void showPortfolio() {
		for (Project project : projects ) {
			System.out.println(project.elevatorPitch());
		}
		System.out.println("Total cost: "+getPortfolioCost());
	}



}