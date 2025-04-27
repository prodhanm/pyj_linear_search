import java.util.Scanner;

class Linear {
    public static int search(int[] list, int num, int key) {
        for(int i=0; i<num; i++) {
            if(list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        int key = 40;
        int list[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("Enter the number of an element: ");
        num = inp.nextInt(); 
        int index = search(list, num, key);
        if(index == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        inp.close();
    }
}