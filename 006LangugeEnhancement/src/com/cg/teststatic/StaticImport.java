package com.cg.teststatic;
import static java.lang.System.*;
import java.util.Scanner;
/**
 * @author SmitaBrijesh
 */
public class StaticImport {
	public static void main(String[] args) {
		out.println("static import test");//System.out
		Scanner scan = new Scanner(in);//System.in
		gc();//System.gc()
		exit(0);//System.exit(0)
	}
}
/*
 * ===============static import==================
 * The static import feature of java 5 facilitate the java programmer
 * to access any static method or member directly without class reference
 * There is no need to quality static member with class name.
 */
