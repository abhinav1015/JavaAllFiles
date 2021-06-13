public class SubstringDemo {
    public static void main(String[] args){
        String name = "rajesh hamal";
        String subname1 = name.substring(0,1);
        String subname2 = name.substring(7, 8);
        
        
        // System.out.println(subname1.toUpperCase() + name.substring(1, 5) + " " + subname2.toUpperCase() + name.substring(8));
        System.out.println(subname1.toUpperCase().concat(name));
    }
}
