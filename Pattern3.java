public class Pattern {
    public static void main(String[] args) {
       
        int l=50;
        for(int i=1;i<=50;i++){

            for(int m=0;m<=l-i;m++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                   System.out.print("*");         
        }
        for(int n=i-1;n>=1;n--){
            System.out.print("*");
        }
        System.out.println("");
       
    }
}
}
