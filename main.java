public class main {
    public static void main(String[] args) {
        test t = new test();
        if(t.checkInput("2^(2*x))")){
            if(t.getBo() == t.getBc()){
                System.out.println("valid input");
            } else System.out.println("missing brackets!");
        } else System.out.println("invalid input");
    }
}
