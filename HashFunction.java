package Projeto;

public class HashFunction { // (ax+b) % p -> a e b aleatorios, x inteiro (hashcode da string), p numero primo "grande"
	
	public static int[] func(String s, int[] a, int[] b, int length) {
		int[] hash = new int[a.length];
		for(int i = 0; i < hash.length; i++) {
			int p = 104729; 											// primo grande
			hash[i] = Math.abs((((a[i] * (s.hashCode()) + b[i]) % p) % length));
			//hash[i] = ((a[i] * (s.hashCode()) + b[i]) % p);
			System.out.println(hash[i]);
		}			
		return hash;
	}
	
	public static int func(String s) {
		int hash = 0;
		int p = 104729;	// primo grande
		int a = (int) (Math.random() * 40) + 1;
		int b = (int) (Math.random() * 40) + 1;
		hash = Math.abs((((a * (s.hashCode()) + b) % p)));
		
		return hash;
	}
}