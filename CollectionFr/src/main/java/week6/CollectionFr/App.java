package week6.CollectionFr;
public class App 
{
    private Object[] objArray = new Object[10]; //Initializing the array to minimum capacity
    private int count=0;
    int i;
    public void add(Object obj)                 //adding new object
    {
    	if(count==objArray.length)
    	{
    		increaseCapacity();
    	}
    	objArray[count]=obj;
    	count++;
     
    }
	private void increaseCapacity() {             //Increasing the arraysize making it growable
		int newCapacity =objArray.length*2;
		Object[] newArray = new Object[newCapacity];
		for(int i=0;i<objArray.length;i++) {
			newArray[i]= objArray[i];
		}
		objArray = newArray;
	}
	public Object get(int i) {
		if(i<0 || i>=objArray.length) {
			throw new IndexOutOfBoundsException();
		}
		return objArray[i];
		
	}
	public void remove(int i) {
		if(i<0 || i>=objArray.length) {
			throw new IndexOutOfBoundsException();
		}
		
		while(i<objArray.length-1) {
			objArray[i] = objArray[i+1];
			i++;
		}
		objArray[i]=null;
		count--;
		
	}
	public int len()
	{
		return count;
	}
}