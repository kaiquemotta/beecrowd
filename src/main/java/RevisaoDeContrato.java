import java.math.BigInteger;
import java.util.Scanner;

public class RevisaoDeContrato {
    private static final BigInteger ZERO = BigInteger.ZERO;

    public static void main(String[] args) {

        BigInteger verify = BigInteger.ONE;
        BigInteger value = BigInteger.ONE;
        Scanner scanner = new Scanner(System.in);


        while (!ZERO.equals(verify) && !ZERO.equals(value)) {
            verify = scanner.nextBigInteger();
            value = scanner.nextBigInteger();
            if (!verify.equals(ZERO) && !value.equals(ZERO)) {
                String sol = String.valueOf(value).replace(String.valueOf(verify), "");
                BigInteger solution = sol.isEmpty() ? new BigInteger("0") : new BigInteger(sol);
                System.out.println(solution);
            }
        }
    }
}
