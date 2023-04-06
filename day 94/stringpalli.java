package NetApp;

public class stringpalli {
    public static boolean find(String n,int j) {
        for(int i=0;i<n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(j-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String n = "racecar";
        int j = n.length();
        System.out.println(find(n,j));
        
    }
}
