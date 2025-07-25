public class ArrayEx {
    
    public static void main(String[] args) {
        
        int[] orginal = {10,20,30,40,50};
        int[] copy = new int[orginal.length];

        for(int i = 0; i<orginal.length;i++){
            copy[i] = orginal[i];

        }

        System.out.println("copied array");

        for(int num : copy){

            System.out.print(num + " ");
        }
    }
}
