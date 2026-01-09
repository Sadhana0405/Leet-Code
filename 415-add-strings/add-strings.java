class Solution {
    public String addStrings(String num1, String num2) {
       /* int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = x+y;
        */
        //return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
        return new java.math.BigInteger(num1).add(new java.math.BigInteger(num2)).toString();
    }
}