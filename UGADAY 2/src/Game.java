import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private final InputStrategy inputStrategy;
    public Game(InputStrategy inputStrategy) {
        this.inputStrategy = inputStrategy;
    }
    public void start() {
        numberToGuess = inputStrategy.getNumber();
        System.out.println("Угадай число!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введи число: ");
            int playerGuess = scanner.nextInt();
            if (playerGuess < numberToGuess) {
                System.out.println("Больше");
              } else if (playerGuess > numberToGuess) {
                System.out.println("Меньше");
               } else {
                System.out.println("Красава угадал " + numberToGuess);
                break;
               }
            }
        scanner.close();
        }
        public static void main(String[] args) {
        System.out.println("Выберите режим: ");
        System.out.println("1 - Против AI");
        System.out.println("2 - Против игрока");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        InputStrategy inputStrategy;
        switch (choice){
            case 1: inputStrategy = new ComputerInput();
            break;
            case 2: inputStrategy = new FileInput();
            break;
            default:
                System.out.println("Некорктный ввод");
                return;
        }

        Game game = new Game(inputStrategy);
        game.start();
        scanner.close();
        }
    }

