package by.pev.unit4_Classes.SimpleClass3;

public class Student {
    private String secondName;
    private String initials;
    private int numberGroup;
    private int[] progress = new int[5];


    public Student(String secondName, String initials, int numberGroup, int[] progress) {
        this.secondName = secondName;
        this.initials = initials;
        this.numberGroup = numberGroup;
        this.progress = progress;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }
}
