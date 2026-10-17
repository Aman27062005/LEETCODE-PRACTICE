class Solution 
{
    public int daysBetweenDates(String date1, String date2) 
    {
        int d1 = getDays(date1);
        int d2 = getDays(date2);
        return Math.abs(d1 - d2);
    }

    public int getDays(String date) 
    {
        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int total = year * 365 + day;

        for (int i = 1; i < year; i++) 
        {
            if (isLeap(i)) 
            {
                total++;
            }
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        if (month > 2 && isLeap(year)) {
            total++;
        }

        return total;
    }

    public boolean isLeap(int year) 
    {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}