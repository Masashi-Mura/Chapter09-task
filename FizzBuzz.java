public class FizzBuzz{
    public static void main(String[] args){

        if(args.length==0){
            System.out.println("��������͂��Ă��������B�v���O�������I�����܂�");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);

        for(int i=1; i<num+1; i++){
            if(i%3==0 && i%5!=0){       //3�Ŋ���؂�鎞��Fizz���o��
                System.out.print("Fizz");
            }
            else if(i%3!=0 && i%5==0){  //5�Ŋ���؂�鎞��Buzz���o��
                System.out.print("Buzz");
            }
            else if(i%3==0 && i%5==0){  //3��5�Ŋ���؂�鎞��FizzBuzz���o��
                System.out.print("FizzBuzz");
            }
            else{                       //3��5�ǂ��������؂�Ȃ��ꍇ�͐������o��
                System.out.print(i);  
            }

            if(i<num){                  //�e���茋�ʂ̏o�͌�ɔ��p�X�y�[�X���o��
                System.out.print(" ");
            }
        }
    }
}
