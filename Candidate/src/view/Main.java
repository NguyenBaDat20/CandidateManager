package view;


import controller.Manager;
import model.Candidate;
import java.util.ArrayList;

/**
 *
 * @author THAYCACAC
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        Manager a = new Manager();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    a.createCandidate(candidates, 0);
                    break;
                case 2:
                    a.createCandidate(candidates, 1);
                    break;
                case 3:
                    a.createCandidate(candidates, 2);
                    break;
                case 4:
                    a.searchCandidate(candidates);
                    break;
                case 5:
                    return;
            }
        }
    }
}
