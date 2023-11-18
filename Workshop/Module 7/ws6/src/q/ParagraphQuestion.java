package q;

public class ParagraphQuestion implements Question {
    private String question;
    private String magic1;
    private String magic2;
    private String magic3;


    public ParagraphQuestion(String question,  String magic1,  String magic2,  String magic3) {
        this.question = question;
        this.magic1 = magic1;
        this.magic1 = magic1;
        this.magic2 = magic2;
        this.magic3 = magic3;
    }
    public void ask() {
        System.out.println(question);
    }

    public double scoreAnswer(String answer) {
        double score = 0;
        if (answer.indexOf(magic1) > 0) {
            score += 1;
        }
        if (answer.indexOf(magic2) > 0) {
            score += 1;
        }
        if (answer.indexOf(magic3) > 0) {
            score += 1;
        }
        return score;
    }

}
