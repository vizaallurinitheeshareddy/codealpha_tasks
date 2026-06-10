import java.util.Scanner;
public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");
        while (true) {
            System.out.print("\nYou: ");
            String message = sc.nextLine().toLowerCase();
            if (message.equals("hello") || message.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (message.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }
            else if (message.contains("college")) {
                System.out.println("Bot: I can help with student related queries.");
            }
            else if (message.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }
            else if (message.contains("python")) {
                System.out.println("Bot: Python is easy to learn and widely used in AI and Data Science.");
            }
            else if (message.contains("internship")) {
                System.out.println("Bot: Internships help you gain practical experience.");
            }
            else if (message.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that.");}}
        sc.close();}}