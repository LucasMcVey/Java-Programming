package quiz;

public class ParagraphQuestion implements Question {
    private String questionText = "";
    private String magicWord1 = "";
    private String magicWord2 = "";
    private String magicWord3 = "";

    public ParagraphQuestion(String questionText,
                             String magicWord1, String magicWord2, String magicWord3) {
        this.questionText = questionText;
        this.magicWord1 = magicWord1;
        this.magicWord2 = magicWord2;
        this.magicWord3 = magicWord3;
    }

    public void ask() {
        System.out.println(questionText);
    }

    public double scoreAnswer(String answer){
        int total = 0;
        if (answer.indexOf(magicWord1) > 0) {
            total++;
        }
        if (answer.indexOf(magicWord2) > 0) {
            total++;
        }
        if (answer.indexOf(magicWord3) > 0) {
            total++;
        }
        return total;
    }

    public double maxScore() {
        return 3;
    }
}
