import java.util.Random;
import java.util.Scanner;
 
//Code maded by Petyo Veselinov and Sivo Penev
 
public class Igra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int plStone = 0;
        int plScissors = 0;
        int plPaper = 0;
        int compStone = 0;
        int compScissors = 0;
        int compPaper = 0;
        int plWins = 0;
        int plLosses = 0;
        int draw = 0;
        int totalGames = 0;
 
        String[] knh = {"Камък", "Ножица", "Хартия"};
        String compMove = knh[new Random().nextInt(knh.length)];
 
        System.out.println("Моля направете вашият ход (Камък, Ножица или Хартия)");
        String player;
 
        while (true) {
            player = scanner.nextLine();
            if(player.equals("камък")){
                player="Камък";
            }
            if(player.equals("ножица")){
                player="Ножица";
            }
            if(player.equals("хартия")){
                player="Хартия";
            }
            if(player.equals("стоп")){
                player="Стоп";
            }
            compMove = knh[new Random().nextInt(knh.length)];
 
 
            if (player.equals("Стоп")) {
                System.out.printf("Изиграни игри: %d%n", totalGames);
                System.out.printf("Победи: %d%n", plWins);
                System.out.printf("Загуби: %d%n", plLosses);
                System.out.printf("Равни %d%n", draw);
                System.out.printf("Играхте с: Камък %d, Ножица %d, Хартия %d%n", plStone, plScissors, plPaper);
                System.out.printf("Компютърът игра с: Камък %d, Ножица %d, Хартия %d%n", compStone, compScissors, compPaper);
                break;
            }
 
            if (player.equals("Камък") || player.equals("Ножица") || player.equals("Хартия")) {
                System.out.println("Компютъра игра: " + compMove);
 
                switch (compMove) {
                    case "Камък" -> compStone++;
                    case "Ножица" -> compScissors++;
                    case "Хартия" -> compPaper++;
                }
                if (player.equals(compMove)) {
                    if (player.equals("Камък")) {
                        plStone++;
                    } else if (player.equals("Ножица")) {
                        plScissors++;
                    } else {
                        plPaper++;
                    }
 
                    draw++;
                    System.out.println("Играта е равна!");
                    System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
 
                } else if (player.equals("Камък")) {
                    plStone++;
                    if (compMove.equals("Хартия")) {
                        plLosses++;
                        System.out.println("Ти загуби!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Ножица")) {
                        plWins++;
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }
 
                } else if (player.equals("Хартия")) {
                    plPaper++;
                    if (compMove.equals("Ножица")) {
                        plLosses++;
                        System.out.println("Ти загуби.");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Камък")) {
                        plWins++;
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }
                } else {
                    if (compMove.equals("Камък")) {
                        plScissors++;
                        plLosses++;
                        System.out.println("Ти загуби!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Хартия")) {
                        plScissors++;
                        plWins++;
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }
                }
                totalGames++;
            } else {
                System.out.println(player + " не е валиден ход. Опитайте отново.");
                continue;
            }
        }
    }
}
