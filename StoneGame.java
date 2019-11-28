import java.util.Arrays; 

public class StoneGame
{
  public static void main (String[]args)
  {

    int[] arr = { 5, 3, 4, 5 };
    System.out.println (AlexWins (arr));
  }

  public static boolean AlexWins (int arr[])
  {
    int[][] nArr = new int[2][arr.length / 2];
    int s = 0;
    int f = arr.length - 1;
    int ind = 0;
    int n = 0;
    boolean aTurn = true;


    for (int i = 0; i < nArr.length; i++){
	  Arrays.fill (nArr[i], 0);
	}
    

    while (s != f)
      {

	if (aTurn)
	  {
	    nArr[0][ind] += Math.max (arr[s], arr[f]);
	    n++;
	    aTurn = false;
	  }
	else if (!aTurn)
	  {
	    nArr[1][ind] += Math.max (arr[s], arr[f]);
	    n++;
	    aTurn = true;
	  }

	if (arr[s] > arr[f])
	  s++;

	else if (arr[s] < arr[f])
	  f--;

	if (n == 2)
	  {
	    ind++;
	    n = 0;
	  }
      }
    nArr[1][ind] += arr[s];

    return (nArr[0][nArr.length - 1] > nArr[1][nArr.length - 1]);
  }
}
//
