import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class QueueInterface
{
public static void main(String[] args)
{
Queue<Integer> q=new LinkedList<Integer>();
for(int i=0;i<5;i++)
q.add(i);
System.out.println("Elements of queue"+q);
int removes=q.remove();
System.out.println("removed element is"+removes);
removes=q.remove();
System.out.println("removed element is"+removes);
System.out.println("remaing elements are"+q);
}
}
