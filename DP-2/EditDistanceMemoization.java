public class EditDistance {
  public static int editDistanceM(String s, String t){
		int m = s.length();
		int n = t.length();
		int storage[][] = new int[ m + 1][n + 1];
		for(int i = 0; i <= m; i++){
			for(int j = 0; j <= n; j++){
				storage[i][j] = -1;
			}
		}
		return editDistanceM(s,t,storage);
	}
	

	private static int editDistanceM(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		if(storage[m][n] != -1){
			return storage[m][n];
		}
		
		if(m == 0){
			storage[m][n] = n;
			return storage[m][n];
		}
		if(n == 0){
			storage[m][n] = m;
			return storage[m][n];
		}
		if(s.charAt(0) == t.charAt(0)){
			storage[m][n] = editDistanceM(s.substring(1), t.substring(1), storage);
		}else{
			// insert
			int op1 = editDistanceM(s, t.substring(1), storage);
			// delete 
			int op2 = editDistanceM(s.substring(1), t, storage);
			//substitute
			int op3 = editDistanceM(s.substring(1), t.substring(1), storage);
			storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];
	 }
  }
