public class puffenduy extends hogwarts {
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public puffenduy(String name, String lastName, int powerOfMagic, int distanceOfTransgression, int hardWorking, int loyalty, int honesty) {
        super(name, lastName, powerOfMagic, distanceOfTransgression);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        honesty = honesty;
    }

    @Override
    public void printlnStudent() {
        super.printlnStudent();
        System.out.println("; трудолюбие - " + this.getHardWorking() + "; верность - " + this.getLoyalty() + "честность - " + this.getHonesty());
    }

    public int getScorePuffenduy() {
        return this.getHardWorking() + this.getLoyalty() + this.getHonesty();
    }

    public void compareToPuffenduy(puffenduy puffenduy) {
        if (this.getScorePuffenduy() > puffenduy.getScorePuffenduy()) {
            System.out.println(this.getName() + " лучший пуффендуец, чем " + puffenduy.getName());
        } else if (puffenduy.getScorePuffenduy() < this.getScorePuffenduy()) {
            System.out.println(puffenduy.getName() + " лучший пуффендуец, чем " + puffenduy.getName());
        }
    }
}