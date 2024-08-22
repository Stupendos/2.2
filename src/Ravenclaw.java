public class Ravenclaw extends hogwarts {
    private int mind;
    private int wisdom;
    private int creation;

    public Ravenclaw(String name, String lastName, int powerOfMagic, int distanceOfTransgression, int mind, int wisdom, int creation) {
        super(name, lastName, powerOfMagic, distanceOfTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public void printlnStudent() {
        super.printlnStudent();
        System.out.println("; ум - " + this.getMind() + "; остроумие - " + this.getWisdom() + "; творчество " + this.getCreation());
    }

    public int getScoreRavenclaw() {
        return this.getCreation() + this.getWisdom() + this.getMind();
    }

    public void compareToRavenclaw(Ravenclaw ravenclaw) {
        if (this.getScoreRavenclaw() > ravenclaw.getScoreRavenclaw()) {
            System.out.println(this.getName() + "лучший когтевранец, чем" + ravenclaw.getName());
        } else if (ravenclaw.getScoreRavenclaw() > this.getScoreRavenclaw()) {
            System.out.println(ravenclaw.getName() + " лучший когтевранец, чем " + this.getName());
        }
    }
}
