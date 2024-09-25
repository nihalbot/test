import java.util.*;
public class linearSearch {
    public static void menu(String item[], String name){
        int index = 0;
        for(int i = 0; i < item.length; i++){
            if(item[i] == name){
                index = i;
                System.out.println("Your " + name + "item found at " + index + " List");
            }
        }
    }
    
    public static int serching(int data[], int find){
        int searchData = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] == find){
                searchData = i;
                break;
            } 
            else{
                return searchData = -1;
            }
        }
        return searchData;
    }
    public static void main(String[] args) {
        int data[] = {1, 56, 23, 45, 10, 57 , 89, 23};
        String menu[] = {"Bergur", "Khuchiri", "Samusa", "Tea", "Coffe"};

        //Scanner sc = new Scanner(System.in);

        System.out.print("Which element index you want to find : ");
        int find = sc.nextInt();

        

        System.out.println("Your desier element ->  " + find + " index is : " + serching(data, find));

        System.out.print("Which oder item  : ");
        String menuList = sc.nextLinez

        menu(menuList);
    }
}