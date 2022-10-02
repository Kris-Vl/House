import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class main {
    /**
     * Основний метод класу main
     * Здійснюється виклик інших методів
     * @param args масив параметрів командного рядка
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House[] houses = new House[0];
        int N = 0;
        while(N != 5) {
            System.out.println("\nВиберіть потрібний пункт з меню:");
            System.out.println("1 - Ввести інформацію про квартири");
            System.out.println("2 - Вивести список квартир, які мають задане число кімнат");
            System.out.println("3 - Вивести список квартир, які мають задане число кімнат та розташовані на\n" +
                    "поверсі, який знаходиться в заданому проміжку");
            System.out.println("4 - Вивести  список квартир, які мають площу, що перевищує задану");
            System.out.println("5 - Вихід");
            N = scanner.nextInt();
            switch (N) {
                case 1:
                    houses = Info_About_House();
                    break;
                case 2:
                    Give_Number_Rooms(houses);
                    break;
                case 3:
                    Give_Number_Rooms_And_Floor(houses);
                    break;
                case 4:
                    Give_Square(houses);
                    break;
            }
        }
    }

    /**
     * Метод для створення та заповнення масиву даними
     * @return масив об'єктів типу House
     */
    public  static House[] Info_About_House (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість квартир: ");
        int n = scanner.nextInt();
        House[] houses = new House[n];
        for (int i = 0; i < n; i++) {
            House house = setHouse();
            houses[i] = house;
            System.out.println(" ");
        }
        return houses;
    }

    /**
     * Метод для виведення даних квартири, яка підходить під задану умову
     * Список квартир, які мають задане число кімнат
     * @param houses - масив об'єктів типу House
     */
    public  static void Give_Number_Rooms(House[] houses){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кімнат: ");
        int roomCount = scanner.nextInt();

        for (int i = 0; i < houses.length; i++)
            if (roomCount == houses[i].getCountRoom())
                System.out.print(houses[i].toString());
    }

    /**
     * Метод для виведення даних квартири, яка підходить під задану умову
     * Список квартир, які мають задане число кімнат та розташовані на
     * поверсі, який знаходиться в заданому проміжку
     * @param houses - масив об'єктів типу House
     */
    public static void Give_Number_Rooms_And_Floor(House[] houses){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кімнат: ");
        int roomCount = scanner.nextInt();

        System.out.print("Введіть проміжок поверхів\n");
        System.out.print("Від: ");
        int startFloor = scanner.nextInt();
        System.out.print("До:");
        int endFloor = scanner.nextInt();

        for (int i = 0; i < houses.length; i++){
            if (roomCount == houses[i].getCountRoom() && startFloor <= houses[i].getArea() && endFloor >= houses[i].getArea())
                System.out.print(houses[i].toString());
        }
    }

    /**
     * Метод для виведення даних квартири, яка підходить під задану умову
     * Список квартир, які мають площу, що перевищує задану
     * @param houses - масив об'єктів типу House
     */
    public static void Give_Square(House[] houses){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть площу: ");
        int square = scanner.nextInt();
        for (int i = 0; i < houses.length; i++)
            if (square <= houses[i].getStage())
                System.out.print(houses[i].toString());
    }

    /**
     * Метод для створення об'єкту та встановлення полів для нього
     * @return масив об'єктів
     */
    public static House setHouse() {
        Scanner scanner = new Scanner(System.in);

        House house = new House();

        System.out.println("Введіть id квартири: ");
        house.setID(scanner.nextInt());

        System.out.println("Введіть номер квартири: ");
        house.setNumberHouse(scanner.next());

        System.out.println("Введіть площу квартири: ");
        house.setStage(scanner.nextInt());

        System.out.println("Введіть поверх, на якому розташована квартира: ");
        house.setArea(scanner.nextInt());

        System.out.println("Введвть назву вулиці, на якій знаходиться будинок: ");
        house.setStreet(scanner.next());

        System.out.println("Введіть кількість кімнат в квартирі: ");
        house.setCountRoom(scanner.nextInt());

        return  house;
    }
}
