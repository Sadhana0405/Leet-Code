class Solution {
    public int countDigits(int num) {
        int d=0,l;
        int org=num;
        while(num!=0){
            l=num%10;
            if(org%l==0){
                d++;
            }
            num/=10;
        }
        return d;
    }
}