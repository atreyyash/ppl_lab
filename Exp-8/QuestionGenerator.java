import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {
    public static void main(String[] args) {
        List<String> questions = generateQuestions();
        List<String> answers = generateAnswers();
        cout<<'Yash Atrey\n'<<'CSE-A ( 109 )\n'<<'35520807220\n'<<endl;
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ": " + questions.get(i));
            System.out.println("Answer: " + answers.get(i));
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

    public static List<String> generateAnswers() {
        List<String> answers = new ArrayList<>();

        answers.add("Paris");
        answers.add("Harper Lee");
        answers.add("Jupiter");
        answers.add("Leonardo da Vinci");
        answers.add("Yen");
        answers.add("1945");
        answers.add("Alexander Graham Bell");
        answers.add("Au");
        answers.add("William Shakespeare");
        answers.add("Mount Everest");
        answers.add("Pacific Ocean");
        answers.add("12");
        answers.add("Zeus");
        answers.add("Joe Biden");
        answers.add("Kangaroo");
        answers.add("Whale shark");
        answers.add("Isaac Newton");
        answers.add("Moscow");
        answers.add("Michelangelo");
        answers.add("H");
        answers.add("Jane Austen");
        answers.add("12,742 kilometers");
        answers.add("Africa");
        answers.add("Antarctica");
        answers.add("7");
        answers.add("Ra");
        answers.add("Boris Johnson");
        answers.add("Lotus");
        answers.add("Coast Redwood");
        answers.add("Albert Einstein");
        answers.add("Brasília");
        answers.add("Vincent van Gogh");
        answers.add("O");
        answers.add("William Shakespeare");
        answers.add("31.42 units");
        answers.add("Athena");
        answers.add("Angela Merkel");
        answers.add("Beaver");
        answers.add("Ostrich");
        answers.add("Alexander Fleming");
        answers.add("Beijing");
        answers.add("Leonardo da Vinci");
        answers.add("C");
        answers.add("George Orwell");
        answers.add("10,994 meters");
        answers.add("Antarctica");
        answers.add("Amazon River");
        answers.add("8");
        answers.add("Loki");
        answers.add("Justin Trudeau");

        return answers;
    }
}