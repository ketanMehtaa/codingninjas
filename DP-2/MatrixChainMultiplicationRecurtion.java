public class Solution {
    public static int help(int[] p,int s,int e){
    	if(s>=e||s+1==e){
           return 0;
        }
        // take the first matrix and all other
        int opt1=help(p,s,s+1)+help(p,s+1,e)+(p[s]*p[s+1]*p[e]);
        // take the full matrix-last matrix and take the last matrix
        int opt2=help(p,s,e-1)+help(p,e-1,e)+(p[s]*p[e-1]*p[e]);
        return Math.min(opt1,opt2);
	}

	public static int mcm(int[] p){
		return help(p,0,p.length-1);
	}
}
