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
///////////////////////////////////////////////////////////////////////////////№3??????????
//условие//Given two int values, return their sum. Unless the two values are the same, then return double their sum\\
//??????????                                                                   //             Site solution           \\
public int sumDouble(int a, int b) {                                           // public int sumDouble(int a, int b) {
 // Given two int values, return their sum                                     // Store the sum in a local variable
    int sum = a + b;                                                           // int sum = a + b;

 // Unless the two values are the same, then return double their sum ??        // Double it if a and b are the same
  //?????????????????????????????????????????????????????????????????????????????????????????????
    if(a != b){                                                                // if (a == b) {
  //?????????????????????????????????????????????????????????????????????????????????????????????
     sum *=2;                                                                  // sum = sum * 2;
     return sum;                                                               // }
    }                                                                          // return sum;
     return sum;                                                               // }
    }

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
public String missingChar(String str, int n) {
    String front = str.substring (0, n);

    String back = str.substring (n+1, str.length());

    return front + back;
}
///////////////////////////////////////////////////////////////////////////////№11
public String frontBack(String str) {

    if (str.length() <= 1)return str;

    String mid = str.substring(1, str.length()-1);

    return str.charAt(str.length()-1) + mid + str.charAt(0);
}
//////////////////////////////////////////////////////////////////////////////№12????????????????????
    //??????????????????????????
                                                            //           Site solution         \\
public String front3(String str) {                          // public String front3(String str) {
    String front;                                           // String front;
//If the string length is less than 3\\?????????????????????????????????????????????????????????
    if(str.length() < 3){                                   // if (str.length() >= 3) {
//??????????????????????????????????????????????????????????????????????????????????????????????
        front = str.substring(0, 3);                        // front = str.substring(0, 3);
    }else{                                                  // }
        front = str;                                        // else {
    }                                                       // front = str;
    return front + front + front;                           // }
}                                                           // return front + front + front;
                                                            // }


////////////////////////////////////////////////////////////////////////////////№13

}

