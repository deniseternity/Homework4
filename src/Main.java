public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
        System.out.println("Вы совершенолетний человек!");
        } else {
            System.out.println("Вы не достигли совершеннолетия, вам нужно неможко подождать!");
        }

        int weather = 5;
        if (weather <= 5) {
            System.out.println("На улице холодно,нужно надеть шапку");
        } else {
                System.out.println("На улице тепло,можно идти без шапки");
            }

            int speed = 60;
            if (speed > 60) {
                System.out.println("Если скорость" + speed + ",то придется заплатить штраф");
            } else {
                System.out.println("Если скорость" + speed + ",то можно ездить спокойно");
            }

        int age1 = 2;
        if (age1 >= 2) {
            System.out.println("Если возраст человека равен" + age1 + ",то ему пора спать.");
        }
        int age2 = 4;
        if (age2 < 6 || age2 > 2) {
            System.out.println("Если возраст человека равен" + age2 + ",то ему нужно ходить в детский сад.");
        }
        int age3  = 10;
        if (age2 < 18 || age2 > 7) {
            System.out.println("Если возраст человека равен" + age3 + ",то ему нужно ходить в школу.");
        }
        int age4 = 20;
        if (age4 < 24 || age2 > 18) {
            System.out.println("Если возраст человека равен" + age4 + ",то его место в университете.");
        }
        int age5 = 30;
        if (age4 < 24) {
            System.out.println("Если возраст человека равен" + age5 + ",то ему пора ходить на работу.");
        }
        int age6 = 65
        if (age6 <60) {
            System.out.println("Если возраст человека равен" + age6 + ",то он может отдохнуть.");
        }

        int ageKids1 = 3
        if (ageKids1 <5) {
            System.out.println("Если возраст ребенка равен" + ageKids1 + ",то ему нельзя кататься на аттракционе");
        }
        int ageKids2 = 10;
        if (ageKids2 < 5 || age2 > 14) {
            System.out.println("Если возраст ребенка равен" + ageKids2 + ",то ему можно кататься на аттракционе в сопровождении");
        }
        int ageKids3 = 16
        if (ageKids3 >16) {
            System.out.println("Если возраст ребенка равен" + ageKids3 + "то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int train = 106;
        int seat = 60;
        int stand = train - seat; 46;
        if (stand < 46 || seat < 60) {
            System.out.println("Есть место в вагоне");
        }
        if (seat <60) {
            System.out.println("есть сидячее место в вагоне.");
        }
        if (stand <46) {
            System.out.println("есть стоячее место в вагоне.");
        }
        if (stand = 46 || seat = 60) {
            System.out.println("вагон уже полностью забит");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        boolean thatMore = two > one || three > two;
        if (thatMore) {
            System.out.println(+ three + "большее число из трех.);
        }
    }










