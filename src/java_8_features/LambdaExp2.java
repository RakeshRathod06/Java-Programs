package java_8_features;
@FunctionalInterface
interface Sayable{
	String say(String str);
}
public class LambdaExp2 {

	public static void main(String[] args) {
		Sayable s1 =(name)->"Hello "+name;
		System.out.println(s1.say("Priyanka Mam"));
		
		Sayable s2 =(msg)->{
			return "Message: "+msg;
		};
		System.out.println(s2.say("Learning Java 8 Features"));
	}

}
