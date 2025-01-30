
import java.util.Random;

public class RandomQuoteGenerator {
    private static final String[] QUOTES = {
        "Believe you can and you're halfway there. - Theodore Roosevelt",
        "The only way to do great work is to love what you do. - Steve Jobs",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
        "I have not failed. I've just found 10,000 ways that won't work. - Thomas Edison",
        "You are never too old to set another goal or to dream a new dream. - C.S. Lewis",
        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
        "Do something today that your future self will thank you for. - Unknown",
    };

    public static void main(String[] args) {
        Random random = new Random();
        String quote = getQuote(random);
        System.out.println(quote);
    }

    public static String getQuote(Random random) {
        return QUOTES[random.nextInt(QUOTES.length)];
    }
}



