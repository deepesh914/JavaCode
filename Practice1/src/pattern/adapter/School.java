package pattern.adapter;

public class School {

    public static void main(String[] args) {

        // PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork asw = new AssignmentWork();
        asw.setP(p);
        asw.writeAssignment("I am bit tired to work now");
    }
}
