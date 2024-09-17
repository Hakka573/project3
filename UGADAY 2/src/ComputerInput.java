import java.util.Random;

public class ComputerInput implements  InputStrategy {
    @Override
    public int  getNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}