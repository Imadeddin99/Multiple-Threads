
public class MyThread extends Thread {
	
	String typeOfSearch;
	int Arr[];
	int element;
	MyThread(String typeOfSearch,int Arr[],int element){
		
		this.typeOfSearch = typeOfSearch;
		this.Arr=Arr;
		this.element=element;
		}
	
	public int linearSearch(int Arr[],int element) {
		int index = -1;
		for( int i = 0 ; i < Arr.length ; i++ ) {
			if(Arr[i]==element)index=i;
		}
		return index;
	}
	
	
	int binarySearch(int arr[], int start, int end, int element)
    {
        if (end >= start) {
            int mid = start + (end - start) / 2;
  
            if (arr[mid] == element)
                return mid;
  
           
            if (arr[mid] > element)
                return binarySearch(arr, start, mid - 1, element);
  
           
            return binarySearch(arr, mid + 1, end, element);
        }
  
        
        return -1;
    }
	
	
	
	public void run() {
		if(typeOfSearch.equals("linear")) {
			long timeBefore= System.currentTimeMillis();
			
			int result = linearSearch(Arr, element);
			long timeAfter= System.currentTimeMillis();
			

			System.out.println("Linear Search result: " + result + "  Time used is : " + (timeAfter-timeBefore) );
			
		}
		else if(typeOfSearch.equals("binary")) {
			
			long timeBefore= System.currentTimeMillis();
			int result = binarySearch(Arr, 0, Arr.length, element);
			long timeAfter= System.currentTimeMillis();
			
			System.out.println("Binary Search result: " + result + "  Time used is : " + (timeAfter-timeBefore) );
		}
		
		else {
			System.out.println("This type isn't valid");
		}
	
	}

}
