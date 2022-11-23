
public class Staff {
	String id;
	String name;
	String dateofbirth;
	String gender;
	int salary;
	Staff next;
	Staff prev;
	Staff() {
		this.id = " ";
		this.name = " ";
		this.dateofbirth = " ";
		this.gender = " ";
		this.salary = 0;
		next = null;
		prev = null;
	}
}
