import java.util.Scanner;

/**
 * Created by kamat on 9/27/2016.
 */
public class JumpingOnClouds {

  	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        System.out.println(new JumpingOnClouds().getMinimumJumps(c));
    }

    private int getMinimumJumps(int[] clouds) {
    	int jumps = 0;
    	int i = 0;
    	while (i < clouds.length-1) {
    		if ((i + 2 < clouds.length) && (clouds[i + 2] == 0)) {
    			i += 2;
    		}
    		else {
    			i += 1;
    		}
    		jumps += 1;
    	}
    	return jumps;
    }
}
