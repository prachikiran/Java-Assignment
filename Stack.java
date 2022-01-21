
public class Stack {

	private int array[];
	private int volume;
	private int top;

	Stack(int size) {

		array = new int[size];
		volume = size;
		top = -1;

	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		System.out.println("Inserting " + element);
		array[++top] = element;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.print("STACK is empty");
			System.exit(1);
		}
		return array[top--];
	}

	public int findSize() {
		return top + 1;
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	public Boolean isFull() {
		return top == volume - 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.print("Stack: ");
		stack.printStack();

		stack.pop();
		System.out.println("\nAfter popping out: ");
		stack.printStack();

	}
}