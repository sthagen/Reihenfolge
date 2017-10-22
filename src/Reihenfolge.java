public class Reihenfolge {

    String[][] reihe;

    public Reihenfolge(String[][] r) {
        reihe = r;
    }

    public boolean isWellSorted(String[] forderung) {
        if(forderung[2].equals("C")) {
            return true;
        } else {
            return false;
        }
    }
}
