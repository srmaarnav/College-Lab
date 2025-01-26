import java.io.*;
import java.util.Scanner;

public class StudentManagementSystem {
    
    // Student class to represent a student
    static class Student {
        private int id;
        private String name;
        private int grade;

        public Student(int id, String name, int grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    insertStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    getStudentGrade(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void displayMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Insert Student");
        System.out.println("2. Display Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Get Student Grade");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice: ");
    }

    private static void insertStudent(Scanner scanner) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            System.out.print("\n\nEnter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Student student = new Student(id, name, grade);
            writeStudent(raf, student);
            System.out.println("Student added successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void writeStudent(RandomAccessFile raf, Student student) throws IOException {
        raf.writeInt(student.getId());
        raf.writeUTF(student.getName());
        raf.writeInt(student.getGrade());
    }

    private static void displayStudents() {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            System.out.println("\nList of Students:");
            while (raf.getFilePointer() < raf.length()) {
                Student student = readStudent(raf);
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Grade: " + student.getGrade());
            }
        } catch (IOException e) {
            // System.out.println("Error: " + e.getMessage());
        }
    }

    private static Student readStudent(RandomAccessFile raf) throws IOException {
        int id = raf.readInt();
        String name = raf.readUTF();
        int grade = raf.readInt();
        return new Student(id, name, grade);
    }

    private static void updateStudent(Scanner scanner) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            System.out.print("Enter student ID to update: ");
            int idToUpdate = scanner.nextInt();
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                long currentPosition = raf.getFilePointer();
                Student student = readStudent(raf);

                if (student.getId() == idToUpdate) {
                    System.out.print("Enter new grade: ");
                    int newGrade = scanner.nextInt();
                    student.setGrade(newGrade);
                    raf.seek(currentPosition); // Move pointer back to the position of the student
                    writeStudent(raf, student); // Update student record
                    System.out.println("Student grade updated successfully.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student ID not found.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteStudent(Scanner scanner) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            System.out.print("Enter student ID to delete: ");
            int idToDelete = scanner.nextInt();
            File tempFile = new File("temp.dat");
            try (RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw")) {
                boolean found = false;

                while (raf.getFilePointer() < raf.length()) {
                    Student student = readStudent(raf);
                    if (student.getId() != idToDelete) {
                        writeStudent(tempRaf, student); // Write to temp file if not deleting
                    } else {
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Student ID not found.");
                }

                // Replace the original file with the temp file
                raf.setLength(0); // Clear the original file
                tempRaf.seek(0); // Move to the beginning of the temp file
                while (tempRaf.getFilePointer() < tempRaf.length()) {
                    raf.writeInt(tempRaf.readInt());
                    raf.writeUTF(tempRaf.readUTF());
                    raf.writeInt(tempRaf.readInt());
                }
            }
            tempFile.delete(); // Delete the temp file
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void getStudentGrade(Scanner scanner) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            System.out.print("Enter student ID to get grade: ");
            int idToFind = scanner.nextInt();
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                Student student = readStudent(raf);
                if (student.getId() == idToFind) {
                    System.out.println("Grade of student " + student.getName() + " (ID: " + student.getId() + ") is: " + student.getGrade());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student ID not found.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}