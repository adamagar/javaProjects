import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        int day, month;
        String zodiac = "";
        boolean isError = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your birth day?");
        day= scan.nextInt();
        System.out.println("What is your birth month");
        month= scan.nextInt();
        switch (month){
            case 1:
                if (day>=1 && day<=31){
                    if(day<20){
                        zodiac = "Capricorn";
                    }else {
                        isError = true;
                    } break;

                }
            case 2:
                if (day>=1 && day<=29){
                    if(day<19){
                        zodiac = "Aquarius";
                    }else {
                        isError = true;
                    } break;

                }
            case 3:
                if (day>=1 && day<=31){
                    if(day<21){
                        zodiac = "Pisces";
                    }else {
                        isError = true;
                    } break;

                }
            case 4:
                if (day>=1 && day<=30){
                    if(day<20){
                        zodiac = "Aries";
                    }else {
                        isError = true;
                    } break;

                }
            case 5:
                if (day>=1 && day<=31){
                    if(day<21){
                        zodiac = "Taurus";
                    }else {
                        isError = true;
                    } break;

                }
            case 6:
                if (day>=1 && day<=30){
                    if(day<21){
                        zodiac = "Gemini";
                    }else {
                        isError = true;
                    } break;

                }
            case 7:
                if (day>=1 && day<=31){
                    if(day<23){
                        zodiac = "Cancer";
                    }else {
                        isError = true;
                    } break;

                }
            case 8:
                if (day>=1 && day<=31){
                    if(day<23){
                        zodiac = "Leo";
                    }else {
                        isError = true;
                    } break;

                }
            case 9:
                if (day>=1 && day<=30){
                    if(day<23){
                        zodiac = "Virgo";
                    }else {
                        isError = true;
                    } break;

                }
            case 10:
                if (day>=1 && day<=31){
                    if(day<23){
                        zodiac = "Libra";
                    }else {
                        isError = true;
                    } break;

                }
            case 11:
                if (day>=1 && day<=30){
                    if(day<22){
                        zodiac = "Scorpio";
                    }else {
                        isError = true;
                    } break;

                }
            case 12:
                if (day>=1 && day<=31){
                    if(day<22){
                        zodiac = "Sagittarus";
                    }else {
                        isError = true;
                    } break;

                } default:
                    isError = true;

        }
            if (isError){
                System.out.println("Please type valid input");
            }else{
                System.out.println("Your zodiac is " + zodiac);
            }
    }
}
