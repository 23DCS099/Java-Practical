import java.util.*;

public class Quizgame {

    private static Map<String, Quiz> quizzes = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a command: (create, take, view, list, exit)");
            String command = scanner.nextLine().trim().toLowerCase();
            if (command.equals("create")) {
                createQuiz(scanner);
            } else if (command.equals("take")) {
                takeQuiz(scanner);
            } else if (command.equals("view")) {
                viewQuiz(scanner);
            } else if (command.equals("list")) {
                listQuizzes();
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }

    private static void createQuiz(Scanner scanner) {
        System.out.println("Enter the name of the quiz:");
        String quizName = scanner.nextLine().trim();
        Quiz quiz = new Quiz(quizName);
        int numQuestions = getValidIntegerInput(scanner, "Enter the number of questions:");
        
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Enter the question:");
            String question = scanner.nextLine().trim();
            int numChoices = getValidIntegerInput(scanner, "Enter the number of choices:");
            List<String> choices = new ArrayList<>();
            
            for (int j = 0; j < numChoices; j++) {
                System.out.println("Enter choice " + (j + 1) + ":");
                String choice = scanner.nextLine().trim();
                choices.add(choice);
            }
            
            int correctChoice = -1;
            while (correctChoice < 0 || correctChoice >= numChoices) {
                correctChoice = getValidIntegerInput(scanner, "Enter the index of the correct choice (1 to " + numChoices + "):") - 1;
                if (correctChoice < 0 || correctChoice >= numChoices) {
                    System.out.println("Invalid choice index, please try again.");
                }
            }
            quiz.addQuestion(new Question(question, choices, correctChoice));
        }
        quizzes.put(quizName, quiz);
        System.out.println("Quiz created.");
    }

    private static void takeQuiz(Scanner scanner) {
        System.out.println("Enter the name of the quiz:");
        String quizName = scanner.nextLine().trim();
        Quiz quiz = quizzes.get(quizName);
        if (quiz == null) {
            System.out.println("Quiz not found.");
            return;
        }
        int score = 0;
        for (int i = 0; i < quiz.getNumQuestions(); i++) {
            Question question = quiz.getQuestion(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestion());
            List<String> choices = question.getChoices();
            for (int j = 0; j < choices.size(); j++) {
                System.out.println((j + 1) + ": " + choices.get(j));
            }

            int userAnswer = -1;
            while (userAnswer < 0 || userAnswer >= choices.size()) {
                userAnswer = getValidIntegerInput(scanner, "Enter your answer:") - 1;
                if (userAnswer < 0 || userAnswer >= choices.size()) {
                    System.out.println("Invalid choice, please try again.");
                }
            }

            if (userAnswer == question.getCorrectChoice()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + (question.getCorrectChoice() + 1) + ".");
            }
        }
        System.out.println("Your score is " + score + " out of " + quiz.getNumQuestions() + ".");
    }

    private static void viewQuiz(Scanner scanner) {
        System.out.println("Enter the name of the quiz:");
        String quizName = scanner.nextLine().trim();
        Quiz quiz = quizzes.get(quizName);
        if (quiz == null) {
            System.out.println("Quiz not found.");
            return;
        }
        System.out.println("Quiz: " + quiz.getName());
        for (int i = 0; i < quiz.getNumQuestions(); i++) {
            Question question = quiz.getQuestion(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestion());
            List<String> choices = question.getChoices();
            for (int j = 0; j < choices.size(); j++) {
                System.out.println((j + 1) + ": " + choices.get(j));
            }
            System.out.println("Answer: " + (question.getCorrectChoice() + 1));
        }
    }

    private static void listQuizzes() {
        System.out.println("Quizzes:");
        for (String quizName : quizzes.keySet()) {
            System.out.println("- " + quizName);
        }
    }

    private static int getValidIntegerInput(Scanner scanner, String prompt) {
        int value = -1;
        while (value < 0) {
            System.out.println(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine().trim());
                if (value < 0) {
                    System.out.println("Input must be a positive integer. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }
        return value;
    }
}

class Quiz {
    private String name;
    private List<Question> questions = new ArrayList<>();

    public Quiz(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public int getNumQuestions() {
        return questions.size();
    }
}

class Question {
    private String question;
    private List<String> choices;
    private final int correctChoice;

    public Question(String question, List<String> choices, int correctChoice) {
        this.question = question;
        this.choices = choices;
        this.correctChoice = correctChoice;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectChoice() {
        return correctChoice;
    }
}
