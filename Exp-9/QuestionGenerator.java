import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionGenerator {
    public static void main(String[] args) {
        List<String> questions = generateQuestions();
        List<String> selectedQuestions = selectRandomQuestions(questions, 10);

        for (int i = 0; i < selectedQuestions.size(); i++) {
            System.out.println("Question " + (i + 1) + ": " + selectedQuestions.get(i));
            System.out.println();
        }
    }

    public static List<String> generateQuestions() {
        List<String> questions = new ArrayList<>();
        
        questions.add("What is the capital of France?");
        questions.add("Who is the author of 'To Kill a Mockingbird'?");
        questions.add("What is the largest planet in our solar system?");
        questions.add("Who painted the Mona Lisa?");
        questions.add("What is the currency of Japan?");
        questions.add("What year did World War II end?");
        questions.add("Who invented the telephone?");
        questions.add("What is the chemical symbol for gold?");
        questions.add("Who wrote the play 'Romeo and Juliet'?");
        questions.add("What is the tallest mountain in the world?");
        questions.add("What is the largest ocean on Earth?");
        questions.add("What is the square root of 144?");
        questions.add("Who is the Greek god of thunder?");
        questions.add("Who is the current President of the United States?");
        questions.add("What is the national animal of Australia?");
        questions.add("What is the largest species of shark?");
        questions.add("Who discovered gravity?");
        questions.add("What is the capital of Russia?");
        questions.add("Who painted the Sistine Chapel ceiling?");
        questions.add("What is the chemical symbol for hydrogen?");
        questions.add("Who wrote the novel 'Pride and Prejudice'?");
        questions.add("What is the diameter of Earth?");
        questions.add("What is the hottest continent on Earth?");
        questions.add("What is the largest desert in the world?");
        questions.add("What is the square root of 49?");
        questions.add("Who is the Egyptian god of the sun?");
        questions.add("Who is the current Prime Minister of the United Kingdom?");
        questions.add("What is the national flower of India?");
        questions.add("What is the tallest tree species in the world?");
        questions.add("Who proposed the theory of relativity?");
        questions.add("What is the capital of Brazil?");
        questions.add("Who painted 'The Starry Night'?");
        questions.add("What is the chemical symbol for oxygen?");
        questions.add("Who wrote the play 'Hamlet'?");
        questions.add("What is the circumference of a circle with radius 5?");
        questions.add("Who is the Greek goddess of wisdom?");
        questions.add("Who is the current Chancellor of Germany?");
        questions.add("What is the national animal of Canada?");
        questions.add("What is the largest bird in the world?");
        questions.add("Who discovered penicillin?");
        questions.add("What is the capital of China?");
        questions.add("Who painted 'The Last Supper'?");
        questions.add("What is the chemical symbol for carbon?");
        questions.add("Who wrote the novel '1984'?");
        questions.add("What is the depth of the Mariana Trench?");
        questions.add("What is the coldest continent on Earth?");
        questions.add("What is the largest river in the world?");
        questions.add("What is the square root of 64?");
        questions.add("Who is the Norse god of mischief?");
        questions.add("Who is the current Prime Minister of Canada?");

        return questions;
    }

    public static List<String> selectRandomQuestions(List<String> questions, int numberOfQuestions) {
        List<String> selectedQuestions = new ArrayList<>();
        Random random = new Random();

        // Shuffle the questions
        List<String> shuffledQuestions = new ArrayList<>(questions);
        for (int i = shuffledQuestions.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = shuffledQuestions.get(i);
            shuffledQuestions.set(i, shuffledQuestions.get(j));
            shuffledQuestions.set(j, temp);
        }

        // Select the first 'numberOfQuestions' questions
        for (int i = 0; i < numberOfQuestions; i++) {
            selectedQuestions.add(shuffledQuestions.get(i));
        }

        return selectedQuestions;
    }
}