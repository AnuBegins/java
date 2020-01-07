import java.util.*;

public class ProjectTest {

	public static void main(String[] args) {

		Project investment1 = new Project();
        String pitch1       = investment1.elevatorPitch();

		Project investment2 = new Project("Buy NFLX", "100 shares @ 200", 20000 );
        String pitch2       = investment2.elevatorPitch();

        Project investment3 = new Project("Buy AAPL", "100 shares @ 207.99", 20799);
        String pitch3       = investment3.elevatorPitch();


		Project investment4 = new Project("Buy NKE", "100 shares @ 78.74", 7874.00);
        String pitch4       = investment4.elevatorPitch();

        Portfolio port = new Portfolio();
        port.addProjectToPortfolio(investment1);
        port.addProjectToPortfolio(investment2);
        port.addProjectToPortfolio(investment3);
        port.addProjectToPortfolio(investment4);

        //System.out.println("Portfolio cost: "+ port.getPortfolioCost());

        port.showPortfolio();

	}

}