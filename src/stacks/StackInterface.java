package stacks;

public interface StackInterface<T> {
	public T peek();
	public T pop();
	public void push(T entry);
	public boolean isEmpty();
	public void clear();
}
