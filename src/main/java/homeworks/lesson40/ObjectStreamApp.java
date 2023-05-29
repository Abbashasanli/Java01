package homeworks.lesson40;

import java.io.*;

public class ObjectStreamApp {
    public static final String RESOURCE = "src/main/java/homeworks/lesson40/resource/";

    public static void main(String[] args) {
        Student abbas = new Student(20, "Abbas", 73);
        String studentFile = RESOURCE + "students.ser";
        try {
            FileOutputStream fos = new FileOutputStream(studentFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(abbas);
            oos.close();
            bos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream(studentFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object object = ois.readObject();
            if (object instanceof Student) {
               Student student= (Student) object;
                System.out.println(student);
            }

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
