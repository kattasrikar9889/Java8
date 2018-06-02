package optional;

import java.util.Optional;

public class Optionatest {

	public static void main(String[] args) {
//		String[] str=new String[10];
//		String lowercasestring = str[5].toLowerCase();
//		System.out.println(lowercasestring);
//		
		
		
		String []str2=new String[10];
		Optional<String> checknull=Optional.ofNullable(str2[5]);
		if(checknull.isPresent()) {
			String lowercasestring2=str2[5].toLowerCase();
			System.out.println(lowercasestring2);
		}else {
			System.out.println("String value not present");
			
		}
		
		String []str3=new String[10];
		str3[5]="MY NAME IS SRIKAR";
		Optional<String> checknull2=Optional.ofNullable(str3[5]);
		if(checknull2.isPresent()) {
			String lowercasestring3 = str3[5].toLowerCase();
			System.out.println(lowercasestring3);
		}else {
			System.out.println("String value not present");
			
		}
		
		
		
		
		String[] str5=new String[10];
		str5[5]="MY NAME IS SRIKAR";
		Optional<String> empty =Optional.empty();
		System.out.println(empty);
		Optional<String> value=Optional.of(str5[5]);
		System.out.println("Filtered valu"+ value.filter{(s)->s.equals("Abc"))};
		System.out.println("Filtered valu"+ value.filter{(s)->s.equals("MY NAME IS SRIKAR"))};
		System.out.println("Getting value:"+ value.get());
		
		System.out.println("Getting hash code:"+ value.hashCode());
		System.out.println("Is value present"+ value.isPresent());
		System.out.println("Nullable optional"+ Optional.ofNullable(str5[5]));
		System.out.println("orElse:"+ value.orElse("Valueis not present"));
		System.out.println("orElse:"+ empty.orElse("Valueis not present"));
	}
}
