/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supertest;

/**
 *
 * @author jeremyhodgson
 */
public class B extends A{
	public B() {
        super();
            System.out.println("default constructor, B");
	}
	public B(int i) {
        super(6);
            System.out.println("parameterized constructor, B");
	}    
}
