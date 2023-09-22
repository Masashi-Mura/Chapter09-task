public class FizzBuzz{
    public static void main(String[] args){

        if (args.length == 0) {
            System.out.println("数字を入力してください。プログラムを終了します");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);

        for (int i = 1; i < num + 1; i++) {
            String str = "";
            if(i%3 == 0) {         //3で割り切れる
                str = "Fizz";
            }
            if(i%5 == 0) {         //5で割り切れる
                str = str + "Buzz";
            }
            if(str.isEmpty()) {     //3と5で割り切れない
                str = Integer.toString(i);
            }
            System.out.print(str + " ");    //結果出力
        }
    }
}
