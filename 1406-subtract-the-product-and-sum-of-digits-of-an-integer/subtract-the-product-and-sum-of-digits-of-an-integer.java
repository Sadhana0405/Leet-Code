class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1,r=0;
        while(n!=0){
            r=n%10;
            pro*=r;
            sum+=r;
            n/=10;
        }
        return pro-sum;
    }
}