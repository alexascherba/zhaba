package Task1;

public class Magistracy extends Student {
    private int scienceWork;
    public Magistracy(String firstName, String lastName, String group, double averageMark, int scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    int getScholarship() {
        if (getAverageMark() >= 5) {
            if (getAverageMark() >= 8) {
                return 200;
            }
            else {
                return 180;
            }
        } else return 0;
    }
    public void show() {
        super.show();
        System.out.println("Science works " + getScienceWork());
    }
    public void setScienceWork(int scienceWork) {
        this.scienceWork = scienceWork;
    }
    public int getScienceWork() {
        return scienceWork;
    }
}
