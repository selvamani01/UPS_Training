
import java.util.Scanner;

public class PatternAtoZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a capital letter (A-Z): ");
        char ch = Character.toUpperCase(sc.next().charAt(0));

        int l = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                if (ch == 'A') {
                    if (j == 0 || i == 0 || i == l / 2 || j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'B') {
                    if (j == 0 || i == 0 || i == l / 2 || i == l - 1 || j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'C') {
                    if (i == 0 || i == l - 1 || j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'D') {
                    if (j == 0 || i == 0 || i == l - 1 || j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'E') {
                    if (j == 0 || i == 0 || i == l / 2 || i == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'F') {
                    if (j == 0 || i == 0 || i == l / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'G') {
                    if (i == 0 || i == l - 1 || j == 0 ||
                        (i == l / 2 && j >= l / 2) ||
                        (j == l - 1 && i >= l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'H') {
                    if (j == 0 || j == l - 1 || i == l / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'I') {
                    if (i == 0 || i == l - 1 || j == l / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'J') {
                    if (i == 0 || j == l / 2 ||
                        (i == l - 1 && j < l / 2) ||
                        (j == 0 && i == l - 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'K') {
                    if (j == 0 || i + j == l - 1 || i == j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'L') {
                    if (j == 0 || i == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'M') {
                    if (j == 0 || j == l - 1 ||
                        i == j || i + j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'N') {
                    if (j == 0 || j == l - 1 || i == j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'O') {
                    if (i == 0 || i == l - 1 || j == 0 || j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'P') {
                    if (j == 0 || i == 0 || i == l / 2 ||
                        (j == l - 1 && i < l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'Q') {
                    if (i == 0 || i == l - 1 || j == 0 || j == l - 1 ||
                        (i == j && i >= l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'R') {
                    if (j == 0 || i == 0 || i == l / 2 ||
                        (j == l - 1 && i < l / 2) ||
                        (i == j && i >= l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'S') {
                    if (i == 0 || i == l / 2 || i == l - 1 ||
                        (j == 0 && i < l / 2) ||
                        (j == l - 1 && i > l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'T') {
                    if (i == 0 || j == l / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'U') {
                    if (j == 0 || j == l - 1 || i == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'V') {
                    if ((j == 0 && i < l - 1) ||
                        (j == l - 1 && i < l - 1) ||
                        (i + j == l - 1 && i >= l / 2) ||
                        (i == j && i >= l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'W') {
                    if (j == 0 || j == l - 1 ||
                        (i == j && i >= l / 2) ||
                        (i + j == l - 1 && i >= l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'X') {
                    if (i == j || i + j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'Y') {
                    if ((i == j && i <= l / 2) ||
                        (i + j == l - 1 && i <= l / 2) ||
                        (j == l / 2 && i > l / 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (ch == 'Z') {
                    if (i == 0 || i == l - 1 || i + j == l - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
