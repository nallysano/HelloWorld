/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	App app_inst = new App();
    	if(app_inst != null) {
    	    System.out.println( "true");
        } else{
            System.out.println ("false");
        }
        System.out.println(app_inst.getGreeting());
    }
}
