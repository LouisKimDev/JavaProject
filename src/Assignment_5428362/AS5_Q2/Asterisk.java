package Assignment_5428362.AS5_Q2;

public class Asterisk {
    private int x;
    public void Asterisk(){
        x = 0;
    }
    public void Display(int length){
        int y;

        for(x=length;x>=1;x--){
            if(x==length || x==1){

                for(y=length;y>=1;y--){
                    System.out.print("*");}

                System.out.print(" ");

                for(y=length;y>=1;y--){
                    System.out.print("*");}

            }
            else{

                for(y=length;y>=1;y--){
                    System.out.print("*");}

                System.out.print(" ");

                for(int i=length;i>=1;i--){
                    if(i==length||i==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");

        }
    }
}
