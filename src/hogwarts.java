public class hogwarts {
    private String name;
    private String lastName;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public hogwarts(String name, String lastName, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public void printlnStudent() {
        System.out.print("Имя - " + this.getName() + "; фамилия - " + this.getLastName() + "; сила колдовства - " + this.getPowerOfMagic() + "; расстояние трансгрессирования - " + this.getDistanceOfTransgression());
    }

    public int getScoreGeneralQualities() {
        return this.getPowerOfMagic() + this.getDistanceOfTransgression();
    }

    public void compareOfStudents(hogwarts student) {
        if (student.getScoreGeneralQualities() > this.getScoreGeneralQualities()) {
            System.out.println("Сила магии " + student.getName() + " больше, чем сила магии " + this.getName());
        } else if (this.getScoreGeneralQualities() > student.getScoreGeneralQualities()) {
            System.out.println("Сила магии " + this.getName() + " больше, чем сила магии " + student.getName());
        } else {
            System.out.println("Сила магии учеников равны");
        }
    }
}
