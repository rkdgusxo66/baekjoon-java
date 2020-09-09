import java.io.*;

public class P5543 {
    public static int getMinSetPrice(int[] burgers, int[] drinks) {
        int minBuggers = Integer.MAX_VALUE;
        int minDrinks = Integer.MAX_VALUE;
        for(int price: burgers){
            if(minBuggers > price){
                minBuggers = price;
            }
        }
        for(int price: drinks){
            if(minDrinks > price){
                minDrinks = price;
            }
        }
        return minBuggers + minDrinks - 50;
    }

    public static void main(String... argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int burgerPrices[] = new int[3];
        int drinkPrices[] = new int[2];
        for(int i=0;i<3; i++){
            burgerPrices[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<2; i++){
            drinkPrices[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(getMinSetPrice(burgerPrices, drinkPrices)));
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
