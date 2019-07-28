package String;

public class RemoveJunk {

	public static void main(String[] args) {
	
	String str ="@#@@%@%@% test3235@#%#%#%   welcome414#$#$@#%@#%@ home21124$!$%!%!%!%";
	
	// using Regular expression [^a-z,A-Z,0-9]
	
	System.out.println(str.replaceAll("[^a-z,A-Z,0-9]", ""));

	String str1 ="!@!$!@$!@$WORK@#$@#@#%%@#%HARD ##$#@ PARTY@##@%HARD#%@%@%211441@!$!%@#%#^@#!^";
	
	System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
