class Students{
    int roll;
    String name;


    public static void main(String[] args) {
      Students s1 = new Students();
      Students s2 = new Students();
      s1.roll = 12;
      s1.name = "hello";
      s2.roll = 13;
      s2.name = "beta";  

      System.out.println(s1.roll+" "+s1.name);
    } 
}
