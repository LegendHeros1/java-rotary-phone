public class MondayWork 
{
  public static double q1(int n)
  {
    double answer = 0;
    for(int k=1;k<=n; k++) {
      answer += 1.0/(k*k);
    }
    return answer;
  }

  public static double q2(int n)
  {
    double answer = 0;
    int sign = 1;
    
    for(int k=1; k<=n; k++) {
      double nn = 1.0/(k*k);
      answer += sign * nn;
      sign *= -1;
    }
    return answer;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static double q5 (int n)
  {
    double answer = 1;
    for (int k = 1; k <= n; k++) {
      answer = 1 + 1/answer;
    }
    return answer;
  }
  
  public static void q6(int n) 
  {
    int a = 1;
    int b = 1;
    
    for (int k=2; k<= n; k++) {
      int c = a+b;
      a = b;
      b = c;
    }
    
    System.out.println(b + "/" + a);
  }
  
    // HOMEWORK: 9, 10(a), 14
   
  
  
  
  
  
  
  
  public static double q5b (int n)
  {
    if ( n == 1 ) return 1;
    return 1 + 1/q5b(n-1);
  }
  
  public static String triangle (int n)
  {
    String answer = "";
    for(int k=1; k<=n; k++) {
      for (int reps = 0; reps < k; reps++) {
        answer += "*";
      }
      answer += "\n";
    }
    // System.out.println(answer);
    return answer;
  }
  
  public static void triangleJin (int n)
  {
    String s = "*";
    for (int k=0; k<n; k++) {
      System.out.println(s);
      s += "*";
    }
  }
  
}

