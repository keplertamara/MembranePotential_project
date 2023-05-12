package simulation;

import front.Diagram;
import front.SlideBars;

import java.util.List;

public class MembranePotentials {
    public MembranePotentials() {
        for(int i = 0; i<101; i++) {
            Values.NaPotential.add(0.0);
            Values.chloridePotential.add(0.0);
            Values.potassiumPotential.add(0.0);
            Values.overallPotential.add(0.0);
        }
    }

    public void simulate() {
            SlideBars slideBars = new SlideBars();
            slideBars.updateValues();
            Diagram diagram = new Diagram();


        while (true) {
            slideBars.updateValues();
            diagram.updateDiagram();

            try {
                Thread.sleep(100); // wait for 100 milliseconds (0,1 second)
            } catch (Exception e) {
                // handle the exception (if any)
            }
        }
    }
}

