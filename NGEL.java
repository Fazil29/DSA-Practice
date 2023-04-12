import java.util.Stack;

public class NGEL {
    public static int[] nextGreaterElementFromLeft (int arr[]){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]= {6,4,7,3,2,6,8,2};
        int ans[] = nextGreaterElementFromLeft(arr);
        for(int a: ans){
                System.out.println(a);
        }
    }
}
