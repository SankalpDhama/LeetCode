class Solution {
    static int reduceByRecur(int count,int num){
        if(num==0){
            return count;
        }
        else if(num%2==0){
            num/=2;
            count++;
            System.out.printf("%d and %d even",num,count);
            System.out.println();
            return reduceByRecur(count,num);
        }else{
            num--;
            count++;
            System.out.printf("%d and %d odd",num,count);
            System.out.println();
            return reduceByRecur(count,num);
        }
    }
    public int numberOfSteps(int num) {
        return reduceByRecur(0,num);
    }
}