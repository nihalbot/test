#include<iostream>
using namespace std;


int main()
{
    int arr[] = {1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4};
    int flag;

    for(int i = 0; i < 11; i++){
        if(arr[i] == arr[i+1]){
            continue;
        }else{
            flag = arr[i];
            break;
        }
    }
    cout << flag;
}