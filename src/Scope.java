public class Scope {
    public static void main(String[] args) {

        //System.out.println(hello);
        sayHello("Eko");
        sayHello("");

    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
            //System.out.println(hello);
        }

        System.out.println(hello);
        //System.out.println(hi);
    }
}
