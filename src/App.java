public class App {
    public static void main(String[] args) throws Exception {

        String AMARILLO = "\u001B[33m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String BLUE = "\u001B[34m";
        String CYAN = "\u001B[36m";
        String ORANGE = "\u001B[38;5;<202>m";
        String PURPLE = "\u001B[38;5;<53>m";
        String PINK = "\u001B[38;5;<201>m";
        String RESET = "\u001B[0m";

        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.printf("%-1s%51s%n", "│", "│");
        System.out.printf("%-1s%7s%10s%10s%10s%10s%4s%n", "│", "Lunes", "Martes", "Miérc.", "Jueves.", "Viernes", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%15s%18s%19s%12s%14s%9s%n", "│", AMARILLO + "PROG" + RESET, VERDE + "IPEI" + RESET,
                AMARILLO + "PROG" + RESET, BLUE + "LM", "LM" + RESET, "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%15s%18s%19s%16s%19s%9s%n", "│", AMARILLO + "PROG" + RESET, VERDE + "IPEI" + RESET,
                AMARILLO + "PROG" + RESET, BLUE + "LM" + RESET, ROJO + "BD" + RESET, "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%15s%18s%19s%12s%14s%9s%n", "│", CYAN + "SI" + RESET, VERDE + "IPEI" + RESET,
                AMARILLO + "PROG" + RESET, ROJO + "BD", "BD" + RESET, "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%15s%18s%25s%17s%18s%10s%n", "│", CYAN + "SI" + RESET, AMARILLO + "PROG" + RESET,
                PURPLE + "DIG" + RESET, ROJO + "BD" + RESET, CYAN + "SI" + RESET, "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%15s%18s%25s%27s%17s%10s%n", "│", ROJO + "BD" + RESET, AMARILLO + "PROG" + RESET,
                ORANGE + "ED" + RESET, PINK + "SOS" + RESET, CYAN + "SI" + RESET, "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%16s%16s%1s%13s%14s%11s%n", "│", ROJO + "BD " + RESET, AMARILLO + "    PROG" + RESET,
                ORANGE + "      ED", "ED" + RESET, CYAN + "      SI" + RESET, "│");
        System.out.println("└──────────────────────────────────────────────────┘");
    }
}