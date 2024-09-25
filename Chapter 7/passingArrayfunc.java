import java.util.*;
public class passingArrayfunc {
    public static void updateArray(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int mark[] = {10, 20, 30};

        System.out.println("Older Array");
        for(int i = 0; i < mark.length; i++){
            System.out.print(mark[i] + " ");
        }
        System.out.println();

        updateArray(mark);

        System.out.println("After Update");
        for(int i = 0; i < mark.length; i++){
            System.out.print(mark[i] + " ");
        }

        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();
         System.out.println(menu);

    }
}
