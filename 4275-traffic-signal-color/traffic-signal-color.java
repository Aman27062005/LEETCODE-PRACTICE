class Solution {
    public String trafficSignal(int timer) 
    {
        String str="";
        if(timer==0)
        {
            str="Green";
        } 
        else if(timer==30)
        {
            str="Orange";
        }
        else if( timer>30 && timer<=90)
        {
            str="Red";
        }
        else
        {
            str="Invalid";
        }
        return str;  
    }
}