package Warmup_1;

public class Warmup1 {
/////////////////////////////////////////////////////////////////////////////№1
public boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday || vacation){
        return true;
    }
    else{
        return false;
    }
}
//////////////////////////////////////////////////////////////////////////////№2
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile || !aSmile && !bSmile)
    {//Trouble
        return true;
    }
    else{
    return false;
    }
}
///////////////////////////////////////////////////////////////////////////////№3
//условие//Given two int values, return their sum. Unless the two values are the same, then return double their sum\\
//
public int sumDouble(int a, int b) {                                          //             Site solution           \\
 // Given two int values, return their sum                                    // public int sumDouble(int a, int b) {
    int sum = a + b;                                                          // Store the sum in a local variable
 // Unless the two values are the same, then return double their sum          // int sum = a + b;
    if(a != b){
     sum *=2;                                                                 // Double it if a and b are the same
     return sum;                                                              // if (a == b) {
    }                                                                         // sum = sum * 2;
     return sum;                                                              // }
    }                                                                         // return sum;
                                                                              // }
///////////////////////////////////////////////////////////////////////////////№4
public int diff21(int n) {
if(n<=21){

return 21 - n;
}

else{

 return (n - 21) * 2;
}
}
/////////////////////////////////////////////////////////////////////////////////№5
public boolean parrotTrouble(boolean talking, int hour)
{
    if(talking &&(hour < 7 || hour > 20))
    {
        return true;
    }
    else{
        return false;
    }

}
////////////////////////////////////////////////////////////////////////////////№6
public boolean makes10(int a, int b) {
    if(a == 10 || b == 10 || a + b == 10){
        return true;
    }
    else{
        return false;
    }
}
///////////////////////////////////////////////////////////////////////////////№7
public boolean nearHundred(int n) {
    if(Math.abs(100 - n)<=10 || Math.abs(200 - n )<=10){
        return true;
    }
    else{
        return false;
    }
}
////////////////////////////////////////////////////////////////////////////////№8
public boolean posNeg(int a, int b, boolean negative) {
    if(a < 0 && b < 0){

        return true;
    }
    else if((a < 0 && b > 0) || (a > 0 && b < 0)){

        return true;
    }
    return false;
}
///////////////////////////////////////////////////////////////////////////////№9
public String notString(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        return str;
    }else {

        return "not " + str;
    }
}
///////////////////////////////////////////////////////////////////////////////№10

    }

