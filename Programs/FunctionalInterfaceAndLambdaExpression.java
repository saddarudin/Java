/*

What is functional interface?
Functional interface is a type of interface that has only one method
e.g
@FunctionalInterface
interface Interface{

void show();
}



What is lambda expression?
Lambda expression is used to implement the functional interface.
->Lambda expression is only for functional interface

How to use lambda expression?


class Demo{
	psvm(String[]args){
		
		Without lambda expression
		Interface i = new Interface(){
			public void show(){
				print("Hi");
			}
		};

		With lambda expression
		Interface i = () -> print("Hi");
	}
}



what if function is taking parameter?

case 1: If function is taking only one parameter Like show(int a): 
	Interface i = a -> print(a);

case 2: If function is taking more than one parameter say show(int a, int b):
	Interface i = (a,b) -> print(a+b);

case 3: If function is returning something say int add(int a, int b):
	Interface i = (a,b) -> a+b (No need to write return keyword)
  
*/