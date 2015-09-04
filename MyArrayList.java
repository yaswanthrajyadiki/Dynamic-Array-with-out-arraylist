public interface MyArrayList<T> {
	void add(T element);
	void removeIndex(int index);
	void removeElement(T element);
	void modifyIndex(int index, T element);
    void modifyElement(T element1, T element2);
	void read(int index);
}