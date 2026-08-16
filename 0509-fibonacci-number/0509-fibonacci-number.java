class Solution {
    public int refib(int n){
        if(n<=1)return n;
        int last = refib(n-1);
        int slast = refib(n-2);
        return last+slast;
    }
    public int fib(int n) {
        if(n<=1)return n;
        int a = 0; 
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }return b;
    }
}