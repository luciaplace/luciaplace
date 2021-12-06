package day1115.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		System.out.println("member1.getId():"+member1.getId());
		
		
		BiFunction<String, String, Member> function2 = Member :: new;
		
		//Member apply(String, String){ return new Member(String, String);
		Member member2 = function2.apply("신천사", "angel");
		System.out.println("member2.getId():"+member2.getId()+"member2.getName():"+member2.getName());
	}
}