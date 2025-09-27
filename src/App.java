public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.printf("%-1s%51s%n", "│", "│");
        System.out.printf("%-1s%7s%10s%10s%10s%10s%4s%n", "│", "Lunes", "Martes", "Miérc.", "Jueves.", "Viernes", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "PROG", "IPEI", "PROG", "LM", "LM", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "PROG", "IPEI", "PROG", "LM", "BD", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "SI", "IPEI", "PROG", "BD", "BD", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "SI", "PROG", "DIG", "BD", "SI", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "BD", "PROG", "ED", "SOS", "SI", "│");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("%-1s%6s%9s%9s%9s%9s%9s%n", "│", "BD", "PROG", "ED", "ED", "SI", "│");
        System.out.println("└──────────────────────────────────────────────────┘");
    }
}