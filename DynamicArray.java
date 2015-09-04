import java.util.Scanner;

class DynamicArray<T> implements MyArrayList<T> {
  int end;
  T[] array;
  DynamicArray() {
    end = -1;
    array = (T[])new Object[10];
  }
  
  public void add(T element) {
	end++;
    if (end < array.length - 1) {
      array[end] = element;
    } else {
      int newSize = 2 * array.length;
      T[] newArray = (T[])new Object[newSize];
      System.arraycopy(array, 0, newArray, 0, array.length);
      array = newArray;
      array[end] = element;
      }
  }

  public void removeIndex(int index) {
    for (int i = 0; i <= end; i++) {
      if (index == i) {
        for (int j = i; j <= end - 1; j++) {
          array[j] = array[j + 1];
        }
        end--;
      }
    }
  }

  public void removeElement(T element) {
    for (int i = 0; i <= end; i++) {
      if (array[i] == element) {
        for (int j = i; j <= end - 1; j++) {
          array[j] = array[j + 1];
        }
        end--;
      }
    }
  }
  
  public void read(int index) {
    if (index <= end) {
      System.out.println(array[index]);
    }
  }

  public void modifyIndex(int index, T element) {
    for (int i = 0; i <= end; i++) {
      if (index == i) {
        array[i] = element;
      }
    }
  }

  public void modifyElement(T element1, T element2) {
    for (int i = 0; i <= end; i++) {
      if (array[i] == element1) {
        array[i] = element2;
      }
    }
  }

  public void print() {
    for (int i = 0; i < end; i++) {
      System.out.print(array[i] + ",");
    }
    System.out.println(array[end]);
  }
}