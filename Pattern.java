public class Pattern {
    public void printn(int i)
    {
        if (i == 0){
            return;
        }
        System.out.print ("* ");
        printn(i - 1);
    }

    public void pattern(int n, int i){

        if (n <= 0){
            return;
        }
        printn(i);
        System.out.println();
        pattern(n - 1, i + 1);
    } 
    public static void main (String[] args) {
        Pattern p=new Pattern();
	    p.pattern(5, 1);
    }
}

