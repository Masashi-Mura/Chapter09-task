public class ArgsLastPrinter {
    public static void main(String[] args) {
    
        if(args.length==0){
            System.out.println("‚È‚µ");
        }
        else{
            for (int i = 0; i < args.length; i++) {
              System.out.println(args[i]);
            }
        }
    }
}