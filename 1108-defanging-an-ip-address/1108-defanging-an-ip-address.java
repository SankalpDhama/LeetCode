class Solution {
    public String defangIPaddr(String address) {
        StringBuilder add=new StringBuilder();
        String defanged="[.]";
        int size=address.length();
        for(int i=0;i<size;i++){
            if(address.charAt(i)=='.'){
                add.append("[.]");
            }else{
                add.append(address.charAt(i));
            }
        }
        return add.toString();
    }
}