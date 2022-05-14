class Solution {
public:
    void moveZeroes(vector<int>& arr) {
            int pos = -1, size = 0;
    int n = arr.size();
    for(int i = 0; i< n; i++){
        if(arr[i] == 0){
            if(pos == -1){
                pos = i;
                size = 1;
            }
            else 
                size++;
        }
        
        else{
            if(size == 0)
                continue;
            else{
                int t = arr[i];
                arr[i] = arr[pos];
                arr[pos] = t;
                
                if(size==1)
                    pos = i;
                else
                    pos++;
            }
        }
    }
    }
};