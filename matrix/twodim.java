class twodim{
public static void main(String[] args){
int firstarray[][]={{1,2,3,5},{1,4,5,6}};
int secondarray[][]={{1,5,6,7},{7,8,9,4}};
System.out.print("enter first array");
display(firstarray);
System.out.print("enter second array");
display(secondarray);
}
public static void display(int x[][]){
for(int row=0;row<x.length;row++){
for(int col=0;col<x[row].length;col++){
System.out.print(x[row][col] + "\t");
}}
System.out.println();
}}
