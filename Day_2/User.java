package Day_2;

import java.util.Scanner;

class User{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        System.out.println("Helloo " + name + " And Your are " + age + " years old...!");
    }
}