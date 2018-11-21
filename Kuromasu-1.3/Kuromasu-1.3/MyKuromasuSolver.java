import edu.kit.iti.formal.kuromasu.*;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.TimeoutException;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Bitte beschreibe deine Implementierung.
 * @author Daniel Krueger
 */
public class MyKuromasuSolver extends KuromasuSolver {
    // Dieser Konstruktor ist notwendig f�r das automatisierte Testen.
    public MyKuromasuSolver(Kuromasu k) {
        super(k);
    }

    @Override
    public Solution solve() {
        // 1. Berechne die Klauselmenge f�r das in der Membervariable 'game'

        // 2. Rufe den SAT KuromasuSolver auf.

        // 3. Lese aus dem SAT KuromasuSolver heraus, welche Felder schwarz/wei� sind.

        //Angeben, ob eine L�sung vorliegt.

        //solution.setState(SolutionState.UNSAT);
        //solution.setState(SolutionState.SAT);

        // Have a lot of fun.

	    // Visualize the Solution graphically with 
	    // solution.show();
	    // or as a terminal output:
       	solution.print();

        return solution;
    }

    /**
     * Adds the given literals as one clause to the sat solver instance.
     * @param c the literals
     */
    private void addClause(int... c) {
        try {
            // Debugging:
            // System.out.println(Arrays.toString(c));
            solver.addClause(new VecInt(c));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
    }
}
