package oop.lsp;

// LSP Compliance: Penguin only implements Moveable.
// It is not forced to implement fly(), avoiding UnsupportedOperationExceptions.
public class Penguin implements Moveable {
    @Override
    public void move() {
        System.out.println("Penguin is swimming in the ocean.");
    }
    // ไม่มีการ implement fly() เพราะเพนกวินบินไม่ได้ (เคารพกฎ LSP)
}