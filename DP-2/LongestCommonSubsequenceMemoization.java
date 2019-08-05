public class LCS {
    
    public static int lcsM(String s, String t){
		int storage[][] = new int[s.length() + 1][t.length() + 1];
		for(int i = 0; i < s.length() + 1; i++){
			for(int j = 0; j < t.length() + 1; j++){
				storage[i][j] = -1;
			}
		}
		return lcsM(s, t, storage);
	}
    
    private static int lcsM(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		
		if(storage[m][n] != -1){
			return storage[m][n];
		}
		if(m == 0 || n == 0){
			storage[m][n] = 0;
			return storage[m][n];
		}
		if(s.charAt(0) == t.charAt(0)){
			storage[m][n] = 1 + lcsM(s.substring(1), t.substring(1), storage);
		}else{
			int op1 = lcsM(s, t.substring(1), storage);
			int op2 = lcsM(s.substring(1), t, storage);
			storage[m][n] = Math.max(op1, op2);
		}
		return storage[m][n];
	}
}
	
