import java.util.*;
class NSEL {
    public static int[] NearestSmallerElementFromLeft(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length]; 
        for(int i=0; i<arr.length; i++){
                while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                    stack.pop();
                    stack.push(i);
                }
                if (stack.isEmpty()){
                    ans[i]=-1;
                    stack.push(i);
                }
                else{
                    ans[i] = stack.peek(); 
                    stack.push(i);                   
                }
            }
        return ans;
    }
  
    public static void main(String[] args) {
        int nums[] = {6,4,8,2,0,2,9};
        int ans[] = NearestSmallerElementFromLeft(nums);
        for(int a:ans){
            System.out.print(a + " ");
        }
    }
    
}
