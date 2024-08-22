public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambitions;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String lastName, int powerOfMagic, int distanceOfTransgression, int cunning, int ambitions,
                     int determination, int resourcefulness, int lustForPower) {
        super(name, lastName, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.ambitions = ambitions;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public void printlnStudent() {
        super.printlnStudent();
        System.out.println("; хитрость - " + this.getCunning() + "; решительность - " + this.getDetermination() + "; амбициозность - " + this.getAmbitions() + "; находчивость - "
                + this.getResourcefulness() + "; жажда власти - " + this.getLustForPower());
    }

    public int getScoreSlytherin() {
        return this.getCunning() + this.getDetermination() + this.getAmbitions() + this.getResourcefulness() + this.getLustForPower();
    }

    public void compareToSlytheryn(Slytherin slytherin) {
        if (this.getScoreSlytherin() > slytherin.getScoreSlytherin()) {
            System.out.println(this.getName() + " лучший слизеринец, чем " + slytherin.getName());
        } else if (slytherin.getScoreSlytherin() > this.getScoreSlytherin()) {
            System.out.println(slytherin.getName()+" лучший слизеринец, чем " + this.getName());
        }
    }
}
