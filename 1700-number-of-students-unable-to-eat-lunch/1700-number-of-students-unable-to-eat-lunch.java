class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sizeStudents=students.length;
        int sizeSandwiches=students.length;
        int index=0;
        Stack<Integer> sandwichesStack=new Stack<>();
        Queue<Integer> studentsQueue=new LinkedList<>();
        for(int i=0;i<sizeStudents;i++){
            studentsQueue.add(students[i]);
        }
        for(int i=sizeSandwiches-1;i>=0;i--){
            sandwichesStack.push(sandwiches[i]);
        }
        int ate=0;
        while(!sandwichesStack.isEmpty()){
            if(sandwichesStack.peek()==studentsQueue.peek()){
               ate++;
                sandwichesStack.pop();
                studentsQueue.remove();
                index=0;
            }else{
                studentsQueue.add(studentsQueue.remove());
                index++;
                if(index==studentsQueue.size()){
                    break;
                }
            }
        }
        return sizeSandwiches-ate;
    }
}