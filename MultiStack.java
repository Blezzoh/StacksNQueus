public class MultiStack{
  private int n = 3;
  private int capacity;
  private int [] sizes;
  private int [] values;
  
  public MultiStack(int sizeOfOne){
    values = new int [sizeOfOne * n];
    sizes = new int[n];
    capacity = sizeOfOne;
  }
  // push pop and peek can be implemented easily after this
  public int indexOfTop(int index){
    int offset = index * capacity;
    return offset + sizes[index] -1;
  }
  public boolean isFull(int index){
    return sizes[index] == capacity;
  }

  public boolean isEmpty(int index){
    return sizes[index] == 0;
  }
}