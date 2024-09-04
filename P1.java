public class P1
{
 public static  void main(String [] arg){
    System.out.println("container with most water");
    int [] arr={7,1,2,3,9};
    int maxarea = 0 , i=0 , j = arr.length-1;
    while (i<j) {
      int height = Math.min(arr[i],arr[j]);
      int width = j-i;
      int area = height*width;
      maxarea = Math.max(maxarea,area);
      if(arr[i]<=arr[j]){
         i++;
      }
      else{
         j--;
      }
    }
    System.out.println(maxarea);
    
 }
};