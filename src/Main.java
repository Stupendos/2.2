//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Gryffindor[] gryffindors = new Gryffindor[3];
//        gryffindors[0] = Gryffindor.getStudentGryffindor("Гарри", "Поттер", 79, 95, 80, 100, 79);
//        gryffindors[1] = Gryffindor.getStudentGryffindor("Гермиона", "Грейнджер", 65, 70, 76, 79, 80);
//        gryffindors[2] = Gryffindor.getStudentGryffindor("Рон", "Уизли", 60, 68, 79, 81, 78);
//
//        puffenduy[] puffenduys = new puffenduy[3];
//        puffenduys[0] = puffenduy.getStudentPuffenduy("Захария", "Смит", 62, 50, 79, 85, 91);
//        puffenduys[1] = puffenduy.getStudentPuffenduy("Седрик", "Диггори", 90, 91, 89, 96, 99);
//        puffenduys[2] = puffenduy.getStudentPuffenduy("Джастин", "Финч-Флетчли", 68, 67, 82, 70, 78);
//
//        Ravenclaw[] ravenclaws = new Ravenclaw[3];
//        ravenclaws[0] = Ravenclaw.getStudentRavenclaw("Чжоу", "Чанг", 71, 70, 88, 65, 76);
//        ravenclaws[1] = Ravenclaw.getStudentRavenclaw("Падма", "Патил", 70, 54, 83, 67, 72);
//        ravenclaws[2] = Ravenclaw.getStudentRavenclaw("Маркус", "Белби", 74, 58, 89, 69, 77);
//
//        Slytherin[] slytherins = new Slytherin[3];
//        slytherins[0] = Slytherin.getStudentSlytherin("Драко", "Малфой", 71, 77, 59, 74, 88, 71, 89);
//        slytherins[1] = Slytherin.getStudentSlytherin("Грэхем", "Монтегю", 65, 57, 50, 61, 69, 69, 67);
//        slytherins[2] = Slytherin.getStudentSlytherin("Грегори", "Гойл", 66, 67, 55, 65, 75, 64, 59);
////        Gryffindor.outputStudentGryffindor(gryffindors[1]);
//        puffenduy.outputStudentPuffenduy(puffenduys[1]);
//        Ravenclaw.outputStudentRawenclaw(ravenclaws[2]);
//        Slytherin.outputStudentSlytherin(slytherins[0]);
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 78, 51, 98, 75, 54);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 59, 56, 71, 69, 62);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 50, 51, 74, 70, 54);

        puffenduy zahariya = new puffenduy("Захария", "Смит", 51, 70, 68, 85, 71);
        puffenduy sedrik = new puffenduy("Седрик", "Дигори", 71, 75, 81, 75, 89);
        puffenduy jastin = new puffenduy("Джастин", "Финч-Флетчли", 52, 52, 79, 76, 77);

        Ravenclaw chzhou = new Ravenclaw("Чжоу", "Чанг", 70, 51, 70, 71, 85);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 51, 50, 72, 82, 90);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 56, 52, 76, 80, 79);

        Slytherin drako = new Slytherin("Драко", "Малфой", 66, 60, 61, 67, 64, 70, 80);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 58, 56, 59, 50, 57, 61, 63);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 59, 58, 62, 56, 60, 67, 70);

        harry.printlnStudent();
        sedrik.printlnStudent();
        padma.printlnStudent();
        drako.printlnStudent();

        ron.compareToGryffindors(harry);
        sedrik.compareToPuffenduy(zahariya);
        chzhou.compareToRavenclaw(padma);
        graham.compareToSlytheryn(drako);
        zahariya.compareOfStudents(chzhou);
    }
}