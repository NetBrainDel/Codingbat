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
public int sumDouble(int a, int b) {               //             ответ сайта           \\
    int sum = a + b;                               // public int sumDouble(int a, int b) {
    if(a != b){                                    // Store the sum in a local variable
        sum *=2;                                   // int sum = a + b;
        return sum;
    }                                              // Double it if a and b are the same
        return sum;                                // if (a == b) {
}                                                  // sum = sum * 2;
                                                   // }
                                                   // return sum;
                                                   // }
///////////////////////////////////////////////////////////////////////////////№4




    }

