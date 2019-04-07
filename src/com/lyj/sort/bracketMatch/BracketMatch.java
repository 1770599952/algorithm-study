package com.lyj.sort.bracketMatch;

import java.util.Iterator;
import java.util.Stack;

public class BracketMatch {

	public static void main(String[] args) {
		bracketMatch("[([])]");
	}
	
	// 如果栈为空，则入栈，如果不为空，则判断栈顶的字符与当前字符是否能够匹配()或者[],如果匹配，则将栈顶字符出栈，否则入栈。
	public static void bracketMatch(String s) {
		
		if(s.length() % 2 != 0) {
			return ;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}else if(stack.peek() == '[' && s.charAt(i) == ']' || stack.peek() == '(' && s.charAt(i) == ')'){    
                //说明此时栈中字符不是空的,并且符合，    
                stack.pop();    
            }else {
            	stack.push(s.charAt(i));
            }
		}
				
        if(stack.isEmpty()){    
            //如果栈是空的，说明括号匹配    
            System.out.println("Yes");    
        }else{    
            //说明栈不为空，括号不匹配    
            System.out.println("No");    
        }  
	}
}
