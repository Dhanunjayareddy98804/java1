class PersonTester{
public static void main(String personData[]){

//ClassName ref = new Constructor (ClassName());
	Person person = new Person();
	
	person.setPersonName("pushparaj");
	person.setAge(36);
	person.setAddress("tirupati");
	person.setGender("Male");
	
	System.out.println(person.getPersonName() +" "+ person.getAge() +" "+ person.getAddress() +" "+ person.getGender());

	Person person1 = new Person();
	person1.setPersonName("shreevali");
	person1.setAge(34);
	person1.setAddress("tirupati");
	person1.setGender("female");
	
	System.out.println(person1.getPersonName() +" "+ person1.getAge() +" "+ person1.getAddress() +" "+ person1.getGender());


}


}