import java.util.Scanner;

public class Therapy {
    public static void main(String[] args) {

        int terapist = -1;
        for (int i = 0; i < 10; i++) {

            String a = "Säger du det?";
            String b = "Aa jag förstår";
            String c = "Det var ju konstigt";
            String d = "Varför är det så";
            String e = "You're the TOP G!";
            String f = "No Way!";
            String g = "Du är bäst!";
            String h = "OK";
            String o = "L + ratio + wrong + get a job + unfunny + you fell off + never liked you anyway + cope + ur allergic to gluten + don't care + cringe ur a kid + literally shut the fuck up + galileo did it better + your avi was made in MS Excel + ur bf is kinda ugly + i have more subscribers + owned + ur a toddler + reverse double take back + u sleep in a different bedroom from your wife + get rekt + i said it better + u smell + copy + who asked + dead game + seethe + ur a coward + stay mad + you main yuumi + aired + you drive a fiat 500 + the hood watches xqc now + yo mama + ok + currently listening to rizzle kicks without u. plus ur mind numbingly stupid plus ur voice is ronald mcdonald.";
            String j = "Shut your skin tone chicken bone google chrome no home flip phone disowned ice cream cone garden gnome extra chromosome metronome dimmadome genome full blown monochrome student loan Indiana Jones overgrown flintstone x and y hormone friendzone Sylvester Stallone Sierra Leone autozone professionally seen silver patrone ching Chong lin long suck my ding dong headass remote control autism down syndrome stage four terminal brain cancer O'Riley autoparts silver bronze ash amino UV light pen sushi ram ramen Harisson Ford gamer bitch ass Virgin lamp thermometer lean mean string bean Charlie Sheen limousine canteen trampoline serpentine anti histamine wolverine submarine unclean nectarine broken gene Halloween detective spleen smoke screen James Dean putting green tiny peen anti vaccine aquamarine eugene extra green nicotine vaseline jelly bean magazine protein Lightning McQueen vending machine what'chu mean ocean man by ween head ass tf up bitch";
            String k = "Your mum!";
            String l = "pffft";
            String ac = "Din jävel!";
            String ad = "Va synd om dig";
            String ae = "När slutar det här mötet :)";
            String af = "Det här är varför du inte har kompisar";
            String ag = "Har du tänkt på hur andra som är runt dig känner sig när du pratar";
            String ah = ":)";
            String bb = ";)";
            String cb = ":D";
            String db = "?";
            String eb = "Vad snackar du om?";
            String fb = "Vad tänker du med?";
            if (terapist == -1){
                System.out.println("Vad vill du prata om?");
            }
            else if(terapist == 0){
                System.out.println(a);
            }
            else if(terapist == 1){
                System.out.println(b);
            }
            else if(terapist == 2){
                System.out.println(c);
            }
            else if(terapist == 3){
                System.out.println(d);
            }
            else if(terapist == 4){
                System.out.println(e);
            }
            else if(terapist == 5){
                System.out.println(f);
            }
            else if(terapist == 6){
                System.out.println(g);
            }
            else if(terapist == 7){
                System.out.println(h);
            }
            else if(terapist == 8){
                System.out.println(o);
            }
            else if(terapist == 9){
                System.out.println(j);
            }
            else if(terapist == 10){
                System.out.println(k);
            }
            else if(terapist == 11){
                System.out.println(l);
            }
            else if(terapist == 12){
                System.out.println(ac);
            }
            else if(terapist == 13){
                System.out.println(ad);
            }
            else if(terapist == 14){
                System.out.println(ae);
            }
            else if(terapist == 15){
                System.out.println(af);
            }
            else if(terapist == 16){
                System.out.println(ag);
            }
            else if(terapist == 17){
                System.out.println(ah);
            }
            else if(terapist == 18){
                System.out.println(bb);
            }
            else if(terapist == 19){
                System.out.println(cb);
            }


            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            terapist = (int) (Math.random() * 10);
        }
        System.out.println("Therapist has had enough of your bullshit");
    }
}
