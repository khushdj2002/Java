package abhijith;

import java.util.Scanner;

public class OOps_Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players ");
        int n = sc.nextInt();
        PlayerRecords[] obj = new PlayerRecords[n];//
        for (int i = 0; i < n; i++) {
            obj[i] = new PlayerRecords();
            // PlayerRecords pa=new PlayerRecords();
            System.out.print("Enter name: ");
            obj[i].setName(sc.next());
            System.out.print("Enter age: ");
            obj[i].setAge(sc.nextInt());
            System.out.print("Enter the salary: ");
            obj[i].setSalary(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Information of Player "+(i+1));
            System.out.println(obj[i].getName());
            System.out.println(obj[i].getAge());
            System.out.println(obj[i].getSalary());
        }
    }
}
