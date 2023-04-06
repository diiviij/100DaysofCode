package NetApp;

public class reversewith {
    public static void main(String[] args) {
        String name = "hello.world.divij";
        String reverse ="";
        String temp = "";
        for(int i = name.length()-1;i>=0;i--){
            if(name.charAt(i)=='.'){
                temp = temp + name.charAt(i); //world.
                reverse = reverse + temp; //divij.world.
                temp = ""; //
            }
            else
                temp = name.charAt(i) + temp; //world

        }
        reverse = reverse + temp;

        System.out.println(reverse);
}
