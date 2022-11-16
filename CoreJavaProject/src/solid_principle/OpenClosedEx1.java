package solid_principle;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first object-oriented design (ooD) 
 * principles by C.Mortin
 * 
 * S - Single Responsibility Principle - 
 * 				A class should have one and only one reason to change.
 * O - Open Closed Principle - 
 * 				Objects or entities should be open for extension but closed for modification. 
 * L -
 * I -
 * D -
 */
interface ValueComparator{
	
	int compare(int value1, int value2);
}
class ArrayUtil{
	public static final void sort(int a[], ValueComparator comparator) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(comparator.compare(a[i], a[j]) > 0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
public class OpenClosedEx1 {
	public static void main(String[] args) {
		int arr[]= {1,5,4,2,3};
		ArrayUtil.sort(arr, new DescComparator());
		System.out.println("Values in the array are ");
		for(int ele : arr) {
		System.out.print(ele+" ");
		}
	}
}
class AscComparator implements ValueComparator{

	@Override
	public int compare(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1 - value2;
	}
	
}
class DescComparator implements ValueComparator{

	@Override
	public int compare(int value1, int value2) {
		// TODO Auto-generated method stub
		return value2 - value1;
	}
	
}
