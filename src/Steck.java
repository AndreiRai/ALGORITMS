import java.util.Stack;
public class Steck {

        public static void main(String[] args)
        {
            Stack<String> stack = new Stack<String>();

            stack.push("A");    // Вставляем `A` в stack
            stack.push("B");    // Вставляем `B` в stack
            stack.push("C");    // Вставляем `C` в stack
            stack.push("D");    // Вставляем `D` в stack

            // печатает вершину stack (`D`)
            System.out.println("The top element is " + stack.peek());

            stack.pop();        // удаление верхнего элемента (`D`)
            stack.pop();        // удаление следующей вершины (`C`)

            // возвращает общее количество элементов в stack
            System.out.println("The stack size is " + stack.size());

            // проверяем, пуст ли stack
            if (stack.empty()) {
                System.out.println("The stack is empty");
            }
            else {
                System.out.println("The stack is not empty");
            }
        }
    }

