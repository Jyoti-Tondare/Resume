import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.println("Enter your educational qualifications: ");
        String education = scanner.nextLine();

        System.out.println("Enter your work experience: ");
        String workExperience = scanner.nextLine();

        String resume = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone + "\nEducation: " + education
                + "\nWork Experience: " + workExperience;

        System.out.println("\n\n" + resume);
    }
}
