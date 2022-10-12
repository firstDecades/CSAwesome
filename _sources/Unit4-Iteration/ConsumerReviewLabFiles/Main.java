
public class Main {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("perfect"));
        System.out.println(Review.sentimentVal("never"));
        System.out.println(Review.sentimentVal("right"));
        double num = Review.sentimentVal("warm");
        //String word = Review.sentimentVal(0.5);
        //double x = Review.sentimentVal("good", "bad");
        System.out.println("Total Sentiment (26WestReview.txt): " + Review.totalSentiment("26WestReview.txt"));
        System.out.println("Star Rating (26WestReview.txt): " + Review.starRating("26WestReview.txt"));
        System.out.println("Total Sentiment (simpleReview.txt): " + Review.totalSentiment("simpleReview.txt"));
        System.out.println("Star Rating (simpleReview.txt): " + Review.starRating("simpleReview.txt"));
    }
}
