public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int adultAge = 18;
        if (adultAge >= 18) {
            System.out.println("Если возраст человека равен " + adultAge + ", то он совершеннолетний");
        }
        if (adultAge < 18) {
            System.out.println("Если возраст челоека равен " + adultAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача №2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задача №3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Задача №4");
        int personAge = 28;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если человеку " + personAge + " лет, то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если человеку " + personAge + " лет, то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если человеку " + personAge + " лет, то его место в университете");
        } else if (personAge > 24) {
            System.out.println("Если человеку " + personAge + " лет, то ему пора ходить на работу");
        }

        System.out.println("Задача №5");
        int childAge = 9;
        if (childAge < 5) {
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если ребенку " + childAge + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (childAge > 14) {
            System.out.println("Если ребенку " + childAge + " лет, то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача №6");
        int peopleinCarriage = 55;
        if (peopleinCarriage <= 102) {
            if (peopleinCarriage >60 && peopleinCarriage <= 102) {
                System.out.println("В вагоне есть место. Место стоячее");
            }
                else {
                    System.out.println("В вагоне есть место. Место сидячее");
            }
        }
        else {
            System.out.println("Вагон переполнен");
        }

        System.out.println("Задача №7");
        int one = 25;
        int two = 2;
        int three = 25;
        if (one>two && one>three) {
            System.out.println("число " + one + " - самое большое");
        }
        else if (two>one && two>three) {
            System.out.println("число " + two + " - самое большое");
        }
        else if (three>one && three>two) {
            System.out.println("число " + three + " - самое большое");
        }
        else if (one == two) {
            System.out.println("число " + one + " - самое большое");
        }
        else if (one == three) {
            System.out.println("число " + one + " - самое большое");
        }
        else if (two == three) {
            System.out.println("число " + two + " - самое большое");
        }


    }
}
