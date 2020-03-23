package Warmup_1;

public class Warmup1 {
///////////////////////////////////////////////////////////////////////////////
public boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday || vacation){
        return true;
    }
    else{
        return false;
    }
}
//////////////////////////////////////////////////////////////////////////////
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile || !aSmile && !bSmile)
    {//Trouble
        return true;
    }
    else{
    return false;
    }
}
///////////////////////////////////////////////////////////////////////////////
public int sumDouble(int a, int b) {
    int sum = a + b;

    if(a != b){
        sum *=2;
        return sum;
    }
    return sum;
}
////////////////////////////////////////////////////////////////////////////////////




    }

