package quiz;

public class NumericQuestion implements  Question {
    private String question;
    private double answer;

    public NumericQuestion(String question, double answer) {
        this.question = question;
        this.answer = answer;
    }

    public void ask() {
        System.out.println(question);
    }

    public double scoreAnswer(String answerString) {
        Double d = Double.parseDouble(answerString);
        if (d == answer) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public double maxScore() {
        return 1;
    }
}
