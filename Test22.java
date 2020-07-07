package Test22;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Test22 {

    private String name;
    private int age;
    private List<String> favoriteBooks;

    public Test22() {
        this ("Farhad ", 31, Collections.singletonList("books"));
    }

    public Test22(String name, int age, List<String> favoriteBooks) {
        this.name = name;
        this.age = age;
        this.favoriteBooks = favoriteBooks;
    }

    public Test22(Test22 original) {
        if (original == null) {
            System.out.println("Error: null Test22 objet");
            System.exit(0);
        }
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(List<String> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }
    public void setTest22(String name, int age, List<String> favoriteBooks) {
    setName(name);
    setAge(age);
    setFavoriteBooks(favoriteBooks);
    }

    private static Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
            outputStrm.writeObject(object);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    }