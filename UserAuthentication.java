//Program to generate token if the user is Authorized
//No. of digit of token is asked by user

import java.util.Scanner;

public class UserAuthentication {

    public static void main(String[] args) {
        String arr[][] = new String[][] { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" },
                { "user4", "pass4" }, { "user5", "pass5" } };

        Scanner sc = new Scanner(System.in);
        String name = "user2";// sc.next();
        String password = "pass2";// sc.next();
        int p = 5;// sc.nextInt();
        sc.close();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i][0]) && password.equals(arr[i][1])) {

                int smallest = (int) Math.pow(10, p - 1);
                int largest = (int) Math.pow(10, p) - 1;
                for (int j = smallest; j <= largest; j++) {
                    int temp = j;
                    int sum = 0;
                    while (temp > 0) {
                        int r = temp % 10;
                        sum = (sum * 10) + r;
                        temp = temp / 10;
                    }
                    if (j == sum) {
                        System.out.println("Authorized" + " " + sum);
                        flag = 1;
                        break;
                    }
                }
                break;
            }

        }
        if (flag == 0) {
            System.out.println("Not Authorized ");

        }
    }
}
