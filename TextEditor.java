import java.util.*;
interface Stack{
    void push(String item);
    String pop();
    String peek();
    boolean isempty();
}
class ArrayStack implements Stack{
    private String[] elements=new String[10];
    private int top=-1;

    public void push(String item){
        if (top==elements.length-1){
            System.out.println("Stack is full!Cannot push");
            return;
        }
        elements [++top]=item;
    }
    public String pop(){
        if(isempty()){
            System.out.println("Stack is empty");
            return null;
        }
        return elements[--top];
    }
    public String peek(){
        if (isempty()) return null;
        return elements[top];
    }
    public boolean isempty(){
        return top==-1;
    }
}
public class TextEditor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayStack undo =new ArrayStack();
        while(true){
            System.out.println("\n-----Text editor-----");
            System.out.println("1.Type a text");
            System.out.println("2.Undo");
            System.out.println("3.View current text");
            System.out.println("4.Exit");
            System.out.println("Enter a choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("Enter a text");
                String text=sc.nextLine();
                undo.push(text);
                break;
                case 2:
                String undone =undo.pop();
                if(undone!=null){
                    System.out.println("Undone:"+undone);
                }
                break;
                case 3:
                String current=undo.peek();
                System.out.println("Currnt text:"+current!=null?current:"no text");
                break;
                case 4:
                System.out.println("Exiting Program....");
                sc.close();
                return;
                default:
                System.out.println("Invalid choice");
            }
        }
    }
}