

public class Main {
    public static void main(String[] args) {

        //Task 1

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.print("Установите версию приложения для iOS по ссылке");
        }

        // Task 2
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.print("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //Task 3
        int year = 2400;
        int yearStart = 1584;
        if ((year - yearStart) % 4 == 0 && year >= 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4

        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance < 20 && deliveryDistance > 0) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        int monthNumber = 14;
        switch (monthNumber) {
            case 1, 2, 12: {
                System.out.println("Зима");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Лето");
            }
            case 9, 10, 11: {
                System.out.println("Осень");
                break;
            }
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}