/*

Types of interface:

There are three types of interfaces:
1. Marker Interface
	An interface that has no methods like:
	interface A{}

2. Functional Interface/ SAM (Single Abstract Method)
	An interface that has one method only like:
	interface A{
		void show();
	}

3. Normal Interface
	An interface that has more than one methods like:
	interface A{
		int add(int a, int b);
		int sub(int a, int b);
	}

*/