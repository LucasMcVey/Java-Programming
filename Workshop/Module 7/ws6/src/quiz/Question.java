package quiz;

public interface Question {
    public void ask();

    public double scoreAnswer(String answer);

    public double maxScore();
}
