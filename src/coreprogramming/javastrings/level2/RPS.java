package coreprogramming.javastrings.level2;

import java.util.Scanner;

class RPS {

    static String computerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String result = winner(user, comp);

            if (result.equals("User")) userWin++;
            if (result.equals("Computer")) compWin++;
        }

        System.out.println("User Win %: " + (userWin * 100.0 / games));
        System.out.println("Computer Win %: " + (compWin * 100.0 / games));
    }
}

