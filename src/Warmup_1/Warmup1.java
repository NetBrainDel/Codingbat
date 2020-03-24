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
public String backAround(String str) {
String last = str.substring(str.length() - 1);

return last + str + last;
  }
/////////////////////////////////////////////////////////////////////////////////№14
public boolean or35(int n) {
    if(n % 3 == 0 || n % 5 == 0){
        return true;

    }
    return false;
}
//////////////////////////////////////////////////////////////////////////////////№15
public String front22(String str) {
    int take = 2;
    if(str.length() < take){
        take = str.length();
    }
    String front = str.substring(0, take);
    return front + str + front;
}
//////////////////////////////////////////////////////////////////////////////////№16
public boolean startHi(String str) {
    if (str.length() < 2){
        return false;
    }
    String into = str.substring(0, 2);

    if (into.equals("hi")) {
        return true;
    }
    else {
        return false;
    }

}
///////////////////////////////////////////////////////////////////////////////////№17
public boolean icyHot(int temp1, int temp2) {
    if((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100)){
        return true;
    }
    return false;
}
////////////////////////////////////////////////////////////////////////////////№18
public boolean in1020(int a, int b) {
    if(a >= 10 && a <=20 || b >=10 && b <=20){
        return true;
    }
    return false;
}
////////////////////////////////////////////////////////////////////////////////№19
public boolean hasTeen(int a, int b, int c) {
    if(a >=13 && a <= 19 || b >=13 && b <= 19 || c >=13 && c <= 19){
        return true;
    }
    return false;
}
/////////////////////////////////////////////////////////////////////////////////№20
public boolean loneTeen(int a, int b) {

    boolean a2 = (a >= 13 && a <= 19);
    boolean b2 = (b >= 13 && b <= 19);

    if((a2 && !b2) || (!a2 && b2)){
        return true;
    }
    return false;
}
///////////////////////////////////////////////////////////////////////////////////№21
public String delDel(String str) {
    if (str.length()>=4 && str.substring(1, 4).equals("del")) {

        return str.substring(0, 1) + str.substring(4);
    }

    return str;
}
/////////////////////////////////////////////////////////////////////////////////////№22
public boolean mixStart(String str) {

    if (str.length() < 3){
        return false;
    }
    String two = str.substring(1, 3);

    if (two.equals("ix")) {
        return true;
    }
    else {
        return false;
    }

}
//////////////////////////////////////////////////////////////////////////////////////№23
public String startOz(String str) {
    String result = "";

    if (str.length() >= 1 && str.charAt(0)=='o') {
        result = result + str.charAt(0);
    }

    if (str.length() >= 2 && str.charAt(1)=='z') {
        result = result + str.charAt(1);
    }

    return result;
}
///////////////////////////////////////////////////////////////////////////////////////////№24
public int intMax(int a, int b, int c) {
    int max;

    if (a > b) {
        max = a;
    } else {
        max = b;
    }

    if (c > max) {
        max = c;
    }

    return max;

}
///////////////////////////////////////////////////////////////////////////////////////////№25
public int close10(int a, int b) {
    int a2 = Math.abs(a - 10);
    int b2 = Math.abs(b - 10);

    if (a2 < b2) {
        return a;
    }
    else if (b2 < a2) {
        return b;
    }
    return 0;

}
//////////////////////////////////////////////////////////////////////////////////////////////№26
public boolean in3050(int a, int b) {
    if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)){
        return true;
    }
    if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)){
        return true;
    }
    return false;
}
////////////////////////////////////////////////////////////////////////////////////////////////№27
public int max1020(int a, int b) {
    if (b > a) {
        int a2 = a;
        a = b;
        b = a2;
    }
    if (a >= 10 && a <= 20){

        return a;
    }
    if (b >= 10 && b <= 20){

        return b;
    }
    else {

        return 0;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////№28
public boolean stringE(String str) {
    int count = 0;

    for (int i=0; i<str.length(); i++) {
        if (str.charAt(i) == 'e'){
            count++;
        }
    }
    if(count >= 1 && count <= 3){
        return true;
    }

    return false;
}
/////////////////////////////////////////////////////////////////////////////////////////////////№29
public boolean lastDigit(int a, int b) {
    if(a % 10 == b % 10){
        return true;
    }
    return false;
}
/////////////////////////////////////////////////////////////////////////////////////////////////№30
public String endUp(String str) {
    if (str.length() <= 3) return str.toUpperCase();
    int cut = str.length() - 3;
    String front = str.substring(0, cut);
    String back = str.substring(cut);

    return front + back.toUpperCase();
}
///////////////////////////////////////////////////////////////////////////////////////////////№31
public String everyNth(String str, int n) {
    String result = "";

    for (int i=0; i<str.length(); i+=n) {
        result += str.charAt(i);
    }
    return result;
 }
}

