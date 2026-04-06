class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int c=0;
        int left=0;
        int right=0;
        StringBuilder sb=new StringBuilder();
        while(right<n){
            int count=0;
            while(right<n && chars[right]==chars[left]){
                right++;
                count++;
            }
            if(count==1) sb.append(chars[left]);
            else{
                sb.append(chars[left]);
                sb.append(count);
            }
            left=right;
        }
        int len=sb.length();
        for(int i=0;i<len;i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();

    }
}