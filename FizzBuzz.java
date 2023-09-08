public class FizzBuzz{
    public static void main(String[] args){

        if(args.length==0){
            System.out.println("数字を入力してください。プログラムを終了します");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);

        for(int i=1; i<num+1; i++){
            if(i%3==0 && i%5!=0){       //3で割り切れる時はFizzを出力
                System.out.print("Fizz");
            }
            else if(i%3!=0 && i%5==0){  //5で割り切れる時はBuzzを出力
                System.out.print("Buzz");
            }
            else if(i%3==0 && i%5==0){  //3と5で割り切れる時はFizzBuzzを出力
                System.out.print("FizzBuzz");
            }
            else{                       //3と5どちらも割り切れない場合は数字を出力
                System.out.print(i);  
            }

            if(i<num){                  //各判定結果の出力後に半角スペースを出力
                System.out.print(" ");
            }
        }
    }
}
