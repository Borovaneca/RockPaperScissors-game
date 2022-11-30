import java.util.Random;
import java.util.Scanner;

public class Igra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] knh = {"Камък", "Ножица", "Хартия"};
        String compMove = knh[new Random().nextInt(knh.length)];

        System.out.println("Моля направете вашият ход (Камък, Ножица ли Хартия)");
        String player;
        while (true) {
            player = scanner.nextLine();
            compMove = knh[new Random().nextInt(knh.length)];
            if (player.equals("Стоп")){
                System.out.println("Благодаря за игрите!");
                break;
            }
            if (player.equals("Камък") || player.equals("Ножица") || player.equals("Хартия")) {
                System.out.println("Компютъра игра: " + compMove);
                if (player.equals(compMove)) {
                    System.out.println("Играта е равна!");
                    System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");

                } else if (player.equals("Камък")) {
                    if (compMove.equals("Хартия")) {
                        System.out.println("Ти загуби.");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Ножица")) {
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }

                } else if (player.equals("Хартия")) {
                    if (compMove.equals("Ножица")) {
                        System.out.println("Ти загуби.");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Камък")) {
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }
                } else {
                    if (compMove.equals("Камък")) {
                        System.out.println("Ти загуби.");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    } else if (compMove.equals("Хартия")) {
                        System.out.println("Ти спечели!");
                        System.out.println("Опитайте отново! За да спрете играта напишете Стоп.");
                    }
                }
            } else {
                System.out.println(player + " не е валиден ход. Опитайте отново.");
                continue;
            }
        }

    }
}
