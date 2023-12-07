package com.example.test.TestType;

public class TestType {

    public static void main(String[] args) {
        Instruction<?> dogIns = new Instruction<>(new Dog());
        judgmentType((Animal) dogIns.getAnimal());
    }

    static void judgmentType(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("this is a dog");
        } else if (animal instanceof Cat) {
            System.out.println("this is a cat");
        } else {
            System.out.println("don't know what this is");
        }
    }

    static class Instruction<T> {
        private final T animal;

        public Instruction(T animal) {
            this.animal = animal;
        }

        public T getAnimal() {
            return animal;
        }
    }

    static class Animal {
        private String name;
        private int month;

        public Animal() {

        }

        public String getName() {
            return name;
        }

        public int getMonth() {
            return month;
        }

        public void eat() {
            System.out.println("动物在吃饭");
        }
    }

    static class Dog extends Animal {
        public void eat() {
            System.out.println("小狗在吃饭");
        }
    }

    static class Cat extends Animal {
        public void eat() {
            System.out.println("小猫在吃饭");
        }
    }
}