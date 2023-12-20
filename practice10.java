//1. create an array of 5 floats and calculate their sum
float[] arr= new float[5];
arr[0]=20;
arr[1]=20;
arr[2]=20;        
arr[3]=20;
arr[4]=20;
 float sum = arr[0]+arr[2]+arr[2]+arr[3]+arr[4];
 System.out.println(sum);
 //or it can be done like
 float[] marks={23.09f,34.5f,56.900f,43.3f,34.45f};
 float plus=0;
 for(float element:marks){
    plus=plus + element;
 }
System.out.println("plus is equal to " + plus);


2.Write a program to find out whether a given integer is present in an array or not.

float[] marks= {43.0f,45.6f,34.5f,56.43f};

float check = 34.5f;
boolean present=false;
for(float element:marks){
if(check == element ){
present=true;
break;
}
}
if(present){
    System.out.println("array is present");
}
else{
    System.out.println("Array is not present");
}
