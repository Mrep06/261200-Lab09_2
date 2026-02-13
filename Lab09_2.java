package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Lab09_2 {
    public static void main(String[] args) {
        // 1. กลุ่มที่เคลื่อนที่ได้ทั้งหมด (Polymorphism)
        List<Moveable> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Penguin());
        birds.add(new Eagle());
        birds.add(new Ostrich());

        System.out.println("--- All Birds Moving ---");
        for (Moveable bird : birds) {
            bird.move(); // ทุกตัวแทนที่ Moveable ได้อย่างไร้ปัญหา (LSP Success)
        }

        // 2. กลุ่มที่บินได้เท่านั้น
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Sparrow());
        flyingBirds.add(new Eagle());

        System.out.println("\n--- Flying Birds Only ---");
        for (Flyable fb : flyingBirds) {
            fb.fly();
        }
    }
}