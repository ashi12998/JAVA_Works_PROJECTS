class XtoThePowern{
    public static double power(double x, int n){
        if(n==0) return 1.0;
        double xpnm1 = power(x,n-1);
        return x*  xpnm1; 

    }
    public static double pow(double x ,int n){
        if(n<0){
            return 1.0/ power(x,-n);
        }
        return power (x,n);

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        int n = scn.nextInt();

        System.out.println(pow(x,n));
    }
    }
