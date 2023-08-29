

public class Main {
    public static void main(String[] args) {
        int age = 19;
        System.out.print("Если возраст человека равен " + age + ", то");
        if(age >= 18){
            System.out.print(" он совершеннолетний");
        }else{
            System.out.print(" он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2

        int temperature = 3;
        System.out.println("");
        System.out.print("На улице " + temperature + " градусов,");
        if(temperature <= 5){
            System.out.print(" нужно надеть шапку");
        }else{
            System.out.print(" можно идти без шапки");
        }

        //Task 3

        int speed = 61;
        System.out.println("");
        System.out.print("Если скорость " + speed + ", то");
        if(speed <= 60){
            System.out.print(" можно ездить спокойно");
        }else{
            System.out.print(" придется заплатить штраф");
        }

        // Task 4
        age = 25;
        System.out.println("");
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить");
        if(age >= 2 && age <= 6){
            System.out.print(" в десткий сад.");
        } else if(age >= 7 && age <= 18){
            System.out.print(" в школу");
        } else if(age >= 19 && age <= 24){
            System.out.print(" в университет");
        }else{
            System.out.print(" на работу");
        }

        // Task 5

        int childsAge = 13;
        System.out.println("");
        System.out.print("Если возраст ребенка равен " + childsAge + ", то ");
        if(age > 5){
            System.out.print("нельзя кататься на аттракционе");
        } else if(age >= 5 && age<14 ){
            System.out.print(" можно кататься на аттракционе в сопровождении.");
        }else{
            System.out.print("без сопровождения взрослого.");
        }

        //Task 6

        int wagonPlaces = 102;
        int seats = 60;
        int standingPlaces = wagonPlaces - seats;
        int peopleInWagon = 103;
        System.out.println("");
        if(peopleInWagon <= seats){
            System.out.println("В вагоне еще есть сидячих мест: " + (seats - peopleInWagon));
        } else if (peopleInWagon>= seats && peopleInWagon <= wagonPlaces){
            System.out.println("В вагоне еще есть стоячих мест: " + (wagonPlaces - peopleInWagon));
        } else {
            System.out.println("Вагон полностью забит!");
        }
        // Task 7
        int one = 1;
        int two = 3;
        int three = 7;
        if(one > two && one > three){
            System.out.println("Самое большое число: " + one);
        } else if(two > three){
            System.out.println("Самое большое число: " + two);
        } else{
            System.out.println("Самое большое число: " + three);
        }





    }
}