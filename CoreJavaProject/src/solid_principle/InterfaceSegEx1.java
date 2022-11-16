package solid_principle;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first object-oriented design (ooD) 
 * principles by C.Mortin
 * 
 * S - Single Responsibility Principle - 
 * 			A class should have one and only one reason to change.
 * O - Open Closed Principle - 
 * 			Objects or entities should be open for extension but closed for modification. 
 * L - Liskov Substitution Principle -
 * 			Objects of super class shall be replaced with objects of subclasses.
 * I - Interface Segregation Principle -
 * 			A client should never be forced to implement an interface that it does not use.
 * D -
 */
interface VegRestaurant{
	void vegMeals();
	
	
}
interface NonVegRestaurant{
	
	void nonVegMeals();
	
}
class ABCVegRastaurant implements VegRestaurant{

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		
	}

}
class XYZNonVegRestaurant implements NonVegRestaurant,VegRestaurant{

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nonVegMeals() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceSegEx1 {
	public static void main(String[] args) {
		
	}
}
