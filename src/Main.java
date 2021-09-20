public class Main {

    public static void main(String[] args) {

        float ticketPrice = 1200.70F;
        float bonusGrade = 20F;
        float bonusBalance = (int)ticketPrice / (int) bonusGrade;

           System.out.println(bonusBalance);
    }
    }