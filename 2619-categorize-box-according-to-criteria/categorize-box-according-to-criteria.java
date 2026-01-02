class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean b = false;
        long v = (long) length * width * height;
        if(length>=10000 || width>=10000 || height>=10000 || v>=1000000000){
            b = true;
        }
        boolean h = false;
        if(mass>=100){
            h = true;
        }
        if(b && h){
            return "Both";
        }
        if(b){
            return "Bulky";
        }
        if(h){
            return "Heavy";
        }
        return "Neither";
    }
}