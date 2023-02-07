public class MethodDemo {
    // method is used to provide code reusability
    public void greeting(){
        System.out.println("Good Evening");
    }
    // creating method with the same name and different parameter, known as methodf overloading
    public void greeting(String candidateName){
        System.out.println("Good Evening"+candidateName);
    }
    public void greeting(Integer numberOfCandidate){
        System.out.println("Good Evening All "+numberOfCandidate+" Person");
    }
    public static void main(String[] args) {
        MethodDemo demo=new MethodDemo();
        demo.greeting();
        demo.greeting(10);
        demo.greeting(" Dr Tarkeshwar Barua");

    }
}
