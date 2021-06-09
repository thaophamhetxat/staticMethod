package com.codegym;

public class Main {

    public static void main(String[] args) {
	StaticMethod.change();
	StaticMethod s1 = new StaticMethod(111,"Hoang");
	StaticMethod s2 = new StaticMethod(222,"Hoan");
	StaticMethod s3 = new StaticMethod(333,"Hoa");

	s1.display();
	s2.display();
	s3.display();
    }
}
