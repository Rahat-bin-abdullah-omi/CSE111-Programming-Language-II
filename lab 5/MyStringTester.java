public class MyStringTester {   
  public static void main(String args[]){ 
    
    String my_string = "Hello World"; 
    MyString s = new MyString(my_string); 
    
    // Task 1: 
    int len = s.length(); 
    System.out.println("Task1 " + ((my_string.length()==len) ? "[Pass]" : "[Fail]")); 
    System.out.println("Length is: "+len); // This should print 11 
    System.out.println(); 
    
    // Task 2: 
    System.out.println("Task2 " + ((my_string.charAt(6)==s.charAt(6)) ? "[Pass]" : "[Fail]")); 
    System.out.println("Char at index 6 is: "+s.charAt(6)); // This should print 'W'   
    System.out.println(); 
    
    // Task 3: 
    boolean test1 = s.startsWith("He"); 
    boolean test2 = s.startsWith("ABC"); 
    System.out.println("Task3 " + ((my_string.startsWith("He")==test1 && my_string.startsWith("ABC")==test2) ? "[Pass]" : "[Fail]")); 
    System.out.println("StartsWith 'He': " + test1); 
    System.out.println("StartsWith 'ABC': " + test2); 
    System.out.println(); 
    
    
    // Task 4: 
    boolean test3 = s.endsWith("orld"); 
    boolean test4 = s.endsWith("ABC"); 
    System.out.println("Task4 " + ((my_string.endsWith("orld")==test3 && my_string.endsWith("ABC")==test4) ? "[Pass]" : "[Fail]")); 
    System.out.println("EndsWith 'orld': " + test3); 
    System.out.println("EndsWith 'ABC': " + test4); 
    System.out.println(); 
    
    // Task 5: 
     
    System.out.println("Task5 " + (my_string.replaceFirst("o", "e").equals(s.replaceFirst('o','e')) ? "[Pass]" : "[Fail]")); 
    System.out.println("ReplaceFirst 'o' with 'e': " + s.replaceFirst('o','e')); 
    System.out.println(); 
    
    // Task 6: 
    my_string = "Hello World"; 
    s= new MyString(my_string); 
    System.out.println("Task6 " + ((my_string.replaceAll("o", "e").equals(s.replaceAll('o','e'))) ? "[Pass]" : "[Fail]")); 
    System.out.println("ReplaceAll 'o' with 'e': " + s.replaceAll('o','e')); 
    System.out.println(); 
    
    // Task 7: 
    my_string = "Hello World"; 
    s= new MyString(my_string); 
    String new_string = "Hello Werld"; 
    System.out.println("Task7 " + ((new_string.equals(s.replaceLast('o','e'))) ? "[Pass]" : "[Fail]")); 
    System.out.println("ReplaceLast 'o' with 'e': " + s.replaceLast('o','e')); 
    System.out.println(); 
    
    // Task 8: 
    my_string = "Hello World"; 
    s= new MyString(my_string); 

    System.out.println("Task8 " + ((my_string.toLowerCase().equals(s.toLowerCase(my_string))) ? "[Pass]" : "[Fail]")); 
    System.out.println("toLowerCase() : " + s.toLowerCase(my_string)); 
    System.out.println(); 
    
    // Task 9: 
    my_string = "Hello World"; 
    s= new MyString(my_string); 
    System.out.println("Task9 " + (my_string.toUpperCase().equals(s.toUpperCase(my_string)) ? "[Pass]" : "[Fail]")); 
    System.out.println("toUpperCase() : " + s.toUpperCase(my_string)); 
    System.out.println(); 
    
    // Task 10: 
    my_string = "Hello World"; 
    s= new MyString(my_string); 
    test1 = s.equals("Hello World"); 
    test2 = s.equals("HELLO WORLD"); 
    System.out.println("Task10 " + ((my_string.equals("Hello World")==test1 && my_string.equals("HELLO WORLD")==test2) ? "[Pass]" : "[Fail]")); 
    System.out.println("Equals 'Hello World': " + test1); 
    System.out.println("Equals 'HELLO WORLD': " + test2); 
    System.out.println(); 
    
    // Task 11: 
    test1 = s.equalsIgnoreCase("Hello World"); 
    test2 = s.equalsIgnoreCase("HELLO WORLD"); 
    System.out.println("Task11 " + ((my_string.equalsIgnoreCase("Hello World")==test1 && my_string.equalsIgnoreCase("HELLO WORLD")==test2) ? "[Pass]" : "[Fail]")); 
    System.out.println("EqualsIgnoreCase 'Hello World': " + test1); 
    System.out.println("EqualsIgnoreCase 'HELLO WORLD': " + test2); 
    System.out.println(); 
    
    
    // Task 12 
    int comp1 = s.compareTo("ABC"); 
    int comp2 = s.compareTo("HELLO WORLD"); 
    int comp3 = s.compareTo("Hello World"); 
    System.out.println("Task12 " + ((my_string.compareTo("ABC")==comp1 && my_string.compareTo("HELLO WORLD")==comp2 && my_string.compareTo("Hello World")==comp3) ? "[Pass]" : "[Fail]")); 
    System.out.println("CompareTo 'ABC': " + comp1); 
    System.out.println("CapareTo 'HELLO WORLD': " + comp2); 
    System.out.println("CapareTo 'Hello World': " + comp3); 
    System.out.println(); 
    
    // Task 13 
    comp1 = s.compareToIgnoreCase("ABC"); 
    comp2 = s.compareToIgnoreCase("HELLO WORLD"); 
    comp3 = s.compareToIgnoreCase("Hello World"); 
    System.out.println("Task13 " + ((my_string.compareToIgnoreCase("ABC")==comp1 && my_string.compareToIgnoreCase("HELLO WORLD")==comp2 && my_string.compareToIgnoreCase("Hello World")==comp3) ? "[Pass]" : "[Fail]")); 
    System.out.println("CompareTo 'ABC': " + comp1); 
    System.out.println("CapareTo 'HELLO WORLD': " + comp2); 
    System.out.println("CapareTo 'Hello World': " + comp3); 
    System.out.println(); 
    
    // Task 14 
    new_string = s.substring(5);
    System.out.println("Task14 " + (new_string.equals(my_string.substring(5)) ? "[Pass]" : "[Fail]")); 
    System.out.println("Substring '5': " + new_string); 
    System.out.println(); 
    
    // Task 15 
    new_string = s.substring(5, 8); 
    System.out.println("Task15 " + (new_string.equals(my_string.substring(5, 8)) ? "[Pass]" : "[Fail]")); 
    System.out.println("Substring '(5,8)': " + new_string); 
    System.out.println(); 
    
    // Task 16 
    comp1 = s.indexOf('W'); 
    comp2 = s.indexOf('o'); 
    System.out.println("Task16 " + ((my_string.indexOf('W')==comp1 && my_string.indexOf('o')==comp2) ? "[Pass]" : "[Fail]")); 
    System.out.println("IndexOf with 'W': "+comp1); 
    System.out.println("IndexOf with 'o': "+comp2); 
    System.out.println(); 
    
    // Task 17 
    comp1 = s.lastIndexOf('W'); 
    comp2 = s.lastIndexOf('o'); 
    System.out.println("Task17 " + ((my_string.lastIndexOf('W')==comp1 && my_string.lastIndexOf('o')==comp2) ? "[Pass]" : "[Fail]")); 
    System.out.println("LastIndexOf with 'W': "+comp1); 
    System.out.println("LastIndexOf with 'o': "+comp2); 
    System.out.println(); 
    
    // Task 18 
    comp1 = s.indexOf('W', 6); 
    comp2 = s.indexOf('o', 6); 
    System.out.println("Task18 " + ((my_string.indexOf('W', 6)==comp1 && my_string.indexOf('o', 6)==comp2) ? "[Pass]" : "[Fail]")); 
    System.out.println("IndexOf with 'W' with start index 6: "+comp1); 
    System.out.println("IndexOf with 'o' with start index 6: "+comp2); 
    System.out.println(); 
    
    // Task 19 
    comp1 = s.lastIndexOf('W', 6); 
    comp2 = s.lastIndexOf('o', 6); 
    System.out.println("Task19 " + ((my_string.lastIndexOf('W', 6)==comp1 && my_string.lastIndexOf('o', 6)==comp2) ? "[Pass]" : "[Fail]")); 
    System.out.println("LastIndexOf with 'W' with start index 6: "+comp1); 
    System.out.println("LastIndexOf with 'o' with start index 6: "+comp2); 
    System.out.println(); 
    
    // Task 20: 
    new_string = s.concat(" Day"); 
    System.out.println("Task20 " + (new_string.equals(my_string.concat(" Day")) ? "[Pass]" : "[Fail]")); 
    System.out.println("Concat with ' Day': " + new_string); 
    System.out.println(); 
    
    
    
  } 
}