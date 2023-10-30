package codsoft_project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	class Students {
	    private String name;
	    private int rollNumber;
	    private String grade;

	    public Students(String name, int rollNumber, String grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    
	    public String toString() {
	        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
	    }
	}

	class StudentManagementSystem {
	    private List<Students> students;

	    public StudentManagementSystem() {
	        students = new ArrayList<>();
	    }

	    public void addStudent(Students student) {
	        students.add(student);
	    }

	    public boolean removeStudent(int rollNumber) {
	        for (Students student : students) {
	            if (student.getRollNumber() == rollNumber) {
	                students.remove(student);
	                return true;
	            }
	        }
	        return false;
	    }

	    public Students searchStudent(int rollNumber) {
	        for (Students student : students) {
	            if (student.getRollNumber() == rollNumber) {
	                return student;
	            }
	        }
	        return null;
	    }

	    public List<Students> getAllStudents() {
	        return students;
	    }
	}

	public class studentmanagement {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StudentManagementSystem sms = new StudentManagementSystem();

	        while (true) {
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Search Student");
	            System.out.println("4. Display All Students");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    scanner.nextLine();
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter roll number: ");
	                    int rollNumber = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter grade: ");
	                    String grade = scanner.nextLine();

	                    Students newStudent = new Students(name, rollNumber, grade);
	                    sms.addStudent(newStudent);
	                    System.out.println("Student added.");
	                    break;

	                case 2:
	                    System.out.print("Enter roll number of student to remove: ");
	                    int rollToRemove = scanner.nextInt();
	                    boolean removed = sms.removeStudent(rollToRemove);
	                    if (removed) {
	                        System.out.println("Student removed.");
	                    } else {
	                        System.out.println("Student not found.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter roll number of student to search: ");
	                    int rollToSearch = scanner.nextInt();
	                    Students searchedStudent = sms.searchStudent(rollToSearch);
	                    if (searchedStudent != null) {
	                        System.out.println("Student found:");
	                        System.out.println(searchedStudent);
	                    } else {
	                        System.out.println("Student not found.");
	                    }
	                    break;

	                case 4:
	                    List<Students> allStudents = sms.getAllStudents();
	                    if (allStudents.isEmpty()) {
	                        System.out.println("No students to display.");
	                    } else {
	                        System.out.println("All Students:");
	                        for (Students student : allStudents) {
	                            System.out.println(student);
	                        }
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	                    break;
	            }
	        }
	    }
	}
	

	


