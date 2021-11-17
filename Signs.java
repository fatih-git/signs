import java.util.Scanner;

/**
 * @author fatih-git
 */

public class Signs {

    public static void main(String[] args) {

        int month, day;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen doğum ayınızı sayı olarak giriniz Örneğin; Ocak için 1: ");
        month=input.nextInt();

        System.out.print("Lütfen doğum gününüzü girin: ");
        day=input.nextInt();

        if(month>12 || month<1 || day>31 || day<1){
            System.out.println("Hatalı giriş!");
        }
        else{

            if((month==3 && day>=21) || (month==4 && day<=20)){
                System.out.println("Koç burcusunuz.");
            }
            else if((month==4 && day>=21) || (month==5 && day<=21)){

                if(month==4 && day==31){
                    System.out.println("Hatalı giriş!");
                }
                else{
                    System.out.println("Boğa burcusunuz.");
                }

            }
            else if((month==5 && day>=22) || (month==6 && day<=22)){
                System.out.println("İkizler burcusunuz.");
            }
            else if((month==6 && day>=23) || (month==7 && day<=22)){

                if(month==6 && day==31){
                    System.out.println("Hatalı giriş!");
                }
                else{
                    System.out.println("Yengeç burcusunuz.");
                }

            }
            else if((month==7 && day>=23) || (month==8 && day<=22)){
                System.out.println("Aslan burcusunuz.");
            }
            else if((month==8 && day>=23) || (month==9 && day<=22)){
                System.out.println("Başak burcusunuz.");
            }
            else if((month==9 && day>=23) || (month==10 && day<=22)){

                if(month==9 && day==31){
                    System.out.println("Hatalı giriş!");
                }
                else{
                    System.out.println("Terazi burcusunuz.");
                }

            }
            else if((month==10 && day>=23) || (month==11 && day<=21)){
                    System.out.println("Akrep burcusunuz.");
            }
            else if((month==11 && day>=22) || (month==12 && day<=21)){

                if(month==11 && day==31){
                    System.out.println("Hatalı giriş!");
                }
                else{
                    System.out.println("Yay burcusunuz.");
                }

            }
            else if((month==12 && day>=22) || (month==1 && day<=21)){
                System.out.println("Oğlak burcusunuz.");
            }
            else if((month==1 && day>=22) || (month==2 && day<=19)){
                System.out.println("Kova burcusunuz.");
            }
            else if((month==2 && day>=20) || (month==3 && day<=20)){

                if(month==2 && day>29){
                    System.out.println("Hatalı giriş!");
                }
                else{
                    System.out.println("Balık burcusunuz.");
                }

            }

        }

    }

}
