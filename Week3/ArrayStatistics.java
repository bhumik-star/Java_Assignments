import java.util.Scanner;
public class ArrayStatistics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        if(size==0){
            System.out.println("Invalid Size.");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = input.nextInt();
        }
        int res1 = sum(arr);
        System.out.println("Sum of the Array: "+res1);
        int res2 = avg(arr,res1);
        System.out.println("Average of the Array: "+res2);
        int res3 = min(arr);
        System.out.println("Minimum element: "+res3);
        int res4 = max(arr);
        System.out.println("Maximum element: "+res4);
        printsigncount(arr);
        input.close();
    }
    public static int sum(int[] val){
        int sum =0;
        for(int i=0;i<val.length;i++){
            sum += val[i];
        }
        return sum;
    }
    public static int avg(int[] val,int sum){
        int avg=sum/val.length;
        return avg; 
        }
        public static int min(int[] val){
            int min = val[0];
            for(int i =0;i<val.length;i++){
                if(val[i]<min){
                    min = val[i];
                }            
            }
            return min;
        }
        public static int max(int[] val){
            int max = val[0];
            for(int i =0;i<val.length;i++){
                if(val[i]>max){
                    max = val[i];
                }            
            }
            return max;
        }
        public static int evencount(int[] val){
            int count=0;
            for(int i=0;i<val.length;i++){
                if(val[i]%2==0){
                    count++;
                }
                else{continue;} 
            }
            return count;
        }
        public static void printsigncount(int[] val){
            int negcount=0;
            int poscount=0;
            int zerocount=0;
            for(int i=0;i<val.length;i++){
                if(val[i]<0){
                    negcount++;
                }
                else if(val[i]>0){
                    poscount++;
                }
                else{
                    zerocount++;
                }
            }
            System.out.println("Negative elements: "+negcount);
            System.out.println("Positive elements: "+poscount);
            System.out.println("Zero elements: "+zerocount);
        }

    }

