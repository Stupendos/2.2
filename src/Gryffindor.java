
public class Gryffindor extends hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String lastName, int powerOfMagic, int distanceOfTransgression, int nobleness, int honor, int bravery) {
        super(name, lastName, powerOfMagic, distanceOfTransgression);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printlnStudent() {
        super.printlnStudent();
        System.out.println("; благородство - " + this.getNobleness() + "; честь - " + this.getHonor() + "; храбрость - " + this.getBravery());
    }

    public int getScoreGryffindor() {
        return this.getNobleness() + this.getHonor() + this.getBravery();
    }

    public void compareToGryffindors(Gryffindor gryffindor) {
        if (this.getScoreGryffindor() > gryffindor.getScoreGryffindor()) {
            System.out.println(this.getName() + " лучший гриффиндорец, чем " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " лучший гриффиндорец, чем " + this.getName());
        }
    }
}

































