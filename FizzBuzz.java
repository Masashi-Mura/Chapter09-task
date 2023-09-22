public class FizzBuzz{
    public static void main(String[] args){

        if (args.length == 0) {
            System.out.println("��������͂��Ă��������B�v���O�������I�����܂�");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);

        for (int i = 1; i < num + 1; i++) {
            String str = "";
            if(i%3 == 0) {         //3�Ŋ���؂��
                str = "Fizz";
            }
            if(i%5 == 0) {         //5�Ŋ���؂��
                str = str + "Buzz";
            }
            if(str.isEmpty()) {     //3��5�Ŋ���؂�Ȃ�
                str = Integer.toString(i);
            }
            System.out.print(str + " ");    //���ʏo��
        }
    }
}
