class TableTester{
public static void main(String data[]){

//ClasssetName ref = new Constructor (ClasssetName());
	Table table = new Table();
	
	table.setName("madesa");
	table.setPrice("9999");
	table.setColor("black");
	table.setFinishType("painted");
	table.setWeight("31 kg");
	
	System.out.println(table.getName() +" "+table.getPrice() +" "+ table.getColor() +" "+ table.getFinishType()+" "+ table.getWeight());
	
	Table table1 = new Table();
	table1.setName("bluewud");
	table1.setPrice("6137");
	table1.setColor("brown");
	table1.setFinishType("painted");
	table1.setWeight("40 kg");
	
	System.out.println(table1.getName() +" "+ table1.getPrice() +" "+ table1.getColor() +" "+ table1.getFinishType()+" "+ table1.getWeight());

	Table table2 = new Table();	
	table2.setName("gaming table");
	table2.setPrice("10000");
	table2.setColor("white");
	table2.setFinishType("painted");
	table2.setWeight("32kg");
	
	System.out.println(table2.getName() +" "+ table2.getPrice() +" "+ table2.getColor() +" "+ table2.getFinishType()+" "+ table2.getWeight());
	
	Table table3 = new Table();
	table3.setName("tekavo");
	table3.setPrice("9989");
	table3.setColor("blue");
	table3.setFinishType("powder coated");
	table3.setWeight("60 kg");
	
	System.out.println(table3.getName() +" "+ table3.getPrice() +" "+ table3.getColor() +" "+ table3.getFinishType()+" "+ table3.getWeight());
	
	Table table4 = new Table();
	table4.setName("uhud");
	table4.setPrice("9500");
	table4.setColor("green");
	table4.setFinishType("powder coated");
	table4.setWeight("40 kg");
	
	System.out.println(table4.getName() +" "+ table4.getPrice() +" "+ table4.getColor() +" "+ table4.getFinishType()+" "+ table4.getWeight());
	
}

}